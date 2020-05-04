package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class multiplyTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int result = test.multiply(3, 4);
		assertEquals(12, result);
	}

}
