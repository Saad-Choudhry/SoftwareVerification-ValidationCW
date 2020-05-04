package Testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ addTest.class, subtractTest.class, multiplyTest.class, divisionTest.class })
public class basicArithmeticTests 
{

}
