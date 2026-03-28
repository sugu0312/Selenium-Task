package Task02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchAutomation {

	public static void main(String[] args) throws InterruptedException {
		
		//setup driver
		WebDriverManager.chromedriver().setup();

		//launch browser and maximize
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//open website
		driver.get("https://www.amazon.in");
		
		Thread.sleep(3000);
		
		//find search box and enter
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Laptop");
		
		//check search button and click ok
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		
		//select item and click ok
		driver.findElement(By.className("a-size-medium")).click();

		Thread.sleep(3000);
		
		 driver.navigate().back();
		
			/*
			 * WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5)); wait.
			 until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(null)));		*/
		
	}

}
