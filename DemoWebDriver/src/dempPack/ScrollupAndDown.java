package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupAndDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://www.guru99.com/scroll-up-down-selenium-webdriver.html"); 
		
		driver.manage().window().maximize();
		
	    //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    
	    /*
	     * Scroll to specific location(x , y coordinates)
	     * window.scroll().Window.scrollBy().Window.scrollTo()
	    */
	   // jse.executeScript("window.scrollTo(0,1500)");
	    //Syntax:- jse.executeScript("arguments[0].scrollIntoView();",Element );
	    
	   // WebElement scrollinselenium = driver.findElement(By.xpath("//h2[contains(text(),'Scroll in Selenium')]"));
	    //jse.executeScript("arguments[0].scrollintoView(true)" ,scrollinselenium);
	    
	    
	    /*scroll until the bottom of the page(using scroll hight)
	     * 
	     */
	    jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
	}

}
