package priority;

import org.testng.annotations.Test;

public class priorityDemo {

	@Test(priority = 0)
	public void test1() {
		System.out.println("I am inside test1");
	}
	
	@Test(priority = 2)
	public void test2() {
		System.out.println("I am inside test2");
	}
	
	// Lowest number will be picked first and you can even provide -1 number
	@Test(priority = -1)
	public void test3() {
		System.out.println("I am inside test3");
	}
	
}
