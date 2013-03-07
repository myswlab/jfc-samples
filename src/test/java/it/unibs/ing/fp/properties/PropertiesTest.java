package it.unibs.ing.fp.properties;

import static org.junit.Assert.*;

import java.io.InputStream;
import java.util.Properties;

import org.junit.Test;

public class PropertiesTest {
	@Test
	public void loadFromPropertiesFile() throws Exception {
		Properties properties = new Properties();
		InputStream input = getClass().getResourceAsStream("/sample.properties");
		properties.load(input);
		assertEquals("Primo", properties.getProperty("first"));
		assertEquals("Terzo", properties.getProperty("third"));
	}
	
	@Test
	public void loadFromPropertiesFileProvidingInitialDefaults() throws Exception {
		Properties defaults = new Properties();
		defaults.setProperty("second", "2do");
		Properties properties = new Properties(defaults);
		assertEquals("2do", properties.getProperty("second"));
		InputStream input = getClass().getResourceAsStream("/sample.properties");
		properties.load(input);
		assertEquals("Secondo", properties.getProperty("second"));
	}
	
	@Test
	public void getPropertyProvidingDefaultValue() throws Exception {
		Properties properties = new Properties();
		InputStream input = getClass().getResourceAsStream("/sample.properties");
		properties.load(input);
		assertEquals("4to", properties.getProperty("fourth", "4to"));
	}
}
