package dempPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheckpoint {

	public static void main(String[] args) {
		
		String driverPath = "C:\\Users\\91953\\Desktop\\Selenium\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();  
		driver.navigate().to("https://www.orangehrm.com/"); 
		
		String expectedTitle = "orangeHRM";
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle1 = "CONTACT SALES";
		String actualTitle1 = driver.getTitle();
		
		if(actualTitle1.equals(expectedTitle1)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle2 = "Features";
		String actualTitle2 = driver.getTitle();
		
		if(actualTitle2.equals(expectedTitle2)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle3 = "Success Stories ";
		String actualTitle3 = driver.getTitle();
		
		if(actualTitle3.equals(expectedTitle3)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle4 = "Partners";
		String actualTitle4 = driver.getTitle();
		
		if(actualTitle4.equals(expectedTitle4)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle5 = "Blog";
		String actualTitle5 = driver.getTitle();
		
		if(actualTitle5.equals(expectedTitle5)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle6 = "Free 30 Day Trial";
		String actualTitle6 = driver.getTitle();
		
		if(actualTitle6.equals(expectedTitle6)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle7 = "En";
		String actualTitle7 = driver.getTitle();
		
		if(actualTitle7.equals(expectedTitle7)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		
		String expectedTitle8 = "Es";
		String actualTitle8 = driver.getTitle();
		
		if(actualTitle8.equals(expectedTitle8)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}

		
		String expectedTitle9 = "Accept Cookies";
		String actualTitle9 = driver.getTitle();
		
		if(actualTitle9.equals(expectedTitle9)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}

		
		String expectedTitle10 = "Cookie Settings";
		String actualTitle10 = driver.getTitle();
		
		if(actualTitle10.equals(expectedTitle10)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}
		

		String expectedTitle11 = "We use cookies to personalise content and ads, to provide social"
								  + " media features and to analyse our traffic. We also share information"
								  + " about your use of our site with our social media, advertising and analytics partners.";
		String actualTitle11 = driver.getTitle();
		
		if(actualTitle11.equals(expectedTitle11)) {
		System.out.println("pass");

	}
		else {
			System.out.println("pass");
		}


}
}
