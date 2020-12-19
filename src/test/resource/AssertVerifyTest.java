import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertVerifyTest {
	
	
	//hard assert terminates the program 
	@Test
	private void test1() {
		System.out.println("Test1 Started");
		assertEquals("A", "a");
		System.out.println("Test Completed");
	}

	//soft assert is to verify & continue the process
	@Test
	private void test2() {
		SoftAssert soft = new SoftAssert();
		System.out.println("Test2 Started");
		soft.assertEquals("B", "b");
		System.out.println("Verification completed");
		System.out.println("Test2 completed");
		soft.assertAll();
	}
	
	
}
