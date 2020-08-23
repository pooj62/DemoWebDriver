package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://www.facebook.com/");
		 
		 
		 driver.findElement(By.id("email")).sendKeys("poojachaudhary251@gmail.com");;
		 driver.findElement(By.id("pass")).sendKeys("Puja62@hbti");
		 
		 driver.findElement(By.id("u_0_b")).click();
		 
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getTitle());

	}

}
