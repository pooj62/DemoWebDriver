package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		
		option.setHeadless(true);//this line is actually enables the headless mode
		
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.keycdn.com/blog/headless-browsers");
		
		System.out.println("print title" +driver.getTitle());
		
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true); //this line is actually enables the headless mode
		WebDriver driver1 = new ChromeDriver(options);
		driver1.navigate().to("https://google.com");
		driver1.findElement(By.name("q")).sendKeys("hello");
		driver1.close();
	}

}
