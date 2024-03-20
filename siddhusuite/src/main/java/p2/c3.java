package p2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	@Test(groups="Two")
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
			ob.get("https://jqueryui.com/datepicker//");
			//webelements: present : inside a frame
			// switch ur control to the frame
			// id, index, name 
			ob.switchTo().frame(0);
			
			ob.findElementById("datepicker").click();
			
			for(int i=0;i<6;i=i+1)
			{
				ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
			}
			
			ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(1) > td:nth-child(5) > a").click();
	
	ob.quit();
	
	}
}
