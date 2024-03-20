package p1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
			ob.get("http://www.mycontactform.com");
			WebElement ele = ob.findElementByName("btnSubmit");
			Actions ac= new Actions(ob);
			
			ac.clickAndHold(ele).build().perform();
			Thread.sleep(3000);
			ac.release(ele).build().perform();
			ob.quit();
	}

}
