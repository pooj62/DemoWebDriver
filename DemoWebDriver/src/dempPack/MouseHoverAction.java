package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/"); 
		
		
		WebElement username=driver.findElement(By.id("txtUsername"));
        WebElement password=driver.findElement(By.id("txtPassword"));
        WebElement login=driver.findElement(By.id("btnLogin"));
        
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        login.click();
 
		
		 WebElement admin=driver.findElement(By.xpath(" //b[contains(text(),'Admin')]"));
	     Actions act1 = new Actions(driver);
	     Thread.sleep(2000);
	     act1.moveToElement(admin).build().perform();{
	     System.out.println("Admin is selected");
	        }
	        
	     WebElement userManagement=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	     Actions act2 = new Actions(driver);
	     Thread.sleep(2000);
	     act2.moveToElement( userManagement).build().perform();{
	     System.out.println("UserManagement is selected");
	        }
	        
	     /*WebElement Users=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers'"));
	       Actions act3 = new Actions(driver);
	       Thread.sleep(2000);
	       act3.moveToElement(Users).perform();
	       Users.click();{
		   System.out.print("Click on Users");
		   }*/
	        
}
}