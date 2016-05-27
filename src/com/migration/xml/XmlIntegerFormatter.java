// XmlIntegerFormatter.java
// This file contains generated code and will be overwritten when you rerun code generation.

package com.migration.xml;

import com.migration.CoreTypes;
import com.migration.typeinfo.ValueFormatter;
import com.migration.types.*;

class XmlIntegerFormatter extends XmlFormatter
{
	public String format(double v)
	{
		return CoreTypes.castToString((long) v);
	}
}
