package dempPack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91953\\Desktop\\Selenium1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		WebDriver driver1 = new ChromeDriver();
		 
	    driver1.navigate().to("https://www.facebook.com/");  
	    driver1.findElement(By.id("email")).sendKeys("poojachaudhary251@gmail.com");
	    driver1.findElement(By.id("pass")).sendKeys("Puja62@hbti");
	    driver1.findElement(By.id("u_0_4")).click();
	    
	    
	    String expectedURL = "https://www.facebook.com/";
        String actualURL=driver1.getCurrentUrl();
        if(actualURL.equals(expectedURL)) {
        	System.out.println("Pass");
	}
        	else {
        		System.out.println("fail");
        	}
        	
        String expectedTitle = "facebook";
		String actualTitle = driver1.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("pass");

	}
	  
		
	}

}
