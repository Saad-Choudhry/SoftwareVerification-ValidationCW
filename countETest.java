package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countETest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		int output = test.countE("elephant");
		assertEquals(2, output);
	}
}
