package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlDriver {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		 WebDriver driver = new HtmlUnitDriver();
		 
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://ui.freecrm.com/");
		 
		 
		 driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("pooja.chaudhary62@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Puja62@hbti");
		 
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getTitle());
	}

	
	}

