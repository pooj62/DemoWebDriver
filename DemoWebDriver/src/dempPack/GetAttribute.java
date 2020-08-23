package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement attribute = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement attribute1 = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		attribute.sendKeys("Tom");
		attribute1.sendKeys("Jimmy");
		
		String fname = attribute.getAttribute("value");//tom
		System.out.println(fname);
		String lname = attribute1.getAttribute("value");//jimmy
		System.out.println(lname);

	}

}
