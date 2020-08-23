package dempPack;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDate2 {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select select = new Select(day);
		
		select.selectByIndex(10);
		 
		System.out.println(select.isMultiple());//return boolean value-true
		
		List<WebElement> listdays= select.getOptions();
		System.out.println(listdays.size());//output-32
		
		int totaldays=listdays.size()-1;
		System.out.println("Total days :" +totaldays);//output-31
		
		for(int i=0; i<listdays.size(); i++) {
			String dayValue = listdays.get(i).getText();
			System.out.println(dayValue);
			if(dayValue.equals("15")) {
				listdays.get(i).click();
				break;
			}
		}
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select select1 = new Select(month);
		select1.selectByVisibleText("Jul");
		
		System.out.println(select.isMultiple());//return boolean value-true
		
		List<WebElement> listmonth= select.getOptions();
		System.out.println(listmonth.size());
		
		String totalmonth=month.getText();
		System.out.println("Total month :" +totalmonth);
		
		
		WebElement year = driver.findElement(By.xpath(" //select[@id='year']"));
		
		Select select2 = new Select(year);
		select2.selectByValue("1991");
		
		System.out.println(select2.isMultiple());
		
		List<WebElement> listyear = select2.getOptions();
		System.out.println(listyear.size());
		
		String totalyear = year.getText();
		System.out.println("Total days :" +totalyear);
		
	}
}

	

	
