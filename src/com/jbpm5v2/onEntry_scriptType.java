////////////////////////////////////////////////////////////////////////
//
// onEntry_scriptType.java
//
// This file was generated by XMLSpy 2009sp1 Enterprise Edition.
//
// YOU SHOULD NOT MODIFY THIS FILE, BECAUSE IT WILL BE
// OVERWRITTEN WHEN YOU RE-RUN CODE GENERATION.
//
// Refer to the XMLSpy Documentation for further details.
// http://www.altova.com/xmlspy
//
////////////////////////////////////////////////////////////////////////

package com.jbpm5v2;


public class onEntry_scriptType extends com.migration.xml.TypeBase
{
		public static com.migration.xml.meta.ComplexType getStaticInfo() { return new com.migration.xml.meta.ComplexType(com.jbpm5v2.jbpm5v2_TypeInfo.binder.getTypes()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_ti_altova_onEntry_scriptType]); }
	
	public onEntry_scriptType(org.w3c.dom.Node init)
	{
		super(init);
		instantiateMembers();
	}
	
	private void instantiateMembers()
	{
		scriptFormat = new MemberAttribute_scriptFormat (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_onEntry_scriptType._scriptFormat]);

		script= new MemberElement_script (this, com.jbpm5v2.jbpm5v2_TypeInfo.binder.getMembers()[com.jbpm5v2.jbpm5v2_TypeInfo._altova_mi_altova_onEntry_scriptType._script]);
	}
	// Attributes
	public MemberAttribute_scriptFormat scriptFormat;
		public static class MemberAttribute_scriptFormat
		{
			private com.migration.xml.TypeBase owner;
			private com.migration.typeinfo.MemberInfo info; 
			public MemberAttribute_scriptFormat (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) {this.owner = owner; this.info = info;}
			public String getValue() {
				return (String)com.migration.xml.XmlTreeOperations.castToString(com.migration.xml.XmlTreeOperations.findAttribute(owner.getNode(), info), info);
			}
			public void setValue(String value) {
				com.migration.xml.XmlTreeOperations.setValue(owner.getNode(), info, value);		
			}
			public boolean exists() {return owner.getAttribute(info) != null;}
			public void remove() {owner.removeAttribute(info);} 
			public com.migration.xml.meta.Attribute getInfo() {return new com.migration.xml.meta.Attribute(info);}
		}


	// Elements
	
	public MemberElement_script script;

		public static class MemberElement_script
		{
			public static class MemberElement_script_Iterator implements java.util.Iterator
			{
				private org.w3c.dom.Node nextNode;
				private MemberElement_script member;
				public MemberElement_script_Iterator(MemberElement_script member) {this.member=member; nextNode=member.owner.getElementFirst(member.info);}
				public boolean hasNext() 
				{
					while (nextNode != null)
					{
						if (com.migration.xml.TypeBase.memberEqualsNode(member.info, nextNode))
							return true;
						nextNode = nextNode.getNextSibling();
					}
					return false;
				}
				
				public Object next()
				{
					scriptType nx = new scriptType(nextNode);
					nextNode = nextNode.getNextSibling();
					return nx;
				}
				
				public void remove () {}
			}
			protected com.migration.xml.TypeBase owner;
			protected com.migration.typeinfo.MemberInfo info;
			public MemberElement_script (com.migration.xml.TypeBase owner, com.migration.typeinfo.MemberInfo info) { this.owner = owner; this.info = info;}
			public scriptType at(int index) {return new scriptType(owner.getElementAt(info, index));}
			public scriptType first() {return new scriptType(owner.getElementFirst(info));}
			public scriptType last(){return new scriptType(owner.getElementLast(info));}
			public scriptType append(){return new scriptType(owner.createElement(info));}
			public boolean exists() {return count() > 0;}
			public int count() {return owner.countElement(info);}
			public void remove() {owner.removeElement(info);}
			public void removeAt(int index) {owner.removeElementAt(info, index);}
			public java.util.Iterator iterator() {return new MemberElement_script_Iterator(this);}
			public com.migration.xml.meta.Element getInfo() { return new com.migration.xml.meta.Element(info); }
		}
}
