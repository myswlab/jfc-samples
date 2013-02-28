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
	public void gettingSystemDateAndTime() throws Exception {
		Date first = new Date();
		Thread.sleep(1);
		Date second = new Date();
		assertTrue(first.before(second));
		assertTrue(second.after(first));
	}
}
