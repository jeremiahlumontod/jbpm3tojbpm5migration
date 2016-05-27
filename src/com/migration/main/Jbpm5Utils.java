package com.migration.main;

import java.io.File;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.Iterator;

import com.jbpm5processdoc.conditionExpressionType;
import com.jbpm5v2.BPMNDiagramType;
import com.jbpm5v2.BPMNEdgeType;
import com.jbpm5v2.BPMNPlaneType;
import com.jbpm5v2.BPMNShapeType;
import com.jbpm5v2.BoundsType;
import com.jbpm5v2.exclusiveGatewayType;
import com.jbpm5v2.processType;
import com.jbpm5v2.sequenceFlowType;
import com.jbpm5v2.startEventType;
import com.jbpm5v2.userTaskType;
import com.jbpm5v2.waypointType;
import com.jbpm5v2.xs.stringType;

public class Jbpm5Utils {

	public Jbpm5Utils() {
		super();
	}

    public static com.jbpm5v2.jbpm5v22 copySrcJbpm5ToTargetJbpm5(com.jbpm5processdoc.jbpm5processdoc2 tjbpm5Doc,com.jbpm5v2.jbpm5v22 tjbpm5DocDst, String tstrjbpm5FN, String tstrjbpm5dstProcName) {
    	
		try {
			
			String strID = tstrjbpm5FN.substring(0, tstrjbpm5FN.length()-5);
			strID = backlashReplace(strID);
			String astrID[] = strID.split("/");
			strID = astrID[astrID.length-1];
			
			tjbpm5DocDst = com.jbpm5v2.jbpm5v22.createDocument();
			tjbpm5DocDst = com.jbpm5v2.jbpm5v22.loadFromFile(tstrjbpm5FN);
//			String str = tjbpm5DocDst.saveToString(true);
//			System.out.println("tjbpm5DocDst:\n" + str);
//			str = tjbpm5Doc.saveToString(true);
//			System.out.println("tjbpm5Doc:\n" + str);
			Iterator itDefSrc = tjbpm5Doc.definitions.iterator();
			com.jbpm5processdoc.definitionsType definitionsSrc = (com.jbpm5processdoc.definitionsType) itDefSrc.next();
			
			Iterator itDefDst = tjbpm5DocDst.definitions.iterator();
			com.jbpm5v2.definitionsType definitionsDst = (com.jbpm5v2.definitionsType) itDefDst.next();
			//com.jbpm5v2.definitionsType definitionsDst = tjbpm5DocDst.definitions.at(0);
			definitionsDst.process.remove();
			com.jbpm5v2.processType processDst = definitionsDst.process.append();
			processDst.processType2.setValue("Private");
			processDst.isExecutable.setValue(true);
			processDst.id.setValue(strID);
			processDst.name.setValue(strID);
			processDst.packageName.setValue(strID); 
			
			Iterator itdefinitionsSrc = definitionsSrc.process.iterator();
			com.jbpm5processdoc.processType processSrc = (com.jbpm5processdoc.processType) itdefinitionsSrc.next();
			
			Iterator itStartSrc = processSrc.startEvent.iterator();
			com.jbpm5processdoc.startEventType startSrc = (com.jbpm5processdoc.startEventType) itStartSrc.next();
			startEventType startDst = processDst.startEvent.append();
			startDst.id.setValue(startSrc.id.getValue());
			startDst.name.setValue(startSrc.name.getValue());
			
			Iterator itUserTaskSrc = processSrc.userTask.iterator();
			while(itUserTaskSrc.hasNext()) {
				com.jbpm5processdoc.userTaskType usertaskSrc = (com.jbpm5processdoc.userTaskType) itUserTaskSrc.next();
				com.jbpm5v2.userTaskType usertaskDst = processDst.userTask.append();
				usertaskDst.id.setValue(usertaskSrc.id.getValue());
				usertaskDst.name.setValue(usertaskSrc.name.getValue());
				com.jbpm5v2.ioSpecificationType iospecsDst = usertaskDst.ioSpecification.append();
				com.jbpm5v2.inputSetType inputsetDst = iospecsDst.inputSet.append();
				com.jbpm5v2.outputSetType outputsetDst = iospecsDst.outputSet.append();
			}
			
			Iterator itEndSrc = processSrc.endEvent.iterator();
			com.jbpm5processdoc.endEventType endSrc = (com.jbpm5processdoc.endEventType) itEndSrc.next();
			com.jbpm5v2.endEventType endDst = processDst.endEvent.append();
			endDst.id.setValue(endSrc.id.getValue());
			endDst.name.setValue(endSrc.name.getValue());
			
			Iterator itgatewaySrc = processSrc.exclusiveGateway.iterator();
			while(itgatewaySrc.hasNext()) {
				com.jbpm5processdoc.exclusiveGatewayType gatewaySrc = (com.jbpm5processdoc.exclusiveGatewayType) itgatewaySrc.next();
				com.jbpm5v2.exclusiveGatewayType gatewayDst = processDst.exclusiveGateway.append();
				gatewayDst.id.setValue(gatewaySrc.id.getValue());
				gatewayDst.name.setValue(gatewaySrc.name.getValue());
				gatewayDst.gatewayDirection.setValue(gatewaySrc.gatewayDirection.getValue());
			}
			
			Iterator itseqflowSrc = processSrc.sequenceFlow.iterator();
			while(itseqflowSrc.hasNext()) {
				com.jbpm5processdoc.sequenceFlowType seqflowSrc = (com.jbpm5processdoc.sequenceFlowType) itseqflowSrc.next();
				com.jbpm5v2.sequenceFlowType seqflowDst = processDst.sequenceFlow.append();
				seqflowDst.id.setValue(seqflowSrc.id.getValue());
				seqflowDst.sourceRef.setValue(seqflowSrc.sourceRef.getValue());
				seqflowDst.targetRef.setValue(seqflowSrc.targetRef.getValue());
				Iterator itconditionExp = seqflowSrc.conditionExpression.iterator();
				while(itconditionExp.hasNext()) {
					com.jbpm5processdoc.conditionExpressionType conditionExpSrc = (com.jbpm5processdoc.conditionExpressionType) itconditionExp.next();
					com.jbpm5v2.conditionExpressionType conditionExpDst = seqflowDst.conditionExpression.append();
					conditionExpDst.type.setValue(conditionExpSrc.type.getValue());
				}
			}
			
			definitionsDst.BPMNDiagram.remove();
			com.jbpm5v2.BPMNDiagramType diagDst = definitionsDst.BPMNDiagram.append();
			Iterator itDiagSrc = definitionsSrc.BPMNDiagram.iterator();
			com.jbpm5processdoc.BPMNDiagramType diagSrc = (com.jbpm5processdoc.BPMNDiagramType) itDiagSrc.next();
			Iterator itPlane = diagSrc.BPMNPlane.iterator();
			while(itPlane.hasNext()) {
				com.jbpm5processdoc.BPMNPlaneType planeSrc = (com.jbpm5processdoc.BPMNPlaneType) itPlane.next();
				com.jbpm5v2.BPMNPlaneType planeDst = diagDst.BPMNPlane.append();
				planeDst.bpmnElement.setValue(strID);
				Iterator itShapeSrc = planeSrc.BPMNShape.iterator();
				while(itShapeSrc.hasNext()) {
					com.jbpm5processdoc.BPMNShapeType shapeSrc = (com.jbpm5processdoc.BPMNShapeType) itShapeSrc.next();
					com.jbpm5v2.BPMNShapeType shapeDst = planeDst.BPMNShape.append();
					shapeDst.bpmnElement.setValue(shapeSrc.bpmnElement.getValue());
					Iterator itBoundsSrc = shapeSrc.Bounds.iterator();
					while(itBoundsSrc.hasNext()) {
						com.jbpm5processdoc.BoundsType boundsSrc = (com.jbpm5processdoc.BoundsType) itBoundsSrc.next();
						com.jbpm5v2.BoundsType boundsDst = shapeDst.Bounds.append();
						boundsDst.x.setValue(boundsSrc.x.getValue());
						boundsDst.y.setValue(boundsSrc.y.getValue());
						boundsDst.width.setValue(boundsSrc.width.getValue());
						boundsDst.height.setValue(boundsSrc.height.getValue());
					}
				}
				Iterator itEdgeSrc = planeSrc.BPMNEdge.iterator();
				while(itEdgeSrc.hasNext()) {
					com.jbpm5processdoc.BPMNEdgeType edgeSrc = (com.jbpm5processdoc.BPMNEdgeType) itEdgeSrc.next();
					com.jbpm5v2.BPMNEdgeType edgeDst = planeDst.BPMNEdge.append();
					edgeDst.bpmnElement.setValue(edgeSrc.bpmnElement.getValue());
					Iterator itwaypointSrc = edgeSrc.waypoint.iterator();
					while(itwaypointSrc.hasNext()) {
						com.jbpm5processdoc.waypointType waypointSrc = (com.jbpm5processdoc.waypointType) itwaypointSrc.next();
						com.jbpm5v2.waypointType waypointDst = edgeDst.waypoint.append();
						waypointDst.x.setValue(waypointSrc.x.getValue());
						waypointDst.y.setValue(waypointSrc.x.getValue());
					}
				}
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 	
		return tjbpm5DocDst;
		
    }
    
    public static String backlashReplace(String myStr) {
        final StringBuilder result = new StringBuilder();
        final StringCharacterIterator iterator = new StringCharacterIterator(myStr);
        char character = iterator.current();
        while (character != CharacterIterator.DONE) {

            if (character == '\\') {
                result.append("/");
            } else {
                result.append(character);
            }

            character = iterator.next();
        }
        return result.toString();
    }
    
}
