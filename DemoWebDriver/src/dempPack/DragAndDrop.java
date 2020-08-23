package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); 
		
	    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    //Thread.sleep(30000);// Thread.sleep while performing automation testing with Selenium, then this method will stop the
	    //execution of the script for the specified duration of time, irrespective of whether the element is found or not on the web page.
	    //It accepts the time duration in milliseconds.
	    
	    Actions action = new Actions(driver);
	    
	    WebElement source = driver.findElement(By.xpath("//div[@id='box1']"));
	    
	    WebElement destination = driver.findElement(By.xpath("//div[@id='box101']"));
	    
	    action.clickAndHold(source);
	    action.moveToElement(destination);
	    action.release();
	    action.perform();
	    
	    
	    
	    

	}

}
