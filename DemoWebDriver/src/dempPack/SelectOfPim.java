package dempPack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectOfPim {

	public static void main(String[] args) throws InterruptedException {
		String[] chkBox=new String[5];
		for(int i=0;i<chkBox.length;i++) {
			//chkBox[i]=sc.nextString();
		}
		 String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();  
			driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/dashboard"); 
			
			WebElement username=driver.findElement(By.id("txtUsername"));
	        WebElement password=driver.findElement(By.id("txtPassword"));
	        WebElement login=driver.findElement(By.id("btnLogin"));
	        
	        username.sendKeys("Admin");
	        password.sendKeys("admin123");
	        login.click();
	 
	        
	        
	        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	        
	        WebElement pim=driver.findElement(By.xpath("//b[contains(text(),'PIM')]"));
	        Actions act = new Actions(driver);
	        Thread.sleep(2000);
	        act.moveToElement(pim).perform();{
	        System.out.print("Pim is selected");
	        
	        
	        
	        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList/reset/1");  
	        WebElement employeelist=driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']"));
	       
	        Thread.sleep(2000);
	        act.moveToElement(employeelist).perform();
	        employeelist.click();{
	        System.out.print("Click on EmployeeList");
	        }
	      
	       
	       //WebElement element = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_"+i+"']"));
	       //if(!ele.isSelected()) 
					//ele.click();
					System.out.print("All checkbox is selected");
//WebElement chk2 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_6']"));
//System.out.print(chk2.isSelected());
	       		}
	}
}
	        
	        
	       
	     
	        
	

	        

	


