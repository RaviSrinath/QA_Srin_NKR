package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class ParameterizationClass extends BaseClass{
	@Test
	@Parameters({"username","password"})
	private void ParameterMethod(String name,String pass) {
		 browserLaunch("chrome");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 browserurls("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.findElement(By.name("username")).sendKeys(name);
		 driver.findElement(By.name("password")).sendKeys(name);
		 WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
			Click("login");	 
		 
	}

	private void Click(String string) {
		// TODO Auto-generated method stub
		
	}

	private void browserLaunch(String string) {
		// TODO Auto-generated method stub
		
	}

	private void browserurls(String string) {
		// TODO Auto-generated method stub
		
	}

}
