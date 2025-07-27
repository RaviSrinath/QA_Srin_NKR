package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.BaseClass;

public class TestClass extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		TestClass test = new TestClass();
		
		test.browserLaunch();
		test.navigateTo("");
		test.getTitle();
		test.getCurrentUrl();
		
		test.sendKeys(By.id("seaarch"),"maven program");
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		
		
		try {
			
			Thread.sleep(3000);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
			
		}
		test.getTitle();
		test.getCurrentUrl();
		test.closeBrowser();
	}
}
	
	


