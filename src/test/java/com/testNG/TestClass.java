package com.testNG;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass {
	WebDriver driver;
	@BeforeTest
	private void beforeTest() {
		
		
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
		
	}
	@AfterTest
	private void afterTest() {
		driver.quit();
	}
	@Test(retryAnalyzer = ReTest.class)
	private void testMethod() {
		String title = driver.getTitle();
		assertEquals(title,"Orangehrm");
		
	}

}
