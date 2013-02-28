package it.unibs.ing.fp.strings;

import static org.junit.Assert.*;

import java.util.Locale;

import org.junit.Test;

public class StringFormatTest {
	private static final String GREETINGS = "Hello";
	private static final String TARGET = "World";

	@Test
	public void formatWithStringPlaceholders() throws Exception {
		final String result = String.format("%s, %s!", GREETINGS, TARGET);
		assertEquals("Hello, World!", result);
	}
	
	@Test
	public void formatScientificNotation() throws Exception {
		final double base = 11.19;
		final short exp = 5;
		final String result = String.format(Locale.ENGLISH, "%.3f * 10 ^ %d", base, exp);
		assertEquals("11.190 * 10 ^ 5", result);
	}

	@Test
	public void formatScientificNotationUsingItalyLocale() throws Exception {
		final double base = 11.19;
		final short exp = 5;
		final String result = String.format(Locale.ITALY, "%.3f * 10 ^ %d", base, exp);
		assertEquals("11,190 * 10 ^ 5", result);
	}
}
