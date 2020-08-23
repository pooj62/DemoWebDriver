package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/seeker/registration");
		
		driver.findElement(By.xpath("/span[@class='browse-text']")).sendKeys("C:\\Users\\91953\\Downloads.pdf");
		

	}

}
