// XmlGYearFormatter.java
// This file contains generated code and will be overwritten when you rerun code generation.

package com.migration.xml;

import com.migration.CoreTypes;
import com.migration.typeinfo.ValueFormatter;
import com.migration.types.*;

class XmlGYearFormatter extends XmlFormatter
{
	public String format(DateTime dt)
	{
		String result = "";
		int year = dt.getYear();
		if (year < 0)
		{
			result += '-';
			year = -year;
		}

		result += CoreTypes.formatNumber(year, 4);
		if (dt.hasTimezone() != CalendarBase.TZ_MISSING)
			result += CoreTypes.formatTimezone(dt.getTimezoneOffset());
		return result;
	}
}
