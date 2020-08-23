package dempPack;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListofWebElement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
			
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Thread.sleep(20000);
		 
		List<WebElement> objectLinks = driver.findElements(By.tagName("a"));
		System.out.println("Size of list: "+objectLinks.size());
		
		//iterate to the list by the for each loop
		for(WebElement objlink : objectLinks)
			{
				System.out.println(objlink.getText());
				System.out.println(objlink.getAttribute("href"));
				System.out.println("*****************");
				
			}
				
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		List<WebElement> objectLink = driver.findElements(By.tagName("a"));
		System.out.println("Size of list: "+objectLink.size());
		
		//iterate to the list by the for each loop
				for(WebElement objlinks : objectLink)
					{
						System.out.println(objlinks.getText());
						System.out.println(objlinks.getAttribute("href"));
						System.out.println("*****************");
						
					}
				Thread.sleep(2000);
				driver.quit();
		
	
		
		
			}
	
			
			}
	




