package it.unibs.ing.fp.dates;

import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DatesManager {
	private static final DateFormat FORMATTER = new SimpleDateFormat("dd/MM/yyyy");
	private final Scanner in;
	private final PrintWriter out;

	public DatesManager(Scanner in, PrintWriter out) {
		this.in = in;
		this.out = out;
	}
	
	public void run() throws ParseException {
		boolean go = true;
		while (go) {
			out.print("Insert initial date: ");
			Date initialDate = FORMATTER.parse(in.next());
			out.print("Insert final date: ");
			Date finalDate = FORMATTER.parse(in.next());
			int difference = DateUtils.differenceBetween(initialDate, finalDate);
			out.println(String.format("Difference between %s and %s is %d\n", FORMATTER.format(initialDate), FORMATTER.format(finalDate), difference));
			out.print("Repeat execution? ");
			go = "y".equalsIgnoreCase(in.next());
		}
	}
}
