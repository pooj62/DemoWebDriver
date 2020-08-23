package dempPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentPageURL {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String CurrentURl = driver.getCurrentUrl();
		System.out.println(CurrentURl );

	}

}
