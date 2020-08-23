package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActionBack_Forw_Referesh {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().to("http://www.uitestpractice.com/");
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.quit();
		
		

	}

}
