package Task01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	public static void main(String[] args) {
		
		//setup driver
		WebDriverManager.chromedriver().setup();
		
		//Launch browser
		WebDriver driver=new ChromeDriver();
		
		//open website
		driver.get("https://www.google.com");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//print title
		System.out.println(driver.getTitle());
		
		//close browser
		driver.quit();
	}

}
