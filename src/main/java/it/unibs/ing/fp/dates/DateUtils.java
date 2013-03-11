package it.unibs.ing.fp.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static int differenceBetween(Date d1, Date d2) {
		Calendar c1 = new GregorianCalendar();
		c1.setTime(min(d1, d2));
		Calendar c2 = new GregorianCalendar();
		c2.setTime(max(d1, d2));
		int dy = c2.get(Calendar.YEAR) - c1.get(Calendar.YEAR);
		if (dy == 0) {
			int dm = c2.get(Calendar.MONTH) - c1.get(Calendar.MONTH);
			if (dm == 0) {
				return c2.get(Calendar.DAY_OF_MONTH) - c1.get(Calendar.DAY_OF_MONTH);
			} else {
				return calculateDaysToMonthEnd(c1) + calculateDaysInIncludedMonths(c1, c2) + calculateDaysInLastMonth(c2);
			}
		} else {
			return calculateDaysToMonthEnd(c1) + calculateDaysInSubsequentMonthsToYearEnd(c1) + calculateDaysInIncludedYears(c1, c2) + calculateDaysInPreceedingMonthsFromYearStart(c2)
					+ calculateDaysInLastMonth(c2);
		}
	}

	public static Date min(Date d1, Date d2) {
		if (d2.after(d1)) {
			return d1;
		} else {
			return d2;
		}
	}

	public static Date max(Date d1, Date d2) {
		if (d1.before(d2)) {
			return d2;
		} else {
			return d1;
		}
	}

	private static int calculateDaysInSubsequentMonthsToYearEnd(Calendar c1) {
		Calendar last = createCalendar(c1.get(Calendar.YEAR), Calendar.DECEMBER, 1);
		return calculateDaysInIncludedMonths(c1, last) + last.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private static int calculateDaysInPreceedingMonthsFromYearStart(Calendar c2) {
		Calendar first = createCalendar(c2.get(Calendar.YEAR), Calendar.JANUARY, 1);
		return calculateDaysInIncludedMonths(first, c2) + first.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	private static int calculateDaysInIncludedYears(Calendar c1, Calendar c2) {
		Calendar current = createCalendar(c1.get(Calendar.YEAR) + 1, c1.get(Calendar.MONTH), 1);
		int count = 0;
		while(current.get(Calendar.YEAR) < c2.get(Calendar.YEAR)) {
			for(int m = Calendar.JANUARY; m <= Calendar.DECEMBER; m++) {
				Calendar currentMonth = createCalendar(current.get(Calendar.YEAR), m, 1);
				count += currentMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
			}
			current.add(Calendar.YEAR, 1);
		}
		return count;
	}

	private static int calculateDaysInIncludedMonths(Calendar c1, Calendar c2) {
		Calendar current = createCalendar(c1.get(Calendar.YEAR), c1.get(Calendar.MONTH) + 1, 1);
		int count = 0;
		while (current.get(Calendar.MONTH) < c2.get(Calendar.MONTH)) {
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
		Calendar cal = new GregorianCalendar(year, month, day);
		return cal;
	}

	public static Date createDate(int year, int month, int day) {
		return createCalendar(year, month, day).getTime();
	}

	public static Date createDate(int year, int month, int day, int hour, int minutes, int seconds, int ms) {
		Calendar cal = createCalendar(year, month, day, hour, minutes, seconds, ms);
		cal.set(Calendar.MILLISECOND, ms);
		return cal.getTime();
	}

	private static Calendar createCalendar(int year, int month, int day,
			int hour, int minutes, int seconds, int ms) {
		Calendar cal = new GregorianCalendar(year, month, day, hour, minutes, seconds);
		cal.set(Calendar.MILLISECOND, ms);
		return cal;
	}
}
