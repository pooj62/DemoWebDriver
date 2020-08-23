package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebtable {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("pooja.chaudhary62@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Puja62@hbti");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		//driver.switchTo().frame("contact");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
	
		String before_xpath = "*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[";
		String after_xpath = "]/td[2]";
		
		for(int i=1;i<=3;i++) {
			String name = driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
			
			System.out.println(name);
		}
	}

}
////*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]