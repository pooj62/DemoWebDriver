package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		String bodyText =driver.findElement(By.xpath("//i[@class='fb_logo img sp_aRLx32r9_ET sx_cd94c4']")).getText();
		
		System.out.println(bodyText);
		
		Thread.sleep(2000);
		String bodyText1=driver.findElement(By.xpath("//div[@class='_5iyx']")).getText();
		System.out.println(bodyText1);
		
		
		


	}


}
