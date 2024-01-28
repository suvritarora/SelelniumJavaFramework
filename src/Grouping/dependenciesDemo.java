package Grouping;

import org.testng.annotations.Test;

public class dependenciesDemo {

	/*@Test
	public void timecard() {
		System.out.println("Timecard Done");
	}
	
	
	
	@Test(dependsOnMethods = {"timecard"})
	public void proforma() {
		System.out.println("Proforma Done");
	}
	*/
	
	
	@Test(dependsOnMethods = {"Dependency2"}, priority =1)
	public void Dependency() {
		System.out.println("Test");
	}
	
	@Test(priority = 2)
	public void Dependency2() {
		System.out.println("Test2");
	} 
}
