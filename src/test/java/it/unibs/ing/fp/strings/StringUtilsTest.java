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
}
