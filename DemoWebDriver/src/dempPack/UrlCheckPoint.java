package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlCheckPoint {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String actualURL=driver.getCurrentUrl();
        if(actualURL.equals(expectedURL)) {
        	System.out.println("Pass");
	}
        	else {
        		System.out.println("fail");
        	}
        	}
	}

