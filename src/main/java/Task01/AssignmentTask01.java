package Task01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentTask01 {

	public static void main(String[] args) throws InterruptedException {
		
		//setup driver
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//open webpage
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		//print title
		System.out.println(driver.getTitle());
		
		//print current URl
		System.out.println(driver.getCurrentUrl());
		

	}

}
