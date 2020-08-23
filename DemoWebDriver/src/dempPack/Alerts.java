package dempPack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//simple alerts
		//driver.findElement(By.id("alertBox")).click();
		//Alert simplealert = driver.switchTo().alert();
		//System.out.println(simplealert.getText());
		
		//Thread.sleep(2000);
		//simplealert.accept();
		
		//confirmation alert
		
		//driver.findElement(By.id("confirmBox")).click();
		//Alert confirmationalert = driver.switchTo().alert();
		//System.out.println(confirmationalert.getText());
		//
		//Thread.sleep(2000);
		//confirmationalert.accept();
		//System.out.println(driver.findElement(By.id("output")).getText());
		
		//prompt aleart
		
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
		
		Thread.sleep(2000);
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		
			
		
	}

}
