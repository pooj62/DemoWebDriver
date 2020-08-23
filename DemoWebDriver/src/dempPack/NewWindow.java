package dempPack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("http://seleniumpractice.blogspot.com/?view=magazine");
	    
	    String parent = driver.getWindowHandle();
	    
	    System.out.println("parent window id"+parent);
	    
	    driver.get("https://www.google.com/");
	    
	    driver.findElement(By.xpath("//a[contains(@href,'https://www.google.com/')]")).click();
	    
	    Set<String> allWindows = driver.getWindowHandles();
	    
	    int count = allWindows.size();
	    
	    System.out.println("Total Window"+count);
	    
	    for(String child:allWindows)
	    {
	    	if(!parent.equalsIgnoreCase(child));
	    	
	    	driver.switchTo().window(child);
	    	
	    	driver.findElement(By.name("q")).sendKeys("Selenium Webdriver");
	    	
	    	Thread.sleep(3000);
	    	
	    	driver.close();
	    }
	    driver.switchTo().window(parent);
    	
	    System.out.println("Parent Window title"+driver.getTitle());
		
	}

	
		
	}


