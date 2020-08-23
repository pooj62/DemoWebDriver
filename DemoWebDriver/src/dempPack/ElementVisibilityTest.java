package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://zapier.com/blog/best-free-crm/");
		
		Boolean submitbtn = driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).isDisplayed();
		System.out.println(submitbtn);
		
		
		Boolean submitbtn1 = driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).isEnabled();
		System.out.println(submitbtn1);
	}

}
