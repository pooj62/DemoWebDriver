package dempPack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDynamicalyForLoadingPage {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get ("https://the-internet.herokuapp.com/infinite_scroll"); 
		
		driver.manage().window().maximize();
		
	    //driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 
		 //try {
			    long initialhight=((long)jse.executeScript("return document.body.scrollHeight"));
			    while (true) {
			        jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			        Thread.sleep(2000);

			        long newHeight = ((long)jse.executeScript("return document.body.scrollHeight"));
			        if (newHeight == initialhight) {
			            break;
			        }
			        initialhight = newHeight;
			    }
			
			}
	    

	}

