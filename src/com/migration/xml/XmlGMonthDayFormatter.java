// XmlGMonthDayFormatter.java
// This file contains generated code and will be overwritten when you rerun code generation.

package com.migration.xml;

import com.migration.CoreTypes;
import com.migration.typeinfo.ValueFormatter;
import com.migration.types.*;

class XmlGMonthDayFormatter extends XmlFormatter
{
	public String format(DateTime dt)
	{
		String result = "--";
		int month = dt.getMonth();
		int day = dt.getDay();
		result += CoreTypes.formatNumber(month, 2);
		result += '-';
		result += CoreTypes.formatNumber(day, 2);
		if (dt.hasTimezone() != CalendarBase.TZ_MISSING)
			result += CoreTypes.formatTimezone(dt.getTimezoneOffset());
		return result;
	}
}
