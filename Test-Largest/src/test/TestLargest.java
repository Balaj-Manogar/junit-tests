package test;

import junit.framework.TestCase;
import code.Largest;

public class TestLargest extends TestCase
{

	public void testSimple()
	{
		assertEquals(9, Largest.largest(new int[] {7,8,9}));
	}
	
	public void testOrder()
	{
		assertEquals(9, Largest.largest(new int[] {9,8,7}));
	}
	
	public void testNegativity()
	{
		assertEquals(-7, Largest.largest(new int[] {-9,-8,-7}));
	}
	
	public void testEmpty()
	{
		try
		{
			Largest.largest(new int[] {});
			//assertTrue("This should be empty list... ", false);
			fail("Should have thrown an exception");
		}
		catch(RuntimeException e)
		{
			assertTrue("This is empty list... ", true);
		}
		
	}
	
	

}
