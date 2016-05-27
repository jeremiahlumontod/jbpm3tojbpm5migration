package com.migration.main;

import com.jbpm3processdoc.jbpm3processdoc2;
import com.jbpm3processdocgpd.jbpm3processdocgpd2;
import com.jbpm5processdoc.definitionsType;
import com.jbpm5processdoc.jbpm5processdoc2;
import com.jbpm5processdoc.processType;
import com.jbpm5processdoc.xs.stringType;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class NodeBuilder {

    private com.jbpm3processdoc.jbpm3processdoc2 doc3;
    private com.jbpm3processdocgpd.jbpm3processdocgpd2 doc3gpd;
    private com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc;
    private com.jbpm5v2.jbpm5v22 jbpm5DocDst;
    private com.jbpm5processdoc.definitionsType definitions;
    private com.jbpm5processdoc.processType processtype;
    private com.jbpm5processdoc.BPMNDiagramType bpmndiagram;
    private com.jbpm5processdoc.BPMNPlaneType bpmnplane;
    private String strNodeName = "";
    private String strID = "";
    private static int intID = 0;
    private static Vector oTransitions = new Vector();
    private Node oDstNode;
    private static int ctr = 0;
    
    public com.jbpm3processdoc.jbpm3processdoc2 getDoc3() {
        return doc3;
    }

    public com.jbpm3processdocgpd.jbpm3processdocgpd2 getDoc3gpd() {
        return doc3gpd;
    }

    public com.jbpm5processdoc.jbpm5processdoc2 getJbpm5Doc() {
        return jbpm5Doc;
    }


    public NodeBuilder() {
        
        try {

           
//            doc3 = com.jbpm3processdoc.jbpm3processdoc2.createDocument();
//            doc3 = com.jbpm3processdoc.jbpm3processdoc2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/abp/atestmigrate2/processdefinition.xml");
//            
//
//            doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.createDocument();
//            doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/abp/atestmigrate2/gpd.xml");
//
//            jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();
            //doc5 = jbpm5Doc;
            //jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();

//            definitions = jbpm5Doc.definitions.append();
//            processtype = definitions.process.append();
//            processtype.processType2.setValue("Private");
//            processtype.isExecutable.setValue(true);
//
//            bpmndiagram = definitions.BPMNDiagram.append();
//            bpmnplane = bpmndiagram.BPMNPlane.append();

            //parseRecursively(doc3gpd.getNode());
            //buildRecursively(jbpm5Doc, doc3, doc3gpd);
//            buildRecursively(doc3gpd.getNode());

            //dump xml string
//            TransformerFactory transformerFactory;
//            Transformer transformer;
//            transformerFactory = TransformerFactory.newInstance();
//            transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(this.jbpm5Doc.getNode());
//            StringWriter buffer = new StringWriter();
//            PrintWriter out = new PrintWriter(buffer);
//            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//            transformer.transform(source, result);
//            String results = buffer.toString();
//            System.out.println("results\n" + results);
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void buildNode() {
        // load source document

        try {

           
            doc3 = com.jbpm3processdoc.jbpm3processdoc2.createDocument();
            doc3 = com.jbpm3processdoc.jbpm3processdoc2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/bp/Accounts_Payable_Clerk_Adding_Suppliers/processdefinition.xml");
            
            
            doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.createDocument();
            doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/bp/Accounts_Payable_Clerk_Adding_Suppliers/gpd.xml");
            
            jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();
            //doc5 = jbpm5Doc;
            //jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();

            definitions = jbpm5Doc.definitions.append();
            
            processtype = definitions.process.append();
            processtype.processType2.setValue("Private");
            processtype.isExecutable.setValue(true);

            bpmndiagram = definitions.BPMNDiagram.append();
            bpmnplane = bpmndiagram.BPMNPlane.append();

            //parseRecursively(doc3gpd.getNode());
            //buildRecursively(jbpm5Doc, doc3, doc3gpd);
            buildRecursively(doc3gpd.getNode());

            //dump xml string
//            TransformerFactory transformerFactory;
//            Transformer transformer;
//            transformerFactory = TransformerFactory.newInstance();
//            transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(this.jbpm5Doc.getNode());
//            StringWriter buffer = new StringWriter();
//            PrintWriter out = new PrintWriter(buffer);
//            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//            transformer.transform(source, result);
//            String results = buffer.toString();
//            System.out.println("results\n" + results);
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // create the target document

    }
    
    
    public void buildNode(com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc, com.jbpm3processdoc.jbpm3processdoc2 doc3, com.jbpm3processdocgpd.jbpm3processdocgpd2 doc3gpd) {
        // load source document

        try {

           
            this.doc3 = com.jbpm3processdoc.jbpm3processdoc2.createDocument();
            this.doc3 = com.jbpm3processdoc.jbpm3processdoc2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/bp/accountant_Fixed_Asset_Purchase/processdefinition.xml");

            this.doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.createDocument();
            this.doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.loadFromFile("D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/bp/accountant_Fixed_Asset_Purchase/gpd.xml");

            this.jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();
            //doc5 = jbpm5Doc;
            //jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();

            definitions = this.jbpm5Doc.definitions.append();
            processtype = definitions.process.append();
            processtype.processType2.setValue("Private");
            processtype.isExecutable.setValue(true);

            bpmndiagram = definitions.BPMNDiagram.append();
            bpmnplane = bpmndiagram.BPMNPlane.append();

            //parseRecursively(doc3gpd.getNode());
            //buildRecursively(jbpm5Doc, doc3, doc3gpd);
            buildRecursively(this.doc3gpd.getNode());

            String results = jbpm5Doc.saveToString(true);
			System.out.println("results\n" + results);
            
            //dump xml string
//            TransformerFactory transformerFactory;
//            Transformer transformer;
//            transformerFactory = TransformerFactory.newInstance();
//            transformer = transformerFactory.newTransformer();
//            DOMSource source = new DOMSource(this.jbpm5Doc.getNode());
//            StringWriter buffer = new StringWriter();
//            PrintWriter out = new PrintWriter(buffer);
//            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//            transformer.transform(source, result);
//            String results = buffer.toString();
//            System.out.println("results\n" + results);
            
            
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // create the target document

    }



    public void buildRecursively(Node node) {

        int dummy;
        dummy = 0;

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            if (childNode.getNodeName().equals("node")) {
                String x = getAttributeValue("x", childNode);
                String y = getAttributeValue("y", childNode);
                String width = getAttributeValue("width", childNode);
                String height = getAttributeValue("height", childNode);
                String internalname = getAttributeValue("name", childNode);
                strNodeName = ""; //reset to empty
                getNodeName(doc3.getNode(), internalname); //result will be stored in strNodeName var  
                if (strNodeName.length() > 0) {
                    //get unique ID
                    strID = "_" + String.valueOf(getID());
                    if (strNodeName.equals("start-state")) {
                        //create the node
                    	com.jbpm5processdoc.startEventType startevent = processtype.startEvent.append();
                        startevent.id.setValue(strID);
                        startevent.name.setValue(internalname);

                    } else if (strNodeName.equals("end-state")) {
                    	com.jbpm5processdoc.endEventType endevent = processtype.endEvent.append();
                        endevent.id.setValue(strID);
                        endevent.name.setValue(internalname);
                      
                    } else if (strNodeName.equals("decision")) {
                    	com.jbpm5processdoc.exclusiveGatewayType gatewaydiverge = processtype.exclusiveGateway.append();
                        gatewaydiverge.id.setValue(strID);
                        gatewaydiverge.name.setValue(internalname);
                        gatewaydiverge.gatewayDirection.setValue("Diverging");
                      
                    } else if (strNodeName.equals("node") || strNodeName.equals("task-node")) {
                    	com.jbpm5processdoc.userTaskType usertask = processtype.userTask.append();
                        usertask.id.setValue(strID);
                        usertask.name.setValue(internalname);
                        com.jbpm5processdoc.ioSpecificationType iospecs = usertask.ioSpecification.append();
                        com.jbpm5processdoc.inputSetType inputset = iospecs.inputSet.append();
                        com.jbpm5processdoc.outputSetType outputset = iospecs.outputSet.append();
                    
                    }

                    //define x,y,width,height of this node
                    com.jbpm5processdoc.BPMNShapeType bpmnshape = bpmnplane.BPMNShape.append();
                    bpmnshape.bpmnElement.setValue(strID);
                    com.jbpm5processdoc.BoundsType bounds = bpmnshape.Bounds.append();
                    bounds.x.setValue(Integer.valueOf(x));
                    bounds.y.setValue(Integer.valueOf(y));
                    bounds.width.setValue(Integer.valueOf(width));
                    bounds.height.setValue(Integer.valueOf(height));

                    //define transition arrows from source to target node
//                    com.jbpm5processdoc.BPMNEdgeType bpmnedge = bpmnplane.BPMNEdge.append();
//                    int srcx = Integer.valueOf(x) + (Integer.valueOf(width)/2);
//                    int srcy = Integer.valueOf(y) + (Integer.valueOf(height)/2);
                    //now look where is the next node the flow will go
                    //by looking it at the process document
                    //if the source is a decision node, we will replace this with gateway
                    //if the target node is a join node, we will replace this with gateway
                    //if the target node is not a join node, we will create a gateway between
                    //the target and source. all transition to target will be routed to this
                    //new gateway then gateway will route to target node
                    
                    //clear container
//                    oTransitions.removeAllElements();
//                    getAllTransitions(this.doc3.getNode(),internalname);
                    
//                    for(int j = 0; j < oTransitions.size(); j++) {
//                        String strDst = (String) oTransitions.elementAt(j);
//                        getNode(this.doc3gpd.getNode(),strDst);
//                        int dstx = Integer.valueOf(getAttributeValue("x", oDstNode));
//                        int dsty = Integer.valueOf(getAttributeValue("y", oDstNode));
//                        int dstwidth = Integer.valueOf(getAttributeValue("width", oDstNode));
//                        int dstheight = Integer.valueOf(getAttributeValue("height", oDstNode));
//                        strNodeName="";
//                        getNodeName(this.doc3.getNode(), strDst); 
//                        
//                    }
                    
                }

            }


            // visit child node
            buildRecursively(childNode);
        }

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
    
    
    public void getNodeName(Node node, String strInternalName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String internalname = getAttributeValue("name", childNode);
                if (strInternalName.equals(internalname)) {
                    strNodeName = childNode.getNodeName();
                    break;
                }
            }
            getNodeName(childNode, strInternalName);
        }

    }

    public void getAllTransitions(Node node, String strInternalName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String internalname = getAttributeValue("name", childNode);
                if (strInternalName.equals(internalname)) {
                    strNodeName = childNode.getNodeName();
                }
            }
            
            if (childNode.getNodeType() == Node.ELEMENT_NODE && strNodeName.length()>0 && childNode.getNodeName().equals("transition")) {
                //then fetch all transitions and save to container
                getAttributesValue("to", childNode);
                
            }
            
            getAllTransitions(childNode, strInternalName);
            
        }

    }
    
    
    public void getNode(Node node, String strInternalName) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node
            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                String internalname = getAttributeValue("name", childNode);
                if (strInternalName.equals(internalname)) {
                    oDstNode = childNode;
                    break;
                }
            }
            
            getNode(childNode, strInternalName);
            
        }

    }
    
    
    public static int getID() {
        intID++;
        return intID;
    }
    
    public static void resetID() {
        intID = 0;
    }
    
    public static void parseRecursively(Node node) {

        // get all child nodes
        NodeList list = node.getChildNodes();

        for (int i = 0; i < list.getLength(); i++) {

            // get child node

            Node childNode = list.item(i);

            String strType = "";
            if (childNode.getNodeType() == Node.ELEMENT_NODE) {
                strType = "Element";
            } else if (childNode.getNodeType() == Node.ATTRIBUTE_NODE) {
                strType = "Attribute";
            } else if (childNode.getNodeType() == Node.COMMENT_NODE) {
                strType = "Comment";
            } else if (childNode.getNodeType() == Node.DOCUMENT_NODE) {
                strType = "Document node";
            } else if (childNode.getNodeType() == Node.ENTITY_NODE) {
                strType = "Entity node";
            } else if (childNode.getNodeType() == Node.TEXT_NODE) {
                strType = "Text node";
            } else {
                strType = "dunno";
            }

            System.out.println("Found Node name: " + childNode.getNodeName()
                    + ",   Node type: " + strType + ",    value: "
                    + childNode.getNodeValue());

            if (childNode.getNodeName().equals("node")
                    || childNode.getNodeName().equals("start-state")
                    || childNode.getNodeName().equals("end-state")
                    || childNode.getNodeName().equals("task-node")
                    || childNode.getNodeName().equals("decision")) {
                String x = getAttributeValue("x", childNode);
                String y = getAttributeValue("y", childNode);
                String width = getAttributeValue("width", childNode);
                String height = getAttributeValue("height", childNode);

                String internalname = getAttributeValue("name", childNode);
                System.out.println("internalname = " + internalname + ", x = "
                        + x + ",   y = " + y + ", width = " + width
                        + ", height = " + height);
            }
            if (childNode.getNodeName().equals("transition")) {
                String to = getAttributeValue("to", childNode);
                System.out.println("transition = " + to);
            }
            // visit child node
            parseRecursively(childNode);
        }

    }
    
    
    public void buildNode(String tstrjbpm3SrcPath, String tstrjbpm5DstDir) {

        try {

        	File pathNameSrc = new File(tstrjbpm3SrcPath);
        	File pathNameDst = new File(tstrjbpm5DstDir);
        	String[] fileNames = pathNameSrc.list();
        	for (int i = 0; i < fileNames.length; i++) {
        	//for (int i = 0; i < 123; i++) {
        		File f = new File(pathNameSrc.getPath(), fileNames[i]);
        		if(f.getName().equals("Purchasing_Manager_Verifying_All_Items_Have_Standard_Costs")) {
        			int breakhere;
        			breakhere=0;
        		}
        		if (f.isDirectory()) {
        			//System.out.println("directory: " + f.getName() + "  fullpath: " + f.getCanonicalPath() + File.separatorChar + f.getName() + ".bpmn");
        			//String strFN = f.getCanonicalPath() + File.separatorChar + "gpd.xml";
        			//showFileGPD(strFN);
        			//String strFNDst = pathNameDst.getPath() + File.separatorChar + f.getName() + ".bpmn";
        			//System.out.println("strFNDst: " + strFNDst);
        			//String strFN = f.getCanonicalPath() + File.separatorChar + "processdefinition.xml";
        			//showFile(strFN);
        			String strFNGPD = f.getCanonicalPath() + File.separatorChar + "gpd.xml";
        			String strFNProcess =  f.getCanonicalPath() + File.separatorChar + "processdefinition.xml";
        			
        			doc3 = com.jbpm3processdoc.jbpm3processdoc2.createDocument();
					doc3 = com.jbpm3processdoc.jbpm3processdoc2.loadFromFile(strFNProcess);

					doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.createDocument();
					doc3gpd = com.jbpm3processdocgpd.jbpm3processdocgpd2.loadFromFile(strFNGPD);

					jbpm5Doc = com.jbpm5processdoc.jbpm5processdoc2.createDocument();

					definitions = jbpm5Doc.definitions.append();

					processtype = definitions.process.append();
					processtype.processType2.setValue("Private");
					processtype.isExecutable.setValue(true);

					bpmndiagram = definitions.BPMNDiagram.append();
					bpmnplane = bpmndiagram.BPMNPlane.append();

					//build nodes
					buildRecursively(doc3gpd.getNode());
					
					//lets see what we got
					String strjbpm5Doc = jbpm5Doc.saveToString(true);
					System.out.println("strjbpm5Doc results\n" + strjbpm5Doc);					
					
        			//build transitions
					TransitionBuilder tb = new TransitionBuilder();
					tb.buildTransitions(jbpm5Doc,doc3,doc3gpd);
					
					String strTransitions = jbpm5Doc.saveToString(true);
					System.out.println("strTransitions results\n" + strTransitions);
					
					//at this point building the jbpm5 is done so we will open
					//the target bpmn file and modify its contents with what we have
					//lets start fresh
					String strjbpm5FN = pathNameDst.getPath() + File.separatorChar + f.getName() + File.separatorChar + f.getName() + ".bpmn";
					String strjbpm5dstProcName =  pathNameDst.getPath() + File.separatorChar + f.getName() + File.separatorChar + f.getName();
					jbpm5DocDst = Jbpm5Utils.copySrcJbpm5ToTargetJbpm5(jbpm5Doc, jbpm5DocDst, strjbpm5FN, strjbpm5dstProcName);

					jbpm5DocDst.saveToFile(strjbpm5FN, true);
//					String str = jbpm5Doc.saveToString(true);
//					System.out.println("results\n" + str);
					String strcopySrcJbpm5ToTargetJbpm5 = jbpm5DocDst.saveToString(true);
					System.out.println("strcopySrcJbpm5ToTargetJbpm5 results\n" + strcopySrcJbpm5ToTargetJbpm5);

		            //dump xml string
//		            TransformerFactory transformerFactory;
//		            Transformer transformer;
//		            transformerFactory = TransformerFactory.newInstance();
//		            transformer = transformerFactory.newTransformer();
//		            DOMSource source = new DOMSource(this.jbpm5Doc.getNode());
//		            StringWriter buffer = new StringWriter();
//		            PrintWriter out = new PrintWriter(buffer);
//		            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//		            transformer.transform(source, result);
//		            String results = buffer.toString();
//		            System.out.println("results\n" + results);
					
					resetID();
					
        		}
        	}
           
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    

    
	public static void showFile(String tstrFN) {
		
		try {
			
			com.jbpm3processdoc.jbpm3processdoc2 doc = com.jbpm3processdoc.jbpm3processdoc2.createDocument();
			doc = com.jbpm3processdoc.jbpm3processdoc2.loadFromFile(tstrFN);

			ctr++;
			System.out.println("ctr: " + ctr + " tstrFN: " + tstrFN + " loaded");
			
            //dump xml string
//            TransformerFactory transformerFactory;
//            Transformer transformer;            
//            transformerFactory = TransformerFactory.newInstance();
//            transformer = transformerFactory.newTransformer();            
//            DOMSource source = new DOMSource(doc.getNode());
//            StringWriter buffer = new StringWriter(  );
//            PrintWriter out = new PrintWriter(buffer);		
//            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//            transformer.transform(source, result);
//            String results = buffer.toString(  );
//            System.out.println("results\n" + results);            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}    
    
	public static void showFileGPD(String tstrFN) {
		
		try {
			
			
			com.jbpm3processdocgpd.jbpm3processdocgpd2 doc = com.jbpm3processdocgpd.jbpm3processdocgpd2.createDocument();
			doc = com.jbpm3processdocgpd.jbpm3processdocgpd2.loadFromFile(tstrFN);
			ctr++;
			System.out.println("ctr: " + ctr + " tstrFN: " + tstrFN + " loaded");
            //dump xml string
//            TransformerFactory transformerFactory;
//            Transformer transformer;            
//            transformerFactory = TransformerFactory.newInstance();
//            transformer = transformerFactory.newTransformer();            
//            DOMSource source = new DOMSource(doc.getNode());
//            StringWriter buffer = new StringWriter(  );
//            PrintWriter out = new PrintWriter(buffer);		
//            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(out);
//            transformer.transform(source, result);
//            String results = buffer.toString(  );
//            System.out.println("results\n" + results);            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}    
	
}
