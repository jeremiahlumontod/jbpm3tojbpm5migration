package com.migration.main;

import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

public class Migrate {

	//static com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc;
	static com.jbpm5processdoc.jbpm5processdoc2 jbpm5Doc;
	static com.jbpm3processdoc.jbpm3processdoc2 doc3;
    static com.jbpm3processdocgpd.jbpm3processdocgpd2 doc3gpd;
        
        
	public static void buildNodes() {
		System.out.println("buildNodes");
        NodeBuilder nb = new NodeBuilder();
		nb.buildNode();
		doc3 = nb.getDoc3();
		doc3gpd = nb.getDoc3gpd();
		jbpm5Doc = nb.getJbpm5Doc();
                
		//(new NodeBuilder()).buildNode(jbpm5Doc,doc3,doc3gpd);
	}
	
	public static void createAdditionalGatewaysIfNeeded() {
		System.out.println("createAdditionalGatewaysIfNeeded");
		(new GatewayBuilder()).buildGateways(jbpm5Doc);
	}
	
	public static void generateTransitions() throws TransformerConfigurationException, TransformerException {
		System.out.println("generateTransitions");
		(new TransitionBuilder()).buildTransitions(jbpm5Doc,doc3,doc3gpd);
	}
	
	public static void doMigrate() throws TransformerConfigurationException, TransformerException {
		buildNodes();
		//createAdditionalGatewaysIfNeeded();
		generateTransitions();		
	}
	
	public static void migrate() {
        NodeBuilder nb = new NodeBuilder();
        //String strSrc = "D:/seamprojs/projs/jbpmmodel/src/main/com/jbpmmodel/bp";
        String strSrc = "E:/java/myeis/struts2-projs/jbpm3modelreference/jbpmmodel/src/main/com/jbpmmodel/bp";
        String strDst = "E:/java/myeis/struts2-projs/jbpm5model/src/main/java/com/jbpm5model/bp";
		nb.buildNode(strSrc,strDst);		
	}
	
	
	public static void main(String[] args) throws TransformerConfigurationException, TransformerException {
		//Migrate.doMigrate();
		Migrate.migrate();
		System.out.println("done");
	}
}
