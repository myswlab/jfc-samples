package it.unibs.ing.fp.converters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConverter {
	private final SimpleDateFormat first, second;

	public DateFormatConverter(String first, String second) {
		this.first = new SimpleDateFormat(first);
		this.second = new SimpleDateFormat(second);
	}

	public String convertFirstToSecond(String input) throws ParseException {
		final Date date = first.parse(input);
		return second.format(date);
	}

	public String convertSecondToFirst(String input) throws ParseException {
		final Date date = second.parse(input);
		return first.format(date);
	}

}
