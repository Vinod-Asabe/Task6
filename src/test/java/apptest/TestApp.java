package apptest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestApp {

	WebDriver driver;
	@Test
	public void Main() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinod\\eclipse-workspace\\Assignment1\\Driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        
	        driver.get("https://auth.geeksforgeeks.org/");
	        
	        driver.findElement(By.name("user")).sendKeys("vinodasabe35@gmail.com");
	        driver.findElement(By.name("pass")).sendKeys("1705@Vinod");
	        
	        driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	}
}
