package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoToolTip {

	public static void main(String[] args) {
			
			String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.flipkart.com/samsung-mobile-store?otracker=nmenu_sub_Electronics_0_Samsung");
			driver.manage().window().maximize();
			String tooltipText = driver.findElement(By.xpath("//a[contains(text(),'Samsung Galaxy S10 Lite (Prism Black, 512 GB)')]")).getAttribute("title");
		    System.out.println(tooltipText);
			}

}

