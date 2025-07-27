package com.testNG;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class InvocationCountClass extends BaseClass {
	
	@Test(invocationCount = 10)
	private void loginTest() {
		
		browserLauch("edge");
		browserCloseQuit("close");
		
	}

	private void browserCloseQuit(String string) {
		
		
	}

	private void browserLauch(String string) {
		
		
	}

}
