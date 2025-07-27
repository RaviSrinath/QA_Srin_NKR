package com.testNG;

import org.testng.annotations.Test;

public class CrossBrowserTesting {

	
	@Test(priority=-3)
	private void chrome() {
		BrowserLaunch("chrome");
		UrlLaunch("https://www.google.com/");
		System.out.println("Browser.ID" +Thread.currentThread().getId());
		
	}
private void UrlLaunch(String string) {
		// TODO Auto-generated method stub
		
	}
@Test(priority=0)
	private void edge() {
		BrowserLaunch("edge");
		UrlLaunch("https://www.google.com/");
		System.out.println("Browser.ID" +Thread.currentThread().getId());
		
		
		
	}
@Test(priority=1)
	private void firefox() {
		BrowserLaunch("firefox");
		UrlLaunch("https://www.google.com/");
		System.out.println("Browser.ID" +Thread.currentThread().getId());
		
		
	}
	private void BrowserLaunch(String string) {
		// TODO Auto-generated method stub
		
	}

	
		
	
}
