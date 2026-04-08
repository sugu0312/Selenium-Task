package Task02;

import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonSearchAutomation {

	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	@Test
	public void searchAutomation() {
		
		WebElement searchbox= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
		searchbox.sendKeys("iphone");
		
		WebElement searchbtn=wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-search-submit-button")));
		searchbtn.click();
		
		//wait.until(ExpectedConditions.titleContains("Amazon"));
		
	//	System.out.println("Title is : "+ driver.getTitle());
		
	//	WebElement selectphone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("puisg-col puisg-col-4-of-4 puisg-col-4-of-8 puisg-col-4-of-12 puisg-col-4-of-16 puisg-col-4-of-20 puisg-col-4-of-24 puis-list-col-left")));
	//	selectphone.click();
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
