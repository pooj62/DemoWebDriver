package dempPack;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickonLogin {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
			
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();  
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard#"); 
				
				WebElement username=driver.findElement(By.id("txtUsername"));
		        WebElement password=driver.findElement(By.id("txtPassword"));
		        WebElement login=driver.findElement(By.id("btnLogin"));
		        
		        username.sendKeys("Admin");
		        password.sendKeys("admin123");
		        login.click();
		 
		        
		        
		        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		}catch(Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();                                       //b[contains(text(),'PIM')
		}
		
		
	
	
		
		

	}

}
