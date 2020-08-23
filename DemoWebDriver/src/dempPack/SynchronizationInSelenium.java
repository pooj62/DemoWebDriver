package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationInSelenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://ui.freecrm.com/");
		 
		 driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("pooja.chaudhary62@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Puja62@hbti");
		 driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		 

	}

}
