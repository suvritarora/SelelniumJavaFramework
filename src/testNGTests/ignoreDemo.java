package testNGTests;


import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class ignoreDemo {

	@Test
	public void A() {
		System.out.println("A");
	}
	
	@Test
	public void B() {
		System.out.println("B");
	}
	
	@Test
	public void C() {
		System.out.println("C");
	}
	
}
