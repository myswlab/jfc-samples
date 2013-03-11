package it.unibs.ing.fp.dates;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.junit.Test;

public class DatesManagerTest {
	@Test
	public void singleExecution() throws Exception {
		final int result = 35 * 365 + 9 - 8;
		final Scanner scanner = new Scanner("19/03/1978 11/03/2013 n");
		scanner.useDelimiter(" ");
		StringWriter buffer = new StringWriter();
		PrintWriter writer = new PrintWriter(buffer);
		DatesManager manager = new DatesManager(scanner, writer);
		manager.run();
		final String output = buffer.toString();
		assertTrue(output.contains("Difference between 19/03/1978 and 11/03/2013 is " + result + "\n"));
	}
	
	@Test
	public void doubleExecution() throws Exception {
		final Scanner scanner = new Scanner("19/03/1978 20/03/1978 y 09/03/2013 11/03/2013 n");
		scanner.useDelimiter(" ");
		StringWriter buffer = new StringWriter();
		PrintWriter writer = new PrintWriter(buffer);
		DatesManager manager = new DatesManager(scanner, writer);
		manager.run();
		final String output = buffer.toString();
		assertTrue(output.contains("Difference between 19/03/1978 and 20/03/1978 is 1\n"));
		assertTrue(output.contains("Difference between 09/03/2013 and 11/03/2013 is 2\n"));
	}
}
