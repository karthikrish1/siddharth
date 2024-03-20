package ll;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class k1 {

	static Logger log= LogManager.getLogger(k1.class);
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		 ChromeDriver ob= new ChromeDriver();
		 log.info("visiting website");
			ob.get("http://www.mycontactform.com");
			WebElement ele = ob.findElementByName("btnSubmit");
			Actions ac= new Actions(ob);
			log.info("clicking, holding and releasing ");
			
			ac.clickAndHold(ele).build().perform();
			Thread.sleep(3000);
			log.error("it may not be released");
			log.info("going to quit");
			ac.release(ele).build().perform();
			
			ob.quit();
	}
}
