package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareNumTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int output = test.squareNum(8);
		assertEquals(64, output);
	}
}
