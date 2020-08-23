package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLogin {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		 
	    driver.navigate().to("https://www.facebook.com/");  
	    WebElement emailEle = driver.findElement(By.id("email"));
	    emailEle.sendKeys("poojachaudhary251@gmail.com");
	   
	    WebElement password=driver.findElement(By.id("pass"));
	    password.sendKeys("Puja62@hbti");
	    password.sendKeys(Keys.ENTER);
	    
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

	    driver.findElement(By.partialLinkText("Log Out")).click();

	    System.out.println("Log out");
	    System.out.println("Logged Out Successfully!!!!!!!!!!!!!!!!!!!");

	}

}
