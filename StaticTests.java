package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addTest.class, concatenateTest.class, countETest.class, 
	divisionTest.class, multiplyTest.class, squareNumTest.class, 
	subtractTest.class })
public class StaticTests 
{

}
