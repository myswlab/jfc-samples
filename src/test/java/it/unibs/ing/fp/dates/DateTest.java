package it.unibs.ing.fp.dates;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

public class DateTest {
	@Test
	public void gettingSystemDateAndTime() throws Exception {
		Date first = new Date();
		Thread.sleep(10);
		Date second = new Date();
		assertTrue(first.before(second));
		assertTrue(second.after(first));
	}
}
