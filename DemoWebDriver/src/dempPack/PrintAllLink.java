package dempPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLink {

	public static void main(String[] args) {
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		//lounch the browser
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/"); 
		driver.manage().window().maximize();  
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
		System.out.println("Size of links :"+alllink.size() );
		
		
		for(WebElement link:alllink)
			System.out.println(link.getText());
			

	}

}
