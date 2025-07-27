package com.testNG;

import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test
	private void methodone() {
		System.out.println("Method one pass");
		
	}
	@Test
	private void methodtwo() {
		System.out.println("Method two pass");
		
	}
	@Test (dependsOnMethods = "methodone")
	private void methodthree() {
		System.out.println("Method three pass");
		
	}

}
