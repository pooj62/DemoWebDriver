package dempPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		/*Select select1 = new Select(day);
		select1.selectByVisibleText("8");
		
		Select select2 = new Select(month);
		select2.selectByVisibleText("Jul");
		
		Select select3 = new Select(year);
		select3.selectByVisibleText("1991");*/
		
		String dob = "10-May-1990";
		String dobArr[]= dob.split("-");
		
		selectValueFromDropDown(day,dobArr[0]);
		selectValueFromDropDown( month,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);

		
		//selectValueFromDropDown(day,"8");
		//selectValueFromDropDown( month,"Jul");
		//selectValueFromDropDown(year,"1991");

	}
	public static void selectValueFromDropDown(WebElement element, String value) {
	Select select = new Select(element);
	select.selectByVisibleText(value);
}

}
