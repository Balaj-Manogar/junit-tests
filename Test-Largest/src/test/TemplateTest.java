package test;

import junit.framework.*;

import org.junit.Test;

import code.Template;
import static org.junit.Assert.*;

public class TemplateTest
{
	@Test
	public void oneVariable()throws Exception
	{
		Template template = new Template("Hello, ${name}");
		template.set("name", "Balaji");
		assertEquals("Hello, Balaji", template.evaluate());
	}
	
	@Test
	public void differentvalue()throws Exception
	{
		Template template = new Template("Hello, ${name}");
		template.set("name", "Boopathi");
		assertEquals("Hard coded evaluate method", "Hello, Boopathi", template.evaluate());
	}
	
	@Test
	public void differentTemplate()throws Exception
	{
		Template template = new Template("Hi, ${name}");
		template.set("name", "Balaji");
		assertEquals("Hi, Balaji", template.evaluate());
	}
}
