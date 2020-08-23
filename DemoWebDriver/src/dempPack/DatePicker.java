package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[contains(text(),'Flights')]")).click();
		driver.findElement(By.xpath("//select[@id='ctl00_mainContent_ddl_originStation1']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("Delhi(DEL)");
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		String checkindate = "10-August20202";
		String splitter[] = checkindate.split("-");
		String checkin_month_year= splitter[1];
		String checkinday = splitter[0];
		
		System.out.println(checkin_month_year);
		System.out.println(checkinday);
		
		driver.findElement(By.xpath("//span[contains(text(),'July')]"));
		
		
		
		
		
		
		
		
		
		
		
		}

}
