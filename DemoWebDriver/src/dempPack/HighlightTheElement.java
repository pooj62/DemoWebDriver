package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighlightTheElement {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://freecrm.co.in/");
		
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
		flash(loginBtn,driver);
		

	}
		public static void flash(WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			String bgcolor = element.getCssValue("backgroundColor");//background colr of login button
			for(int i=0; i<100;i++)
				changecolor("rgb(255,0,0)",element,driver);
				changecolor(bgcolor,element,driver);
		}
		
	
		public static void changecolor(String color,WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
					try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
		}
}
}