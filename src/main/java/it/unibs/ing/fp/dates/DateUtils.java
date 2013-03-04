package it.unibs.ing.fp.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static int differenceBetween(Date d1, Date d2) {
		Calendar c1 = new GregorianCalendar();
		c1.setTime(d1);
		Calendar c2 = new GregorianCalendar();
		c2.setTime(d2);
		return c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH);
	}
	
	private static Calendar createCalendar(int year, int month, int day) {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_MONTH, day);
		return cal;
	}

	public static Date createDate(int year, int month, int day) {
		return createCalendar(year, month, day).getTime();
	}

	public static Date createDate(int year, int month, int day, int hour, int minutes, int seconds, int ms) {
		Calendar cal = createCalendar(year, month, day);
		cal.set(Calendar.HOUR, hour);
		cal.set(Calendar.MINUTE, minutes);
		cal.set(Calendar.SECOND, seconds);
		cal.set(Calendar.MILLISECOND, ms);
		return cal.getTime();
	}
}
