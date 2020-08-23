package dempPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleTestByGeckoDriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		 
	    driver.navigate().to("https://www.google.com/");  
	   

	}

}
