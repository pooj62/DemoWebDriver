package dempPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SarkariResult {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sarkariresult.com/");
		
		WebElement logo =driver.findElement(By.xpath("//img[@src='/images/logo-new.png']"));
		
		 Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", logo);
		 
		 if (!ImagePresent) {
			 System.out.println("Image not displayed.");
			 } 

			 else {
			 System.out.println("Image displayed.");
			 }
		 
		 String Text= driver.findElement(By.id("head-title")).getText();
		 System.out.println(Text);
		 
		 String text=driver.findElement(By.xpath("//b[contains(text(),'WWW.SARKARIRESULT.COM')]")).getText();
		 System.out.println(text);
		 
		 Thread.sleep(2000);
		 List<WebElement> objectLinks = driver.findElements(By.tagName("a"));
			System.out.println("Size of list: "+objectLinks.size());
			
			//iterate to the list by the for each loop
			for(WebElement objlink : objectLinks)
				{
					System.out.println(objlink.getText());
					System.out.println(objlink.getAttribute("href"));
					System.out.println("*****************");
					
	}
	}
}


