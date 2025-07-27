package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

import com.Utility.ExcelUtility;
import com.base.BaseClass;

public class ExcelDataClass extends BaseClass {

    @DataProvider(name = "excelDataprovider")
    public Object[][] dataProviderMethod() {
        String filePath = System.getProperty("user.dir") + "\\TestData\\DataDriven_JAN.xlsx";
        String sheetName = "data";
        return ExcelUtility.getExcelData(filePath, sheetName);
    }
private void testLogin(String username,String password) {
	browserLaunch("chrome");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	browserUrls("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit'"));
	jsClick(login);
	System.out.println("Username : " +username+ "password :" +password);
	
	
}
























private void jsClick(WebElement login) {
	// TODO Auto-generated method stub
	
}
private void browserUrls(String string) {
	// TODO Auto-generated method stub
	
}
private void browserLaunch(String string) {
	// TODO Auto-generated method stub
	
}

				
		
		
	}
	


