package it.unibs.ing.fp.converters;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Implementare una classe DateFormatConverter che, dati due formati di data differenti, esponga metodi di conversione da String che rappresentano una data in un formato a String
 * che rappresentano la stessa data nell'altro
 */
public class DateFormatConverterTest {
	@Test
	public void convertFirstFormatToSecond() throws Exception {
		final DateFormatConverter converter = new DateFormatConverter("dd/MM/yyyy", "yyyyMMdd");
		assertEquals("20140228", converter.convertFirstToSecond("28/02/2014"));
	}

	@Test
	public void convertSecondFormatToFirst() throws Exception {
		final DateFormatConverter converter = new DateFormatConverter("dd/MM/yyyy", "yyyyMMdd");
		assertEquals("28/02/2014", converter.convertSecondToFirst("20140228"));
	}
}
