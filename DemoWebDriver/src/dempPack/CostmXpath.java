package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CostmXpath {

	public static void main(String[] args) throws InterruptedException{
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.ebay.com/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("java");//this is costumize xpath and it will start with //
		
		
		
		/*text_123
		 * text_345
		 * text567
		 * text789
		 
		driver.findElement(By.xpath("//input[contains(@id='text')])")).sendKeys("java");//contains is a method and function
		*/
		
		
		/*text_123
		 * text_345
		 * text567
		 * text789
		
		driver.findElement(By.xpath("//input[starts_with(@id='text')])")).sendKeys("java");
		 */
		
		/*
		 * 123_text
		 * 345_text
		 * 567_text
		 
		driver.findElement(By.xpath("//input[ends_with(@id='text')])")).sendKeys("java");
		*/
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("gh-p-1")).click();
	
	}

}
