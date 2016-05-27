////////////////////////////////////////////////////////////////////////
//
// jbpm3processdoc_typeinfo.java
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


package com.jbpm3processdoc;

import com.migration.typeinfo.*;



public class jbpm3processdoc_TypeInfo
{
	// namespaces indices
	public static final int _altova_ni = 0;
	public static final int _altova_ni_xs = 1;


	// typeinfo indices
	public static final int _altova_tif = 0 ;
	public static final int _altova_ti_altova_jbpm3processdoc2 = _altova_tif ;
	public static final int _altova_ti_altova_decisionType = 1 ;
	public static final int _altova_ti_altova_transitionType = 2 ;
	public static final int _altova_ti_altova_end_stateType = 3 ;
	public static final int _altova_ti_altova_process_definitionType = 4 ;
	public static final int _altova_ti_altova_start_stateType = 5 ;
	public static final int _altova_ti_altova_task_nodeType = 6 ;
	public static final int _altova_til = 7 ;

	public static final int _altova_tif_xs = _altova_til;
	public static final int _altova_ti_xs_altova_ENTITIES = _altova_tif_xs ;
	public static final int _altova_ti_xs_altova_ENTITY = 8 ;
	public static final int _altova_ti_xs_altova_ID = 9 ;
	public static final int _altova_ti_xs_altova_IDREF = 10 ;
	public static final int _altova_ti_xs_altova_IDREFS = 11 ;
	public static final int _altova_ti_xs_altova_NCName = 12 ;
	public static final int _altova_ti_xs_altova_NMTOKEN = 13 ;
	public static final int _altova_ti_xs_altova_NMTOKENS = 14 ;
	public static final int _altova_ti_xs_altova_NOTATION = 15 ;
	public static final int _altova_ti_xs_altova_Name = 16 ;
	public static final int _altova_ti_xs_altova_QName = 17 ;
	public static final int _altova_ti_xs_altova_anySimpleType = 18 ;
	public static final int _altova_ti_xs_altova_anyType = 19 ;
	public static final int _altova_ti_xs_altova_anyURI = 20 ;
	public static final int _altova_ti_xs_altova_base64Binary = 21 ;
	public static final int _altova_ti_xs_altova_boolean2 = 22 ;
	public static final int _altova_ti_xs_altova_byte2 = 23 ;
	public static final int _altova_ti_xs_altova_date = 24 ;
	public static final int _altova_ti_xs_altova_dateTime = 25 ;
	public static final int _altova_ti_xs_altova_decimal = 26 ;
	public static final int _altova_ti_xs_altova_double2 = 27 ;
	public static final int _altova_ti_xs_altova_duration = 28 ;
	public static final int _altova_ti_xs_altova_float2 = 29 ;
	public static final int _altova_ti_xs_altova_gDay = 30 ;
	public static final int _altova_ti_xs_altova_gMonth = 31 ;
	public static final int _altova_ti_xs_altova_gMonthDay = 32 ;
	public static final int _altova_ti_xs_altova_gYear = 33 ;
	public static final int _altova_ti_xs_altova_gYearMonth = 34 ;
	public static final int _altova_ti_xs_altova_hexBinary = 35 ;
	public static final int _altova_ti_xs_altova_int2 = 36 ;
	public static final int _altova_ti_xs_altova_integer = 37 ;
	public static final int _altova_ti_xs_altova_language = 38 ;
	public static final int _altova_ti_xs_altova_long2 = 39 ;
	public static final int _altova_ti_xs_altova_negativeInteger = 40 ;
	public static final int _altova_ti_xs_altova_nonNegativeInteger = 41 ;
	public static final int _altova_ti_xs_altova_nonPositiveInteger = 42 ;
	public static final int _altova_ti_xs_altova_normalizedString = 43 ;
	public static final int _altova_ti_xs_altova_positiveInteger = 44 ;
	public static final int _altova_ti_xs_altova_short2 = 45 ;
	public static final int _altova_ti_xs_altova_string2 = 46 ;
	public static final int _altova_ti_xs_altova_time = 47 ;
	public static final int _altova_ti_xs_altova_token = 48 ;
	public static final int _altova_ti_xs_altova_unsignedByte = 49 ;
	public static final int _altova_ti_xs_altova_unsignedInt = 50 ;
	public static final int _altova_ti_xs_altova_unsignedLong = 51 ;
	public static final int _altova_ti_xs_altova_unsignedShort = 52 ;
	public static final int _altova_ti_xs_altova_stringType = 53 ;
	public static final int _altova_til_xs = 54 ;



	// memberinfo indices

	public static class _altova_mi_altova_jbpm3processdoc2 {
		public static final int begin = 0 ;
		public static final int _decision = _altova_mi_altova_jbpm3processdoc2.begin ;
		public static final int _description = 1 ;
		public static final int _end_state = 2 ;
		public static final int _process_definition = 3 ;
		public static final int _start_state = 4 ;
		public static final int _task_node = 5 ;
		public static final int _transition = 6 ;
		public static final int end = 7 ;
	};


	public static class _altova_mi_altova_decisionType {
		public static final int begin = _altova_mi_altova_jbpm3processdoc2.end ;
		public static final int _name = _altova_mi_altova_decisionType.begin ;
		public static final int _description = 8 ;
		public static final int _transition = 9 ;
		public static final int end = 10 ;
	};


	public static class _altova_mi_altova_transitionType {
		public static final int begin = _altova_mi_altova_decisionType.end ;
		public static final int _to = _altova_mi_altova_transitionType.begin ;
		public static final int _name = 11 ;
		public static final int end = 12 ;
	};


	public static class _altova_mi_altova_end_stateType {
		public static final int begin = _altova_mi_altova_transitionType.end ;
		public static final int _name = _altova_mi_altova_end_stateType.begin ;
		public static final int end = 13 ;
	};


	public static class _altova_mi_altova_process_definitionType {
		public static final int begin = _altova_mi_altova_end_stateType.end ;
		public static final int _name = _altova_mi_altova_process_definitionType.begin ;
		public static final int _start_state = 14 ;
		public static final int _task_node = 15 ;
		public static final int _decision = 16 ;
		public static final int _end_state = 17 ;
		public static final int end = 18 ;
	};


	public static class _altova_mi_altova_start_stateType {
		public static final int begin = _altova_mi_altova_process_definitionType.end ;
		public static final int _name = _altova_mi_altova_start_stateType.begin ;
		public static final int _transition = 19 ;
		public static final int end = 20 ;
	};


	public static class _altova_mi_altova_task_nodeType {
		public static final int begin = _altova_mi_altova_start_stateType.end ;
		public static final int _name = _altova_mi_altova_task_nodeType.begin ;
		public static final int _description = 21 ;
		public static final int _transition = 22 ;
		public static final int end = 23 ;
	};


	public static class _altova_mi_xs_altova_ENTITIES {
		public static final int begin = _altova_mi_altova_task_nodeType.end ;
		public static final int end = _altova_mi_xs_altova_ENTITIES.begin ;
	};


	public static class _altova_mi_xs_altova_ENTITY {
		public static final int begin = _altova_mi_xs_altova_ENTITIES.end ;
		public static final int end = _altova_mi_xs_altova_ENTITY.begin ;
	};


	public static class _altova_mi_xs_altova_ID {
		public static final int begin = _altova_mi_xs_altova_ENTITY.end ;
		public static final int end = _altova_mi_xs_altova_ID.begin ;
	};


	public static class _altova_mi_xs_altova_IDREF {
		public static final int begin = _altova_mi_xs_altova_ID.end ;
		public static final int end = _altova_mi_xs_altova_IDREF.begin ;
	};


	public static class _altova_mi_xs_altova_IDREFS {
		public static final int begin = _altova_mi_xs_altova_IDREF.end ;
		public static final int end = _altova_mi_xs_altova_IDREFS.begin ;
	};


	public static class _altova_mi_xs_altova_NCName {
		public static final int begin = _altova_mi_xs_altova_IDREFS.end ;
		public static final int end = _altova_mi_xs_altova_NCName.begin ;
	};


	public static class _altova_mi_xs_altova_NMTOKEN {
		public static final int begin = _altova_mi_xs_altova_NCName.end ;
		public static final int end = _altova_mi_xs_altova_NMTOKEN.begin ;
	};


	public static class _altova_mi_xs_altova_NMTOKENS {
		public static final int begin = _altova_mi_xs_altova_NMTOKEN.end ;
		public static final int end = _altova_mi_xs_altova_NMTOKENS.begin ;
	};


	public static class _altova_mi_xs_altova_NOTATION {
		public static final int begin = _altova_mi_xs_altova_NMTOKENS.end ;
		public static final int end = _altova_mi_xs_altova_NOTATION.begin ;
	};


	public static class _altova_mi_xs_altova_Name {
		public static final int begin = _altova_mi_xs_altova_NOTATION.end ;
		public static final int end = _altova_mi_xs_altova_Name.begin ;
	};


	public static class _altova_mi_xs_altova_QName {
		public static final int begin = _altova_mi_xs_altova_Name.end ;
		public static final int end = _altova_mi_xs_altova_QName.begin ;
	};


	public static class _altova_mi_xs_altova_anySimpleType {
		public static final int begin = _altova_mi_xs_altova_QName.end ;
		public static final int end = _altova_mi_xs_altova_anySimpleType.begin ;
	};


	public static class _altova_mi_xs_altova_anyType {
		public static final int begin = _altova_mi_xs_altova_anySimpleType.end ;
		public static final int _unnamed = _altova_mi_xs_altova_anyType.begin ;
		public static final int end = 24 ;
	};


	public static class _altova_mi_xs_altova_anyURI {
		public static final int begin = _altova_mi_xs_altova_anyType.end ;
		public static final int end = _altova_mi_xs_altova_anyURI.begin ;
	};


	public static class _altova_mi_xs_altova_base64Binary {
		public static final int begin = _altova_mi_xs_altova_anyURI.end ;
		public static final int end = _altova_mi_xs_altova_base64Binary.begin ;
	};


	public static class _altova_mi_xs_altova_boolean2 {
		public static final int begin = _altova_mi_xs_altova_base64Binary.end ;
		public static final int end = _altova_mi_xs_altova_boolean2.begin ;
	};


	public static class _altova_mi_xs_altova_byte2 {
		public static final int begin = _altova_mi_xs_altova_boolean2.end ;
		public static final int end = _altova_mi_xs_altova_byte2.begin ;
	};


	public static class _altova_mi_xs_altova_date {
		public static final int begin = _altova_mi_xs_altova_byte2.end ;
		public static final int end = _altova_mi_xs_altova_date.begin ;
	};


	public static class _altova_mi_xs_altova_dateTime {
		public static final int begin = _altova_mi_xs_altova_date.end ;
		public static final int end = _altova_mi_xs_altova_dateTime.begin ;
	};


	public static class _altova_mi_xs_altova_decimal {
		public static final int begin = _altova_mi_xs_altova_dateTime.end ;
		public static final int end = _altova_mi_xs_altova_decimal.begin ;
	};


	public static class _altova_mi_xs_altova_double2 {
		public static final int begin = _altova_mi_xs_altova_decimal.end ;
		public static final int end = _altova_mi_xs_altova_double2.begin ;
	};


	public static class _altova_mi_xs_altova_duration {
		public static final int begin = _altova_mi_xs_altova_double2.end ;
		public static final int end = _altova_mi_xs_altova_duration.begin ;
	};


	public static class _altova_mi_xs_altova_float2 {
		public static final int begin = _altova_mi_xs_altova_duration.end ;
		public static final int end = _altova_mi_xs_altova_float2.begin ;
	};


	public static class _altova_mi_xs_altova_gDay {
		public static final int begin = _altova_mi_xs_altova_float2.end ;
		public static final int end = _altova_mi_xs_altova_gDay.begin ;
	};


	public static class _altova_mi_xs_altova_gMonth {
		public static final int begin = _altova_mi_xs_altova_gDay.end ;
		public static final int end = _altova_mi_xs_altova_gMonth.begin ;
	};


	public static class _altova_mi_xs_altova_gMonthDay {
		public static final int begin = _altova_mi_xs_altova_gMonth.end ;
		public static final int end = _altova_mi_xs_altova_gMonthDay.begin ;
	};


	public static class _altova_mi_xs_altova_gYear {
		public static final int begin = _altova_mi_xs_altova_gMonthDay.end ;
		public static final int end = _altova_mi_xs_altova_gYear.begin ;
	};


	public static class _altova_mi_xs_altova_gYearMonth {
		public static final int begin = _altova_mi_xs_altova_gYear.end ;
		public static final int end = _altova_mi_xs_altova_gYearMonth.begin ;
	};


	public static class _altova_mi_xs_altova_hexBinary {
		public static final int begin = _altova_mi_xs_altova_gYearMonth.end ;
		public static final int end = _altova_mi_xs_altova_hexBinary.begin ;
	};


	public static class _altova_mi_xs_altova_int2 {
		public static final int begin = _altova_mi_xs_altova_hexBinary.end ;
		public static final int end = _altova_mi_xs_altova_int2.begin ;
	};


	public static class _altova_mi_xs_altova_integer {
		public static final int begin = _altova_mi_xs_altova_int2.end ;
		public static final int end = _altova_mi_xs_altova_integer.begin ;
	};


	public static class _altova_mi_xs_altova_language {
		public static final int begin = _altova_mi_xs_altova_integer.end ;
		public static final int end = _altova_mi_xs_altova_language.begin ;
	};


	public static class _altova_mi_xs_altova_long2 {
		public static final int begin = _altova_mi_xs_altova_language.end ;
		public static final int end = _altova_mi_xs_altova_long2.begin ;
	};


	public static class _altova_mi_xs_altova_negativeInteger {
		public static final int begin = _altova_mi_xs_altova_long2.end ;
		public static final int end = _altova_mi_xs_altova_negativeInteger.begin ;
	};


	public static class _altova_mi_xs_altova_nonNegativeInteger {
		public static final int begin = _altova_mi_xs_altova_negativeInteger.end ;
		public static final int end = _altova_mi_xs_altova_nonNegativeInteger.begin ;
	};


	public static class _altova_mi_xs_altova_nonPositiveInteger {
		public static final int begin = _altova_mi_xs_altova_nonNegativeInteger.end ;
		public static final int end = _altova_mi_xs_altova_nonPositiveInteger.begin ;
	};


	public static class _altova_mi_xs_altova_normalizedString {
		public static final int begin = _altova_mi_xs_altova_nonPositiveInteger.end ;
		public static final int end = _altova_mi_xs_altova_normalizedString.begin ;
	};


	public static class _altova_mi_xs_altova_positiveInteger {
		public static final int begin = _altova_mi_xs_altova_normalizedString.end ;
		public static final int end = _altova_mi_xs_altova_positiveInteger.begin ;
	};


	public static class _altova_mi_xs_altova_short2 {
		public static final int begin = _altova_mi_xs_altova_positiveInteger.end ;
		public static final int end = _altova_mi_xs_altova_short2.begin ;
	};


	public static class _altova_mi_xs_altova_string2 {
		public static final int begin = _altova_mi_xs_altova_short2.end ;
		public static final int end = _altova_mi_xs_altova_string2.begin ;
	};


	public static class _altova_mi_xs_altova_time {
		public static final int begin = _altova_mi_xs_altova_string2.end ;
		public static final int end = _altova_mi_xs_altova_time.begin ;
	};


	public static class _altova_mi_xs_altova_token {
		public static final int begin = _altova_mi_xs_altova_time.end ;
		public static final int end = _altova_mi_xs_altova_token.begin ;
	};


	public static class _altova_mi_xs_altova_unsignedByte {
		public static final int begin = _altova_mi_xs_altova_token.end ;
		public static final int end = _altova_mi_xs_altova_unsignedByte.begin ;
	};


	public static class _altova_mi_xs_altova_unsignedInt {
		public static final int begin = _altova_mi_xs_altova_unsignedByte.end ;
		public static final int end = _altova_mi_xs_altova_unsignedInt.begin ;
	};


	public static class _altova_mi_xs_altova_unsignedLong {
		public static final int begin = _altova_mi_xs_altova_unsignedInt.end ;
		public static final int end = _altova_mi_xs_altova_unsignedLong.begin ;
	};


	public static class _altova_mi_xs_altova_unsignedShort {
		public static final int begin = _altova_mi_xs_altova_unsignedLong.end ;
		public static final int end = _altova_mi_xs_altova_unsignedShort.begin ;
	};


	public static class _altova_mi_xs_altova_stringType {
		public static final int begin = _altova_mi_xs_altova_unsignedShort.end ;
		public static final int _unnamed = _altova_mi_xs_altova_stringType.begin ;
		public static final int end = 25 ;
	};

	

	public static class InfoBinder implements InfoBinderInterface
	{
		public NamespaceInfo[] getNamespaces() {return namespaces;}
		public TypeInfo[] getTypes() {return types;}
		public MemberInfo[] getMembers() {return members;}
	}
	
	public static InfoBinderInterface binder = new InfoBinder();

	// Array of all namespaces with pointers to types:
	public static final NamespaceInfo namespaces[] = 
	{
		new NamespaceInfo(binder, "", "", _altova_tif, _altova_til),
		new NamespaceInfo(binder, "http://www.w3.org/2001/XMLSchema", "xs", _altova_tif_xs, _altova_til_xs),
	};

	
// Array of all types with pointers to members:
	public static final TypeInfo types[] = new TypeInfoCreator().createTypes(binder);

	private static class TypeInfoCreator
	{
		private void initTypes0(InfoBinderInterface binder, TypeInfo[] types) {
			types[0] = new TypeInfo( binder, _altova_ni, "com.jbpm3processdoc", 0, _altova_mi_altova_jbpm3processdoc2.begin, _altova_mi_altova_jbpm3processdoc2.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[1] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_decisionType.begin, _altova_mi_altova_decisionType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[2] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_transitionType.begin, _altova_mi_altova_transitionType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[3] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_end_stateType.begin, _altova_mi_altova_end_stateType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[4] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_process_definitionType.begin, _altova_mi_altova_process_definitionType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[5] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_start_stateType.begin, _altova_mi_altova_start_stateType.end,  null, 				WhitespaceType.Whitespace_Unknown );
			types[6] = new TypeInfo( binder, _altova_ni, "", _altova_ti_xs_altova_anyType, _altova_mi_altova_task_nodeType.begin, _altova_mi_altova_task_nodeType.end,  null, 				WhitespaceType.Whitespace_Unknown );

			types[7] = new TypeInfo( binder, _altova_ni_xs, "ENTITIES", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_ENTITIES.begin, _altova_mi_xs_altova_ENTITIES.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
					new FacetInfo (null, "minLength", "1", 1 ), 
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[8] = new TypeInfo( binder, _altova_ni_xs, "ENTITY", _altova_ti_xs_altova_NCName, _altova_mi_xs_altova_ENTITY.begin, _altova_mi_xs_altova_ENTITY.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[9] = new TypeInfo( binder, _altova_ni_xs, "ID", _altova_ti_xs_altova_NCName, _altova_mi_xs_altova_ID.begin, _altova_mi_xs_altova_ID.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[10] = new TypeInfo( binder, _altova_ni_xs, "IDREF", _altova_ti_xs_altova_NCName, _altova_mi_xs_altova_IDREF.begin, _altova_mi_xs_altova_IDREF.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[11] = new TypeInfo( binder, _altova_ni_xs, "IDREFS", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_IDREFS.begin, _altova_mi_xs_altova_IDREFS.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
					new FacetInfo (null, "minLength", "1", 1 ), 
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[12] = new TypeInfo( binder, _altova_ni_xs, "NCName", _altova_ti_xs_altova_Name, _altova_mi_xs_altova_NCName.begin, _altova_mi_xs_altova_NCName.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "pattern", "[\\i-[:]][\\c-[:]]*", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[13] = new TypeInfo( binder, _altova_ni_xs, "NMTOKEN", _altova_ti_xs_altova_token, _altova_mi_xs_altova_NMTOKEN.begin, _altova_mi_xs_altova_NMTOKEN.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "pattern", "\\c+", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[14] = new TypeInfo( binder, _altova_ni_xs, "NMTOKENS", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_NMTOKENS.begin, _altova_mi_xs_altova_NMTOKENS.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
					new FacetInfo (null, "minLength", "1", 1 ), 
					new FacetInfo (null, "pattern", "\\c+", 0 ), 
					new FacetInfo (null, "pattern", "\\c+", 0 ), 
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[15] = new TypeInfo( binder, _altova_ni_xs, "NOTATION", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_NOTATION.begin, _altova_mi_xs_altova_NOTATION.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[16] = new TypeInfo( binder, _altova_ni_xs, "Name", _altova_ti_xs_altova_token, _altova_mi_xs_altova_Name.begin, _altova_mi_xs_altova_Name.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "pattern", "\\i\\c*", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[17] = new TypeInfo( binder, _altova_ni_xs, "QName", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_QName.begin, _altova_mi_xs_altova_QName.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[18] = new TypeInfo( binder, _altova_ni_xs, "anySimpleType", 0, _altova_mi_xs_altova_anySimpleType.begin, _altova_mi_xs_altova_anySimpleType.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[19] = new TypeInfo( binder, _altova_ni_xs, "anyType", 0, _altova_mi_xs_altova_anyType.begin, _altova_mi_xs_altova_anyType.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[20] = new TypeInfo( binder, _altova_ni_xs, "anyURI", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_anyURI.begin, _altova_mi_xs_altova_anyURI.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[21] = new TypeInfo( binder, _altova_ni_xs, "base64Binary", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_base64Binary.begin, _altova_mi_xs_altova_base64Binary.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[22] = new TypeInfo( binder, _altova_ni_xs, "boolean", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_boolean2.begin, _altova_mi_xs_altova_boolean2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[23] = new TypeInfo( binder, _altova_ni_xs, "byte", _altova_ti_xs_altova_short2, _altova_mi_xs_altova_byte2.begin, _altova_mi_xs_altova_byte2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "-128", 0 ), 
					new FacetInfo (null, "maxInclusive", "127", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[24] = new TypeInfo( binder, _altova_ni_xs, "date", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_date.begin, _altova_mi_xs_altova_date.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DateFormatter );
			types[25] = new TypeInfo( binder, _altova_ni_xs, "dateTime", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_dateTime.begin, _altova_mi_xs_altova_dateTime.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DateTimeFormatter );
			types[26] = new TypeInfo( binder, _altova_ni_xs, "decimal", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_decimal.begin, _altova_mi_xs_altova_decimal.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DecimalFormatter );
			types[27] = new TypeInfo( binder, _altova_ni_xs, "double", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_double2.begin, _altova_mi_xs_altova_double2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DoubleFormatter );
			types[28] = new TypeInfo( binder, _altova_ni_xs, "duration", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_duration.begin, _altova_mi_xs_altova_duration.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DurationFormatter );
			types[29] = new TypeInfo( binder, _altova_ni_xs, "float", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_float2.begin, _altova_mi_xs_altova_float2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.DoubleFormatter );
			types[30] = new TypeInfo( binder, _altova_ni_xs, "gDay", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_gDay.begin, _altova_mi_xs_altova_gDay.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.GDayFormatter );
			types[31] = new TypeInfo( binder, _altova_ni_xs, "gMonth", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_gMonth.begin, _altova_mi_xs_altova_gMonth.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.GMonthFormatter );
			types[32] = new TypeInfo( binder, _altova_ni_xs, "gMonthDay", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_gMonthDay.begin, _altova_mi_xs_altova_gMonthDay.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.GMonthDayFormatter );
			types[33] = new TypeInfo( binder, _altova_ni_xs, "gYear", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_gYear.begin, _altova_mi_xs_altova_gYear.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.GYearFormatter );
			types[34] = new TypeInfo( binder, _altova_ni_xs, "gYearMonth", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_gYearMonth.begin, _altova_mi_xs_altova_gYearMonth.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.GYearMonthFormatter );
			types[35] = new TypeInfo( binder, _altova_ni_xs, "hexBinary", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_hexBinary.begin, _altova_mi_xs_altova_hexBinary.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.HexBinaryFormatter );
			types[36] = new TypeInfo( binder, _altova_ni_xs, "int", _altova_ti_xs_altova_long2, _altova_mi_xs_altova_int2.begin, _altova_mi_xs_altova_int2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "-2147483648", 0 ), 
					new FacetInfo (null, "maxInclusive", "2147483647", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[37] = new TypeInfo( binder, _altova_ni_xs, "integer", _altova_ti_xs_altova_decimal, _altova_mi_xs_altova_integer.begin, _altova_mi_xs_altova_integer.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "fractionDigits", "0", 0 ), 
					new FacetInfo (null, "pattern", "[\\-+]?[0-9]+", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[38] = new TypeInfo( binder, _altova_ni_xs, "language", _altova_ti_xs_altova_token, _altova_mi_xs_altova_language.begin, _altova_mi_xs_altova_language.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "pattern", "[a-zA-Z]{1,8}(-[a-zA-Z0-9]{1,8})*", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[39] = new TypeInfo( binder, _altova_ni_xs, "long", _altova_ti_xs_altova_integer, _altova_mi_xs_altova_long2.begin, _altova_mi_xs_altova_long2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "-9223372036854775808", 0 ), 
					new FacetInfo (null, "maxInclusive", "9223372036854775807", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[40] = new TypeInfo( binder, _altova_ni_xs, "negativeInteger", _altova_ti_xs_altova_nonPositiveInteger, _altova_mi_xs_altova_negativeInteger.begin, _altova_mi_xs_altova_negativeInteger.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "-1", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[41] = new TypeInfo( binder, _altova_ni_xs, "nonNegativeInteger", _altova_ti_xs_altova_integer, _altova_mi_xs_altova_nonNegativeInteger.begin, _altova_mi_xs_altova_nonNegativeInteger.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "0", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[42] = new TypeInfo( binder, _altova_ni_xs, "nonPositiveInteger", _altova_ti_xs_altova_integer, _altova_mi_xs_altova_nonPositiveInteger.begin, _altova_mi_xs_altova_nonPositiveInteger.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "0", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[43] = new TypeInfo( binder, _altova_ni_xs, "normalizedString", _altova_ti_xs_altova_string2, _altova_mi_xs_altova_normalizedString.begin, _altova_mi_xs_altova_normalizedString.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "replace", 0 ),
				},
				WhitespaceType.Whitespace_Replace, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[44] = new TypeInfo( binder, _altova_ni_xs, "positiveInteger", _altova_ti_xs_altova_nonNegativeInteger, _altova_mi_xs_altova_positiveInteger.begin, _altova_mi_xs_altova_positiveInteger.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "1", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[45] = new TypeInfo( binder, _altova_ni_xs, "short", _altova_ti_xs_altova_int2, _altova_mi_xs_altova_short2.begin, _altova_mi_xs_altova_short2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "minInclusive", "-32768", 0 ), 
					new FacetInfo (null, "maxInclusive", "32767", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[46] = new TypeInfo( binder, _altova_ni_xs, "string", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_string2.begin, _altova_mi_xs_altova_string2.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "preserve", 0 ),
				},
				WhitespaceType.Whitespace_Preserve, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[47] = new TypeInfo( binder, _altova_ni_xs, "time", _altova_ti_xs_altova_anySimpleType, _altova_mi_xs_altova_time.begin, _altova_mi_xs_altova_time.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.TimeFormatter );
			types[48] = new TypeInfo( binder, _altova_ni_xs, "token", _altova_ti_xs_altova_normalizedString, _altova_mi_xs_altova_token.begin, _altova_mi_xs_altova_token.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "whitespace", "collapse", 0 ),
				},
				WhitespaceType.Whitespace_Collapse, com.migration.xml.Xs.AnySimpleTypeFormatter );
			types[49] = new TypeInfo( binder, _altova_ni_xs, "unsignedByte", _altova_ti_xs_altova_unsignedShort, _altova_mi_xs_altova_unsignedByte.begin, _altova_mi_xs_altova_unsignedByte.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "255", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[50] = new TypeInfo( binder, _altova_ni_xs, "unsignedInt", _altova_ti_xs_altova_unsignedLong, _altova_mi_xs_altova_unsignedInt.begin, _altova_mi_xs_altova_unsignedInt.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "4294967295", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[51] = new TypeInfo( binder, _altova_ni_xs, "unsignedLong", _altova_ti_xs_altova_nonNegativeInteger, _altova_mi_xs_altova_unsignedLong.begin, _altova_mi_xs_altova_unsignedLong.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "18446744073709551615", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[52] = new TypeInfo( binder, _altova_ni_xs, "unsignedShort", _altova_ti_xs_altova_unsignedInt, _altova_mi_xs_altova_unsignedShort.begin, _altova_mi_xs_altova_unsignedShort.end,  
				new FacetInfo[]
				{
					new FacetInfo (null, "maxInclusive", "65535", 0 ), 
				},
				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.IntegerFormatter );
			types[53] = new TypeInfo( binder, _altova_ni_xs, "", 0, _altova_mi_xs_altova_stringType.begin, _altova_mi_xs_altova_stringType.end,  null, 				WhitespaceType.Whitespace_Unknown, com.migration.xml.Xs.AnySimpleTypeFormatter );

		}

		public TypeInfo[] createTypes(InfoBinderInterface binder) {

			TypeInfo types[] = new TypeInfo[54];

			initTypes0(binder, types);
			
			return types;

		}
	}

	// Array of all members
	public static final MemberInfo members[] = new MemberInfoCreator().createMembers(binder);

	private static class MemberInfoCreator
	{
		private void initMembers0(InfoBinderInterface binder, MemberInfo[] members) {
			members[0] = new MemberInfo (binder, "", "decision", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_decisionType, 0, 0, 1);
			members[1] = new MemberInfo (binder, "", "description", _altova_ti_altova_jbpm3processdoc2, _altova_ti_xs_altova_stringType, 0, 0, 1);
			members[2] = new MemberInfo (binder, "", "end-state", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_end_stateType, 0, 0, 1);
			members[3] = new MemberInfo (binder, "", "process-definition", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_process_definitionType, 0, 0, 1);
			members[4] = new MemberInfo (binder, "", "start-state", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_start_stateType, 0, 0, 1);
			members[5] = new MemberInfo (binder, "", "task-node", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_task_nodeType, 0, 0, 1);
			members[6] = new MemberInfo (binder, "", "transition", _altova_ti_altova_jbpm3processdoc2, _altova_ti_altova_transitionType, 0, 0, 1);

			members[7] = new MemberInfo (binder, "", "name", _altova_ti_altova_decisionType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);
			members[8] = new MemberInfo (binder, "", "description", _altova_ti_altova_decisionType, _altova_ti_xs_altova_stringType, 0, 1, 1);
			members[9] = new MemberInfo (binder, "", "transition", _altova_ti_altova_decisionType, _altova_ti_altova_transitionType, 0, 1, -1);

			members[10] = new MemberInfo (binder, "", "to", _altova_ti_altova_transitionType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);
			members[11] = new MemberInfo (binder, "", "name", _altova_ti_altova_transitionType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);

			members[12] = new MemberInfo (binder, "", "name", _altova_ti_altova_end_stateType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);

			members[13] = new MemberInfo (binder, "", "name", _altova_ti_altova_process_definitionType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);
			members[14] = new MemberInfo (binder, "", "start-state", _altova_ti_altova_process_definitionType, _altova_ti_altova_start_stateType, 0, 1, 1);
			members[15] = new MemberInfo (binder, "", "task-node", _altova_ti_altova_process_definitionType, _altova_ti_altova_task_nodeType, 0, 9, -1);
			members[16] = new MemberInfo (binder, "", "decision", _altova_ti_altova_process_definitionType, _altova_ti_altova_decisionType, 0, 9, 9);
			members[17] = new MemberInfo (binder, "", "end-state", _altova_ti_altova_process_definitionType, _altova_ti_altova_end_stateType, 0, 1, 1);

			members[18] = new MemberInfo (binder, "", "name", _altova_ti_altova_start_stateType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);
			members[19] = new MemberInfo (binder, "", "transition", _altova_ti_altova_start_stateType, _altova_ti_altova_transitionType, 0, 1, 1);

			members[20] = new MemberInfo (binder, "", "name", _altova_ti_altova_task_nodeType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);
			members[21] = new MemberInfo (binder, "", "description", _altova_ti_altova_task_nodeType, _altova_ti_xs_altova_stringType, 0, 1, 1);
			members[22] = new MemberInfo (binder, "", "transition", _altova_ti_altova_task_nodeType, _altova_ti_altova_transitionType, 0, 1, 1);

			members[23] = new MemberInfo (binder, "", "", _altova_ti_xs_altova_anyType, _altova_ti_xs_altova_anySimpleType, 0|MemberInfo.IS_ATTRIBUTE, 0, -1);

			members[24] = new MemberInfo (binder, "", "", _altova_ti_xs_altova_stringType, _altova_ti_xs_altova_string2, 0|MemberInfo.IS_ATTRIBUTE, 1, 1);

		}

		public MemberInfo[] createMembers(InfoBinderInterface binder) {

			MemberInfo members[] = new MemberInfo[25];

			initMembers0(binder, members);
			
			return members;

		}
	}
}
