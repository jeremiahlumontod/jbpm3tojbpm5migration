// XmlDateFormatter.java
// This file contains generated code and will be overwritten when you rerun code generation.

package com.migration.xml;

import com.migration.CoreTypes;
import com.migration.typeinfo.ValueFormatter;
import com.migration.types.*;

public class XmlDateFormatter extends XmlFormatter
{
	public String format(DateTime dt)
	{
		return dt.toDateString(true);
	}
}
