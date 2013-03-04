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
		int dm = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
		if(dm == 0) {
			return c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH);
		}
		else {
			return calculateDaysToMonthEnd(c1) + calculateDaysInIncludedMonths(c1, c2) + calculateDaysInLastMonth(c2);
		}
	}
	
	private static int calculateDaysInIncludedMonths(Calendar c1, Calendar c2) {
		Calendar current = createCalendar(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH) + 1, 1);
		int count = 0;
		while(current.get(Calendar.MONTH) < c2.get(Calendar.MONTH)) {
			count += current.getActualMaximum(Calendar.DAY_OF_MONTH);
			current.add(Calendar.MONTH, 1);
		}
		return count;
	}

	private static int calculateDaysToMonthEnd(Calendar cal) {
		return cal.getActualMaximum(Calendar.DAY_OF_MONTH) - cal.get(Calendar.DAY_OF_MONTH);
	}

	private static int calculateDaysInLastMonth(Calendar cal) {
		return cal.get(Calendar.DAY_OF_MONTH);
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
