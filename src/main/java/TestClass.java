import java.nio.channels.InterruptedByTimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.base.Base_Class;

public class TestClass extends Base_Class{
	
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
