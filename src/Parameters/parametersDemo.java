package Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersDemo {

	
	@Test
	@Parameters({"UserName", "Password"})
	public void Demo(String name, String pass) {
		System.out.println("My name is: " +name);
		System.out.println("Pass is: " +pass);
	}
	
	
/*	@Test
	@Parameters({"ABC", "DEF"})
	public void test(String name) {
		System.out.println("Name is : " +name);
	}
	*/
}
