package dempPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class GoogleTestByInternetExplorere {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\91953\\Desktop\\Selenium\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		 
	    driver.navigate().to("https://www.google.com/");  
	   

	}

}
