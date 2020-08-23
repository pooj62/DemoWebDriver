package dempPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
	    driver.get("http://demo.automationtesting.in/Windows.html");
	    
	    System.out.println("tabedwindowTitle :"+driver.getTitle());
	    
	   /* WebElement SwitchToElement = driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]"));
	    
	    Actions act1 = new Actions(driver);
	     Thread.sleep(2000);
	     act1.moveToElement(SwitchToElement).build().perform();{
	     System.out.println("Switch is selected");
	        }
	        */
	    
	    WebElement tabedwindowbutton = driver.findElement(By.xpath("//*[@id='Tabbed']/a/button"));
	    tabedwindowbutton.click();
	    
	    
	    Thread.sleep(3000);
	    
	    Set<String> windowsID = driver.getWindowHandles();
	    Iterator<String> iter =  windowsID.iterator();
	    
	    String mainWindow = iter.next();
	    String childWindow = iter.next();
	    
	    driver.switchTo().window(childWindow);
	    
	    System.out.println("Title of childwindow: "+driver.getTitle());
	    
	
	}

}
