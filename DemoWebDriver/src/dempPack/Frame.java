package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();// lounch browser
		
		//driver.manage().window().maximize();//maxmize window
		//driver.manage().deleteAllCookies();//delete Allcookies
		
		//dynamic wait
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		Thread.sleep(2000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Selenium");
		
		//driver.switchTo().defaultContent();
		
		WebElement frame1 = driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
		driver.switchTo().frame(frame1);
		
		WebElement textbox1 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		textbox1.click();
		

	
	}

}
