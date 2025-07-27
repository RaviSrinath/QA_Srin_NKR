package com.base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	//public abstract class BaseClass {
		
		public static WebDriver driver;
		
	//	public static ExtentReport extentReport;
		
		public static File file;	
		
		protected void browserLaunch() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Browser launched");
		}
		
		
		protected void navigateTo(String url){
			driver.get(url);
			System.out.println("navigated to:" +url);
		}
			
			protected void getTitle(){
			
				System.out.println("Page title: " +driver.getTitle());	
				
		}
			protected void getCurrentUrl(){
				
				System.out.println("current url: " +driver.getCurrentUrl());
			}
			
	        protected void sendKeys(By locator,String text){
	        	
	        WebElement element = driver.findElement(locator);
		    element.clear();
	        element.sendKeys(text);
	        System.out.println("entered: " + text);
	        
	        }
	        
	        protected void clickElement(By locator){
	        	
	            driver.findElement(locator).click();
	            System.out.println("element click");
	        }
	        
	 protected void closeBrowser(){
	        	
	            driver.quit();;
	            System.out.println("page closed");
	 }
	        
	
   public static void extentReportStart(String location) {
	
	 //  extentReport = new ExtentReports();
	 //  file = new File(location);
	 //  ExtentSparkReporter sparkReporter  new ExtentSparkReporter(file);
	//   extentReports.attachReporter(sparkReporter);
	 //  extentReports.setSystemInfo("os",System.getProperty("os.name"));
	   
	   
   }
  // public static void extentReportTearDown(String location) throws IOException{
	//extentReports.flush();
//	file = new file(location);
	//Desktop.getDesktop().browse((file).toURI());
  // }
  // public String takeScreenshot() throws IOException{
	 //  TakeScreenshot screenshot = (TakeScreenshot) driver;
	//   String timeStamp = new SimpleDataFormat("yyyymmdd_HHmmss").format(new Date());
	//   File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
	//   File destfile = new File("Screenshot\\png" + "_" + timeStamp +"png");
	//   FileUtils.copyFile(scrfile, destfile);
	//   return destfile.getAbsolutePath();
	   
   }
//}


