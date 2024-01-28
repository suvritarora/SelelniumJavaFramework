package Grouping;

import org.testng.annotations.Test;

public class groupsDemo {

	@Test(groups = {"Regression", "Sanity"})
	public void A() {
		System.out.println("A");
	}
	
	@Test(groups = {"Regression", "Smoke", "Sanity"})
	public void B() {
		System.out.println("B");
	}
	
	@Test(groups = {"Regression", "Smoke"})
	public void C() {
		System.out.println("C");
	}
	
	@Test(groups = {"Regression"})
	public void D() {
		System.out.println("D");
	}
	
	/*
	@Test(groups= {"sanity"})
	public static void test1() {
		System.out.println("test1");
	}
	
	@Test(groups= {"sanity", "smoke"})
	public static void test2() {
		System.out.println("test2");
	}
	
	@Test(groups= {"sanity", "regression"})
	public static void test3() {
		System.out.println("test3");
	}
	
	@Test
	public static void test4() {
		System.out.println("test4");
	} */
	

}
