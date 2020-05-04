package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class subtractTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int result = test.subtract(3, 4);
		assertEquals(-1, result);
	}
}
