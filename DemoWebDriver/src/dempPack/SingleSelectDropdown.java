package dempPack;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) {
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();  
		
		WebElement element = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Adobe InDesign");
		
		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("FirstElement = " +firstEle.getText());
		
		List<WebElement> ListOptions = sel.getOptions(); 
		for(WebElement webelement : ListOptions) {
			System.out.println("options -" +webelement.getText());
		}
		sel.deselectAll();    //dselect option is not a applicable 

	}

}
