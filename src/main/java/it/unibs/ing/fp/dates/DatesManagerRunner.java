package it.unibs.ing.fp.dates;

import java.io.PrintWriter;
import java.util.Scanner;

public class DatesManagerRunner {
	public static void main(String[] args) throws Exception {
		final Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		
		new DatesManager(scanner, new PrintWriter(System.out, true)).run();
	}
}
