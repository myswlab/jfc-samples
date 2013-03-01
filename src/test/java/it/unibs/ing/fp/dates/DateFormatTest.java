package it.unibs.ing.fp.dates;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateFormatTest {
	private static final Date ORIGIN = DateUtils.createDate(1970, Calendar.JANUARY, 1, 0, 0, 0, 0);
	@Test
	public void formatDateUsingItalianFormat() throws Exception {
		final String format = "dd/MM/yyyy";
		DateFormat formatter = new SimpleDateFormat(format);
		assertEquals("01/01/1970", formatter.format(ORIGIN));
	}
	
	@Test
	public void formatDateAndTime() throws Exception {
		final String format = "dd-MM-yy HH:mm:ss";
		DateFormat formatter = new SimpleDateFormat(format);
		System.out.println(ORIGIN);
		assertEquals("01-01-70 00:00:00", formatter.format(ORIGIN));
	}
}
