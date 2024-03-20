package p1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c2 {

	@Test(groups="One")
	public void t2() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		 ob.get("http://www.google.com");//1
		 Thread.sleep(3000);
		 ob.findElementByLinkText("Images").click();//2
		 File f = ob.getScreenshotAs(OutputType.FILE);
		 //File utils => apche directory studio commn io
		 FileUtils.copyFile(f, new File("C:\\Users\\hp\\eclipse-workspace\\siddhusuite\\src\\main\\java\\p1\\a.png"));
		 Thread.sleep(3000);
		 ob.navigate().back();//1 
		 Thread.sleep(3000);
		 ob.navigate().forward();
		 Thread.sleep(3000);
		 ob.quit();
	}
}
