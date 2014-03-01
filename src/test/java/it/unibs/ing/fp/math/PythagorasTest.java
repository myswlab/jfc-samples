package it.unibs.ing.fp.math;

import static org.junit.Assert.*;

import org.junit.Test;

public class PythagorasTest {
	@Test
	public void hypotenuseFromCatheti() throws Exception {
		final double cathetus1 = 3.0;
		final double cathetus2 = 4.0;
		final double hypotenuse = new Pythagoras().hypotenuseFromCatheti(cathetus1, cathetus2);
		assertEquals(5.0, hypotenuse, 0.0001);
	}
}
