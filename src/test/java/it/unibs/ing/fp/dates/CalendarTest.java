package it.unibs.ing.fp.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalendarTest {
	private static final Date ORIGIN = new Date(0);

	@Test
	public void gettingDateFieldsUsingCalendar() throws Exception {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(ORIGIN);
		assertEquals(1970, calendar.get(Calendar.YEAR));
		assertEquals(0, calendar.get(Calendar.MONTH));
		assertEquals(0, Calendar.JANUARY);
		assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
	}

	@Test
	public void settingCalendarFields() throws Exception {
		Calendar cal1 = createCalendar(1978, Calendar.MARCH, 19);
		Calendar cal2 = createCalendar(1978, Calendar.MARCH, 23);
		assertTrue(cal1.before(cal2));
		cal1.add(Calendar.DAY_OF_MONTH, 4);
		assertEquals(cal1, cal2);
		cal1.add(Calendar.DAY_OF_MONTH, 10);
		assertEquals(Calendar.APRIL, cal1.get(Calendar.MONTH));
		assertEquals(2, cal1.get(Calendar.DAY_OF_MONTH));
	}

	private Calendar createCalendar(int year, int month, int day) {
		Calendar calendar = new GregorianCalendar(year, month, day, 0, 0, 0);
		calendar.set(Calendar.MILLISECOND, 0);
		return calendar;
	}
}
