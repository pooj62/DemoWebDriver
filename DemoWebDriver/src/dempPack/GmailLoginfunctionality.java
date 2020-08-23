package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLoginfunctionality {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		 
	    driver.get("https://accounts.google.com/signin");
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    WebElement email = driver.findElement(By.id("identifierId"));
	    email.sendKeys("pc5223322@gmail.com");
	    
	    WebElement emailnext = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	    emailnext.click();
	    
	   
	    WebElement password=driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
	    password.sendKeys("Pooja62@hbti");
	    
	    
	   
	    

	    

	}
}
