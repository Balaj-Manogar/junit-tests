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
		Template template = new Template();
		template.set("name", "Balaji");
		assertEquals("Hello, Balaji", template.evaluate());
	}
}
