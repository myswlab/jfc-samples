package it.unibs.ing.fp.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void reverseOfNullIsNull() throws Exception {
		assertNull(StringUtils.reverse(null));
	}
	
	@Test
	public void reverseOfEmptysNull() throws Exception {
		assertEquals("", StringUtils.reverse(""));
	}
	
	@Test
	public void reverseOfAbcIsCba() throws Exception {
		assertEquals("cba", StringUtils.reverse("abc"));
	}
	
	@Test
	public void nullStringIsPalindrome() throws Exception {
		assertTrue(StringUtils.isPalindrome(null));
	}
	
	@Test
	public void emptyStringIsPalindrome() throws Exception {
		assertTrue(StringUtils.isPalindrome(""));
	}
}
