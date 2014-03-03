package it.unibs.ing.fp.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilsTest {
	@Test
	public void reverseOfNullIsNull() throws Exception {
		assertNull(StringUtils.reverse(null));
	}
}
