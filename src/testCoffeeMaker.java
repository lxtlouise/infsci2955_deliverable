import static org.junit.Assert.*;

import org.junit.Test;


public class TestCoffeeMaker {

	//Test runArgs(string) 
	//This tests that runArgs() always return 0.
	@Test
	public void test(){
		CoffeeMaker cm = new CoffeeMaker();
		int actual = cm.runArgs("foo");
		
		assertEquals(0, actual);
	}
	
}
