package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatenateTest 
{
	@Test
	public void test() 
	{
		JUnitTests test = new JUnitTests();
		String result = test.concatenate("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
