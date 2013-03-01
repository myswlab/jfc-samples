package it.unibs.ing.fp.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static int differenceBetween(Date d1, Date d2) {
		return 0;
	}

	public static Date createDate(int year, int month, int day) {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal.getTime();
	}
}
