package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://the-internet.herokuapp.com/horizontal_slider"); 
		
		driver.manage().window().maximize();
		
	    //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    
	    WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));

	    slider.sendKeys(Keys.END);
	}

}
