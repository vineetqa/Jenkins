package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
	@Test
	public void tastcase()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alka\\workspace2\\Jenkins\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("Hello");
	driver.findElement(By.id("pass")).sendKeys("Hello");
	driver.quit();
	
	
	}

}
