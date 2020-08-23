package dempPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		driver.manage().window().maximize();//maximize the window
		driver.manage().deleteAllCookies();//delete all cookies
		
		//dynamicWait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		
		driver.get("https://www.ebay.com/");
		
		//size of linklist
		List<WebElement> linklist= driver.findElements(By.tagName("a"));
		System.out.println("size of list"+linklist.size());
		
		for(int i=0; i<linklist.size();i++) {
			String linktext = linklist.get(i).getText();
			System.out.println(linktext);
		}
		
		

	}

}
