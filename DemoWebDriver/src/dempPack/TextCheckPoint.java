package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCheckPoint {

	public static void main(String[] args) throws InterruptedException {
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard#"); 
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement( By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        
        Thread.sleep(15000);
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).getText();
        
        if(actualText.equals(expectedText)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("Fail");
        }
        
        
        //Facebook page
		driver.manage().window().maximize();  
		driver.navigate().to("https://www.facebook.com/"); 
		
        String expectedTextLogo = "facebook";
        String actualTexLogo = driver.findElement(By.xpath("//i[@class='fb_logo img sp_Ro-uA_4e_6j sx_be75a1']")).getText();
        
        if(actualTexLogo.equals(expectedTextLogo)) {
        	System.out.println("pass");
        }
        else {
        	System.out.println("Fail");
        }
        }

	}

