package com.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReTest implements IRetryAnalyzer {
	
	private int retrycount = 0;
	
	private static final int maxcount = 1;
	
	
	public boolean retry(ITestResult result) {
		
		if (retrycount < maxcount) {
			retrycount++;
			return true;
			
			
		}
		return false;
		
	}
	

}
