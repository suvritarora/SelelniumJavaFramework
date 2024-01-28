package testNGTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retryFailedTests {

	@Test
	public void A() {
		System.out.println("A");
	}
	
	@Test(retryAnalyzer = testNGTests.retryAnalyzer.class)
	public void B() {
		System.out.println("B");
		Assert.assertTrue(0>1);
	}
	
	@Test
	public void C() {
		System.out.println("C");
		int i = 1/0;
	}
}
