package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int result = test.add(3, 4);
		assertEquals(7, result);
	}
}
