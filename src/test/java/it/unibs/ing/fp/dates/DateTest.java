package it.unibs.ing.fp.dates;

import static org.junit.Assert.*;
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
	
	@Test
	public void gettingCurrentTimeMillis() throws Exception {
		long first = System.currentTimeMillis();
		Thread.sleep(10);
		long second = System.currentTimeMillis();
		assertTrue(first < second);
	}
	
	@Test
	public void gettingCurrentTimeNanos() throws Exception {
		long first = System.nanoTime();
		long second = System.nanoTime();
		assertTrue(first < second);
	}
}
