package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class divisionTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int result = test.divide(49, 7);
		assertEquals(7, result);
	}
}
