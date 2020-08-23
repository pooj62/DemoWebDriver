package dempPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofElement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> objectLinks = driver.findElements(By.tagName("a"));
		
		//iterate to the list by the for each loop
		for(WebElement objcurrentlink : objectLinks) {
			
			String stringlinktext = objcurrentlink.getText();
			
			System.out.println(stringlinktext);
		}
		

	}

}
