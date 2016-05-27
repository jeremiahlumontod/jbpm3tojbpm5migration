package com.migration.main;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


import com.jbpm5processdoc.conditionExpressionType;

public class TransitionBuilder {

    
    com.jbpm3processdoc.jbpm3processdoc2 doc3;
    com.jbpm3processdocgpd.jbpm3processdocgpd2 doc3gpd;
    com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc;
    com.jbpm5processdoc.definitionsType definitions;
    com.jbpm5processdoc.processType processtype;
    com.jbpm5processdoc.BPMNDiagramType bpmndiagram;
    com.jbpm5processdoc.BPMNPlaneType bpmnplane;
    String strNodeName = "";
    String strID = "";
    static int intID = 0;
    static Vector oTransitions = new Vector();
    static Vector oTransitionsPerNode = new Vector();
    static Vector oTransitionsProcessed = new Vector();
    static Vector oNodeIDFromJBPM5Model = new Vector();
    Node oDstNode;
    Node oPerNode;
    int newid = 0;
    
    Vector vNodesThatTransits = new Vector();
    
    public void buildTransitions(com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc, com.jbpm3processdoc.jbpm3processdoc2 doc3, com.jbpm3processdocgpd.jbpm3processdocgpd2 doc3gpd) throws TransformerConfigurationException, TransformerException {
        this.doc3 = doc3;
        this.doc3gpd = doc3gpd;
        this.jbpm5Doc = jbpm5Doc;
        intID = 0;
        initIDValue(jbpm5Doc.getNode());
        buildRecursively(doc3gpd.getNode());
        
        //String strjbpm5Doc = buffer.toString();
		//System.out.println("results\n" + strjbpm5Doc);
        
        //dump xml string
        TransformerFactory transformerFactory;
        Transformer transformer = null;
        transformerFactory = TransformerFactory.newInstance();
        try {
            transformer = transformerFactory.newTransformer();
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(TransitionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
        DOMSource source = new DOMSource(this.jbpm5Doc.getNode());
        StringWriter buffer = new StringWriter();
        PrintWriter out = new PrintWriter(buffer);
        javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
        try {
            transformer.transform(source, result);
        } catch (TransformerException ex) {
            Logger.getLogger(TransitionBuilder.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String results = buffer.toString();
//        System.out.println("results\n" + results);
        //end, dump xml string     
        
    }
    
    
    public static boolean nodeProcessed(String tstrNodeName) {
        for (int i = 0; i < oTransitionsProcessed.size(); i++) {
            String str = (String) oTransitionsProcessed.get(i);
            if(str.equals(tstrNodeName)) {
                return true;
            }
        }
        return false;
    }
    
    public void buildRecursively(Node node) throws TransformerConfigurationException, TransformerException {

        int dummy;
        dummy = 0;

        //get a reference to all the objects here
        Iterator itdefinition = jbpm5Doc.definitions.iterator();
        if(!itdefinition.hasNext()) {
            return;
        }
        com.jbpm5processdoc.definitionsType definition = (com.jbpm5processdoc.definitionsType) itdefinition.next();
        
        Iterator itprocess = definition.process.iterator();
        if(!itprocess.hasNext()) {
            return;
        }
        com.jbpm5processdoc.processType process = (com.jbpm5processdoc.processType) itprocess.next();
        
        Iterator itbpmndiagram = definition.BPMNDiagram.iterator();
        if(!itbpmndiagram.hasNext()) {
            return;
        }
        com.jbpm5processdoc.BPMNDiagramType bpmndiagram = (com.jbpm5processdoc.BPMNDiagramType) itbpmndiagram.next();

        Iterator itbpmnplane = bpmndiagram.BPMNPlane.iterator();
        if(!itbpmnplane.hasNext()) {
            return;
        }
        com.jbpm5processdoc.BPMNPlaneType bpmnplane = (com.jbpm5processdoc.BPMNPlaneType) itbpmnplane.next();
       
        
        // get all child nodes
        NodeList list = node.getChildNodes();
        //reset our flag of processed nodes
        oTransitionsProcessed.removeAllElements();
        
        for (int i = 0; i < list.getLength(); i++) {

            //get child node
            Node childNode = list.item(i);

            if (childNode.getNodeName().equals("node")) {

                String strCurrentNodeNameToProcess = getAttributeValue("name", childNode);
                
                //record this node name, we should not process same node name more than once
                if (!nodeProcessed(strCurrentNodeNameToProcess)) {

                    oTransitionsProcessed.add(strCurrentNodeNameToProcess);
                    
                    
                    //clear container
                    //oTransitions.removeAllElements();
                    vNodesThatTransits.removeAllElements();
                    //get all transitions for this node, result will be in oTransitions object
                    //getAllTransitions(doc3.getNode(), strCurrentNodeNameToProcess);
                    //get all transitions for this node, result will be in vNodesThatTransits Vector object
                    //this means pick all nodes that transits / routes to strCurrentNodeNameToProcess
                    getAllNodesThatTransits(doc3.getNode(), strCurrentNodeNameToProcess);
                    
                    
                    //if we picked up something...proceed
                    if (vNodesThatTransits.size() > 0) {
                        
                        if (vNodesThatTransits.size() == 1) {

                            NodesThatTransit nodeTransitSource = (NodesThatTransit) vNodesThatTransits.get(0);
                            String strTransitSource = getAttributeValue("name", nodeTransitSource.getNode());
                            
                            oNodeIDFromJBPM5Model.removeAllElements();
                            //then execute method that pick nodes...list will be in oNodeIDFromJBPM5Model
                            getNodeIDFromJBPM5Model(jbpm5Doc.getNode(), strTransitSource);
                            JBPM5Node jbpm5node;

                            int x = 0, y = 0, srcx = 0, srcy = 0, width = 0, height = 0;
                            int dstx = 0, dsty = 0;
                            String strJBPM5IDSrc = "",strJBPM5IDDst = "";
                            
                            if(oNodeIDFromJBPM5Model.size()>0) {
                                
                                //pick the id from jbpm5 model
                                jbpm5node = (JBPM5Node) oNodeIDFromJBPM5Model.get(0);
                                strJBPM5IDSrc = jbpm5node.getStrID();
                                
                                //now fetch the node from source jbpm3 model so we can have the 
                                //x,y,width,heigth of the source node. such data will be use
                                //to compute the x and y start and end coordinates of the arrow
                                //x,y,width,heigth can be obtain from jbpm3 gpd
                                oDstNode = null;
                                //use the picked up element name to fetch target node
                                getNode(doc3gpd.getNode(), strTransitSource);

                                //this is a computation of coordinates of points for arrows
                                //x,y,width,heigth
                                
                                if (oDstNode != null) {

                                    x = Integer.valueOf(getAttributeValue("x", oDstNode));
                                    y = Integer.valueOf(getAttributeValue("y", oDstNode));
                                    width = Integer.valueOf(getAttributeValue("width", oDstNode));
                                    height = Integer.valueOf(getAttributeValue("height", oDstNode));

                                }
                                
                                if (Math.abs(x) > 0 && Math.abs(y) > 0) {
                                    //srcx and srcy is the starting points of the arrow
                                    //width / 2 gives us the center x, heigth / 2 gives us the center y
                                    //so if we have x,y and we know its width and heigth...to get the center of the object
                                    //which is suppose to be the plotting point of the coordinates...we divide the width by 2
                                    //and add it to its x, we then divide the heigth by 2 and add it to y
                                    srcx = x + width / 2;
                                    srcy = y + height / 2;
                                }
                                
                                
                                //get id from jbpm5 model for the destination node of arrow
                                oNodeIDFromJBPM5Model.removeAllElements();
                                getNodeIDFromJBPM5Model(jbpm5Doc.getNode(), strCurrentNodeNameToProcess);
                                
                                if(oNodeIDFromJBPM5Model.size()>0) {
                                    
                                    jbpm5node = (JBPM5Node) oNodeIDFromJBPM5Model.get(0);
                                    strJBPM5IDDst = jbpm5node.getStrID();

                                    x = Integer.valueOf(getAttributeValue("x", childNode));
                                    y = Integer.valueOf(getAttributeValue("y", childNode));
                                    width = Integer.valueOf(getAttributeValue("width", childNode));
                                    height = Integer.valueOf(getAttributeValue("height", childNode));
                                    
                                }
                                
                                if (Math.abs(x) > 0 && Math.abs(y) > 0) {
                                    //dstx and dsty is the ending points of the arrow
                                    dstx = x + width / 2;
                                    dsty = y + height / 2;
                                }
                                
                            }

                            //we have the complete information for plotting the arrows, lets do it
                            if (Math.abs(srcx) > 0 && Math.abs(srcy) > 0 && Math.abs(dstx) > 0 && Math.abs(dsty) > 0) {

                                //add sequence flow here
                            	com.jbpm5processdoc.sequenceFlowType seq = process.sequenceFlow.append();
                                seq.id.setValue(strJBPM5IDSrc + "-" + strJBPM5IDDst);
                                seq.sourceRef.setValue(strJBPM5IDSrc);
                                seq.targetRef.setValue(strJBPM5IDDst);
                                //check if jbpm5 model node is a diverging gateway, if it is, add a child node "conditionExpression"
                                if (nodeTransitSource.getNode().getNodeName().equals("decision")) {
                                	com.jbpm5processdoc.conditionExpressionType conditiontype = seq.conditionExpression.append();
                                    conditiontype.type.setValue("tFormalExpression");
                                }

                                //now add the object for bpmn diagram
                                com.jbpm5processdoc.BPMNEdgeType bpmnedge = bpmnplane.BPMNEdge.append();
                                bpmnedge.bpmnElement.setValue(strJBPM5IDSrc + "-" + strJBPM5IDDst);
                                com.jbpm5processdoc.waypointType waypointsrc = bpmnedge.waypoint.append();
                                waypointsrc.x.setValue(srcx);
                                waypointsrc.y.setValue(srcy);
                                com.jbpm5processdoc.waypointType waypointdst = bpmnedge.waypoint.append();
                                waypointdst.x.setValue(dstx);
                                waypointdst.y.setValue(dsty);
                            }
                            
                        } else if (vNodesThatTransits.size() > 1) {
                            
                            //current node has multiple incoming. jbpm5 only allows multiple incoming
                            //for a converging gateway. create a gateway beside the current node...
                            int xgateway = 0, ygateway = 0, widthgateway = 0, heightgateway = 0, xcentergateway = 0, ycentergateway = 0;
                            oDstNode = null;
                            //use the picked up element name to fetch target node
                            getNode(doc3gpd.getNode(), strCurrentNodeNameToProcess);                           
                            int refnodex = Integer.valueOf(getAttributeValue("x", oDstNode));
                            int refnodey = Integer.valueOf(getAttributeValue("y", oDstNode));
                            int refnodewidth = Integer.valueOf(getAttributeValue("width", oDstNode));
                            int refnodeheight = Integer.valueOf(getAttributeValue("height", oDstNode));
                            
                            int x = 0, y = 0, srcx = 0, srcy = 0, width = 0, height = 0;
                            int dstx = 0, dsty = 0;              
                            
                            JBPM5Node jbpm5node;
                            
                            String strJBPM5IDSrc = "", strJBPM5IDDst = "";
                            
                            //x and y values for gateway
                            //xgateway = refnodex + 850;
                            xgateway = refnodex;
                            ygateway = refnodey;
                            widthgateway = 48;
                            heightgateway = 48;
                            //arrows going to gateway should use this points as refence
                            xcentergateway = xgateway + (widthgateway / 2);
                            ycentergateway = ygateway + (heightgateway / 2);
                            com.jbpm5processdoc.exclusiveGatewayType gateway = process.exclusiveGateway.append();
                            String strgatewayNewID = "_" + String.valueOf(getID());
                            gateway.id.setValue(strgatewayNewID);
                            gateway.name.setValue("Gateway-"+strCurrentNodeNameToProcess);
                            gateway.gatewayDirection.setValue("Converging");
                            com.jbpm5processdoc.BPMNShapeType gatewayshape = bpmnplane.BPMNShape.append();
                            gatewayshape.bpmnElement.setValue(strgatewayNewID);
                            com.jbpm5processdoc.BoundsType gatewayshapebounds =gatewayshape.Bounds.append();
                            gatewayshapebounds.x.setValue(xgateway);
                            gatewayshapebounds.y.setValue(ygateway);
                            gatewayshapebounds.width.setValue(widthgateway);
                            gatewayshapebounds.height.setValue(heightgateway);
                            
                            //add to shape
//                            com.jbpm5processdoc.BPMNShapeType bpmnshape = bpmnplane.BPMNShape.append();
//                            bpmnshape.bpmnElement.setValue(strgatewayNewID);
//                            com.jbpm5processdoc.BoundsType bounds = bpmnshape.Bounds.append();
//                            bounds.x.setValue(Integer.valueOf(xgateway));
//                            bounds.y.setValue(Integer.valueOf(ygateway));
//                            bounds.width.setValue(Integer.valueOf(widthgateway));
//                            bounds.height.setValue(Integer.valueOf(heightgateway));    
                                    
                            for (int m = 0; m < vNodesThatTransits.size(); m++) {

                                NodesThatTransit nodeTransitSource = (NodesThatTransit) vNodesThatTransits.get(m);
                                String strTransitSource = getAttributeValue("name", nodeTransitSource.getNode());

                                oNodeIDFromJBPM5Model.removeAllElements();
                                //then execute method that pick nodes...list will be in oNodeIDFromJBPM5Model
                                getNodeIDFromJBPM5Model(jbpm5Doc.getNode(), strTransitSource);

                                if (oNodeIDFromJBPM5Model.size() > 0) {

                                    //pick the id from jbpm5 model
                                    //considering a user defined node name is unique...
                                    //we will assume that this will always get an array with one entry
                                    jbpm5node = (JBPM5Node) oNodeIDFromJBPM5Model.get(0);
                                    strJBPM5IDSrc = jbpm5node.getStrID();

                                    //now fetch the node from source jbpm3 model so we can have the 
                                    //x,y,width,heigth of the source node. such data will be use
                                    //to compute the x and y start and end coordinates of the arrow
                                    //x,y,width,heigth can be obtain from jbpm3 gpd
                                    oDstNode = null;
                                    //use the picked up element name to fetch target node
                                    getNode(doc3gpd.getNode(), strTransitSource);

                                    //this is a computation of coordinates of points for arrows
                                    //x,y,width,heigth

                                    if (oDstNode != null) {

                                        x = Integer.valueOf(getAttributeValue("x", oDstNode));
                                        y = Integer.valueOf(getAttributeValue("y", oDstNode));
                                        width = Integer.valueOf(getAttributeValue("width", oDstNode));
                                        height = Integer.valueOf(getAttributeValue("height", oDstNode));

                                    }

                                    if (Math.abs(x) > 0 && Math.abs(y) > 0) {
                                        //srcx and srcy is the starting points of the arrow
                                        //width / 2 gives us the center x, heigth / 2 gives us the center y
                                        //so if we have x,y and we know its width and heigth...to get the center of the object
                                        //which is suppose to be the plotting point of the coordinates...we divide the width by 2
                                        //and add it to its x, we then divide the heigth by 2 and add it to y
                                        srcx = x + width / 2;
                                        srcy = y + height / 2;
                                    }


                                    //get id from jbpm5 model for the destination node of arrow
                                    oNodeIDFromJBPM5Model.removeAllElements();
                                    getNodeIDFromJBPM5Model(jbpm5Doc.getNode(), strCurrentNodeNameToProcess);

                                    if (oNodeIDFromJBPM5Model.size() > 0) {
                                        //considering a user defined node name is unique...
                                        //we will assume that this will always get an array with one entry
                                        jbpm5node = (JBPM5Node) oNodeIDFromJBPM5Model.get(0);
                                        strJBPM5IDDst = jbpm5node.getStrID();

                                        x = Integer.valueOf(getAttributeValue("x", childNode));
                                        y = Integer.valueOf(getAttributeValue("y", childNode));
                                        width = Integer.valueOf(getAttributeValue("width", childNode));
                                        height = Integer.valueOf(getAttributeValue("height", childNode));

                                    }

                                    if (Math.abs(x) > 0 && Math.abs(y) > 0) {
                                        //dstx and dsty is the ending points of the arrow
                                        dstx = x + width / 2;
                                        dsty = y + height / 2;
                                    }

                                }

                                //we have the complete information for plotting the arrows, lets do it
                                if (Math.abs(srcx) > 0 && Math.abs(srcy) > 0 && Math.abs(dstx) > 0 && Math.abs(dsty) > 0) {

                                    //add sequence flow here
                                	com.jbpm5processdoc.sequenceFlowType seq = process.sequenceFlow.append();
                                    //seq.id.setValue(strJBPM5IDSrc + "-" + strJBPM5IDDst);
                                    seq.id.setValue(strJBPM5IDSrc + "-" + strgatewayNewID);
                                    seq.sourceRef.setValue(strJBPM5IDSrc);
                                    //seq.targetRef.setValue(strJBPM5IDDst);
                                    seq.targetRef.setValue(strgatewayNewID);
                                    //check if jbpm5 model node is a diverging gateway, if it is, add a child node "conditionExpression"
                                    if (nodeTransitSource.getNode().getNodeName().equals("decision")) {
                                    	com.jbpm5processdoc.conditionExpressionType conditiontype = seq.conditionExpression.append();
                                        conditiontype.type.setValue("tFormalExpression");
                                    }
                                
                                    //now add the object for bpmn diagram. all gateways will have 3 points
                                    //so that we will have standard way of plotting points
                                    com.jbpm5processdoc.BPMNEdgeType gatewayedge = bpmnplane.BPMNEdge.append();
                                    gatewayedge.bpmnElement.setValue(strJBPM5IDSrc + "-" + strgatewayNewID);
                                    com.jbpm5processdoc.waypointType waypointsrc = gatewayedge.waypoint.append();
                                    waypointsrc.x.setValue(srcx);
                                    waypointsrc.y.setValue(srcy);
                                    //com.jbpm5processdoc.waypointType waypointmid = gatewayedge.waypoint.append();
                                    //waypointmid.x.setValue(xcentergateway);
                                    //waypointmid.y.setValue(srcy);                                    
                                    com.jbpm5processdoc.waypointType waypointdst = gatewayedge.waypoint.append();
                                    waypointdst.x.setValue(xcentergateway);
                                    waypointdst.y.setValue(ycentergateway);
                                    
                                }
                            
                            }

                            //from gateway to current node
                            //get id from jbpm5 model for the destination node of arrow
                            oNodeIDFromJBPM5Model.removeAllElements();
                            getNodeIDFromJBPM5Model(jbpm5Doc.getNode(), strCurrentNodeNameToProcess);
                            if (oNodeIDFromJBPM5Model.size() > 0) {
                                //considering a user defined node name is unique...
                                //we will assume that this will always get an array with one entry
                                jbpm5node = (JBPM5Node) oNodeIDFromJBPM5Model.get(0);
                                strJBPM5IDDst = jbpm5node.getStrID();

                                x = Integer.valueOf(getAttributeValue("x", childNode));
                                y = Integer.valueOf(getAttributeValue("y", childNode));
                                width = Integer.valueOf(getAttributeValue("width", childNode));
                                height = Integer.valueOf(getAttributeValue("height", childNode));

                            }                            
                            
                            if (Math.abs(x) > 0 && Math.abs(y) > 0) {

                                srcx = x + width / 2;
                                srcy = y + height / 2;
                                        
                                //add sequence flow here
                                com.jbpm5processdoc.sequenceFlowType seq = process.sequenceFlow.append();
                                //seq.id.setValue(strJBPM5IDSrc + "-" + strJBPM5IDDst);
                                seq.id.setValue(strgatewayNewID + "-" + strJBPM5IDDst);
                                seq.sourceRef.setValue(strgatewayNewID);
                                //seq.targetRef.setValue(strJBPM5IDDst);
                                seq.targetRef.setValue(strJBPM5IDDst);
                                //check if jbpm5 model node is a diverging gateway, if it is, add a child node "conditionExpression"
                                NodesThatTransit nodeTransitSource = (NodesThatTransit) vNodesThatTransits.get(vNodesThatTransits.size()-1);
                                String strNodeType = nodeTransitSource.getNode().getNodeName().equals("exclusiveGateway") ? "conditionExpression" : nodeTransitSource.getNode().getNodeName();
                                String strGatewayType = getAttributeValue("gatewayDirection", nodeTransitSource.getNode());
                                if (strNodeType.equals("conditionExpression") && strGatewayType.equals("Diverging")) {
                                	com.jbpm5processdoc.conditionExpressionType conditiontype = seq.conditionExpression.append();
                                    conditiontype.type.setValue("tFormalExpression");
                                }       
                                
                                //now add the object for bpmn diagram. all gateways will have 3 points
                                //so that we will have standard way of plotting points
                                com.jbpm5processdoc.BPMNEdgeType gatewayedge = bpmnplane.BPMNEdge.append();
                                gatewayedge.bpmnElement.setValue(strgatewayNewID + "-" + strJBPM5IDDst);
                                com.jbpm5processdoc.waypointType waypointsrc = gatewayedge.waypoint.append();
                                waypointsrc.x.setValue(xcentergateway);
                                waypointsrc.y.setValue(ycentergateway);
                                com.jbpm5processdoc.waypointType waypointmid = gatewayedge.waypoint.append();
                                waypointmid.x.setValue(srcx);
                                waypointmid.y.setValue(srcy);

                                    
                            }
                            
                        }

                    }

                }

            }


            // visit child node
            buildRecursively(childNode);

        }
        
    }

    
    private static String getID(Node node, String tstrNodeUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String strNodeUserDefinedName = getAttributeValue("name", childNode);
                if (strNodeUserDefinedName.equals(tstrNodeUserDefinedName)) {
                    NamedNodeMap attributes = node.getAttributes();
                    for (int a = 0; a < attributes.getLength(); a++) {
                        Node theAttribute = attributes.item(a);
                        // System.out.println(theAttribute.getNodeName() + "=" +
                        // theAttribute.getNodeValue());
                        if (theAttribute.getNodeName().equals("id")) {
                            return theAttribute.getNodeValue();
                        }
                    }
        
                }
            }
            getID(childNode, tstrNodeUserDefinedName);
        }
        
        return "";

    }
    
    
    private static String getAttributeValue(String attr, Node node) {

        NamedNodeMap attributes = node.getAttributes();
        for (int a = 0; a < attributes.getLength(); a++) {
            Node theAttribute = attributes.item(a);
            // System.out.println(theAttribute.getNodeName() + "=" +
            // theAttribute.getNodeValue());
            if (theAttribute.getNodeName().equals(attr)) {
                return theAttribute.getNodeValue();
            }
        }

        return "";

    }

    
    private static void getAttributesValue(String attr, Node node) {

        NamedNodeMap attributes = node.getAttributes();
        for (int a = 0; a < attributes.getLength(); a++) {
            Node theAttribute = attributes.item(a);
            // System.out.println(theAttribute.getNodeName() + "=" +
            // theAttribute.getNodeValue());
            if (theAttribute.getNodeName().equals(attr)) {
                oTransitions.addElement(theAttribute.getNodeValue());
            }
        }


    }
    
    private void getAttributesValueJBPM5Model(String tstrNodeName, String attr, Node node) {

        NamedNodeMap attributes = node.getAttributes();
        for (int a = 0; a < attributes.getLength(); a++) {
            Node theAttribute = attributes.item(a);
            if (theAttribute.getNodeName().equals(attr)) {
                oNodeIDFromJBPM5Model.addElement(new JBPM5Node(theAttribute.getNodeValue(),tstrNodeName));
            }
        }
    }
    
    
    
    private void getNodeIDFromJBPM5Model(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String strUserDefinedName = getAttributeValue("name", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    //result will be saved in oNodeIDFromJBPM5Model object
                    getAttributesValueJBPM5Model(tstrUserDefinedName,"id", childNode);
                }
            }

            getNodeIDFromJBPM5Model(childNode, tstrUserDefinedName);

        }

    }
    
    
    private static void getTransitionValuePerNode(String attr, Node node) {

        NamedNodeMap attributes = node.getAttributes();
        for (int a = 0; a < attributes.getLength(); a++) {
            Node theAttribute = attributes.item(a);
            // System.out.println(theAttribute.getNodeName() + "=" +
            // theAttribute.getNodeValue());
            if (theAttribute.getNodeName().equals(attr)) {
                oTransitionsPerNode.addElement(theAttribute.getNodeValue());
            }
        }


    }
    
    
    public void getNodeName(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String internalname = getAttributeValue("name", childNode);
                if (tstrUserDefinedName.equals(internalname)) {
                    strNodeName = childNode.getNodeName();
                    break;
                }
            }
            getNodeName(childNode, tstrUserDefinedName);
        }

    }

    public void getAllTransitions(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE && childNode.getNodeName().equals("transition")) {
                String strUserDefinedName = getAttributeValue("to", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    //result will be saved in oTransitions object
                    getAttributesValue("to", childNode);
                }
            }

            getAllTransitions(childNode, tstrUserDefinedName);

        }

    }

    public void getAllNodesThatTransits(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE && childNode.getNodeName().equals("transition")) {
                String strUserDefinedName = getAttributeValue("to", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    NodesThatTransit nodethattransits = new NodesThatTransit(childNode.getParentNode());
                    vNodesThatTransits.add(nodethattransits);
                }
            }

            getAllNodesThatTransits(childNode, tstrUserDefinedName);

        }

    }
    
    private class NodesThatTransit {
        private Node node;

        public NodesThatTransit(Node node) {
            this.node = node;
        }

        public Node getNode() {
            return node;
        }

        public void setNode(Node node) {
            this.node = node;
        }
        
    }
    
    
    
    public void getTransitionsPerNode(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String strUserDefinedName = getAttributeValue("name", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    strNodeName = childNode.getNodeName();
                }else{
                    strNodeName = "";
                }
            }
            
            if (childNode.getNodeType() == Node.ELEMENT_NODE && strNodeName.length()>0) {
                //fetch all transitions and save to container 
                getTransitionValuePerNode("to", childNode);
            }
            
            getTransitionsPerNode(childNode, tstrUserDefinedName);
            
        }

    }
    
    
    
    public void getNode(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String strUserDefinedName = getAttributeValue("name", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    oDstNode = childNode;
                    break;
                }
            }
            
            getNode(childNode, tstrUserDefinedName);
            
        }

    }    
    
    public void getPerNode(Node node, String tstrUserDefinedName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String strUserDefinedName = getAttributeValue("name", childNode);
                if (tstrUserDefinedName.equals(strUserDefinedName)) {
                    oPerNode = childNode;
                    break;
                }
            }
            
            getPerNode(childNode, tstrUserDefinedName);
            
        }

    }   
    
    public int getTransitionCount(Node node, String tstrUserDefinedName){
        
        int cnt = 0;
        // get all child nodes
        NodeList list = node.getChildNodes();
        for (int i = 0; i < list.getLength(); i++) {
            Node childNode = list.item(i);
            if(childNode.getNodeName().equals("transition")) {
                cnt++;
            }
        }
        return cnt;
        
    }
    
    public static int getID() {
        intID++;
        return intID;
    }
    
    
    private class JBPM5Node {
        String strID;
        String strName;
        String strNodeType;

        public JBPM5Node(String strID, String strName) {
            this.strID = strID;
            this.strName = strName;
        }

        public JBPM5Node(String strID, String strName, String strNodeType) {
            this.strID = strID;
            this.strName = strName;
            this.strNodeType = strNodeType;
        }

        public String getStrID() {
            return strID;
        }

        public void setStrID(String strID) {
            this.strID = strID;
        }

        public String getStrName() {
            return strName;
        }

        public void setStrName(String strName) {
            this.strName = strName;
        }

        public String getStrNodeType() {
            return strNodeType;
        }

        public void setStrNodeType(String strNodeType) {
            this.strNodeType = strNodeType;
        }
        
        
    }
    
    private void getNewID(Node node) {
        
        int id = 0;
        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";
            
            if (!childNode.getNodeName().equals("BPMNEdge") && !childNode.getNodeName().equals("sequenceFlow")) {

                if (childNode.getNodeType() == Node.ELEMENT_NODE) {

                    NamedNodeMap attributes = childNode.getAttributes();
                    int attrLength = 0;
                    try {
                        attrLength = attributes.getLength();
                    } catch (Exception e) {
                        attrLength = 0;
                    }
                    for (int a = 0; a < attrLength; a++) {
                        Node theAttribute = attributes.item(a);
                        if (theAttribute.getNodeName().equals("id")) {
                            //id has underscore at the beginning...we need to pick value beginning from 2nd character
                            int idvalue = Integer.valueOf(theAttribute.getNodeValue().substring(1));
                            if (newid < idvalue) {
                                newid = idvalue;
                                System.out.println("newid: " + newid);
                            }
                        }
                    }

                }
            }
            getNewID(childNode);
        }
        
    }
    
    private void initIDValue(Node node) {

        int id = 0;
        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";

            if (!childNode.getNodeName().equals("BPMNEdge") && !childNode.getNodeName().equals("sequenceFlow")) {

                if (childNode.getNodeType() == Node.ELEMENT_NODE) {

                    NamedNodeMap attributes = childNode.getAttributes();
                    int attrLength = 0;
                    try {
                        attrLength = attributes.getLength();
                    } catch (Exception e) {
                        attrLength = 0;
                    }
                    for (int a = 0; a < attrLength; a++) {
                        Node theAttribute = attributes.item(a);
                        if (theAttribute.getNodeName().equals("id")) {
                            //id has underscore at the beginning...we need to pick value beginning from 2nd character
                            int idvalue = Integer.valueOf(theAttribute.getNodeValue().substring(1));
                            if (intID < idvalue) {
                                intID = idvalue;
                                //System.out.println("intID: " + intID);
                            }
                        }
                    }

                }
            }
            initIDValue(childNode);
        }

    }
        
    private void showDocContent(Node node) throws TransformerConfigurationException, TransformerException {
        TransformerFactory transformerFactory;
        Transformer transformer;
        transformerFactory = TransformerFactory.newInstance();
        transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(node);
        StringWriter buffer = new StringWriter();
        PrintWriter out = new PrintWriter(buffer);
        javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
        transformer.transform(source, result);
        String results = buffer.toString();
        System.out.println("showDocContent results\n" + results);        
    }
}
