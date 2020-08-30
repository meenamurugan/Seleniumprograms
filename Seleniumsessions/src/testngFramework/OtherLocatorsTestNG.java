package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OtherLocatorsTestNG {
	WebDriver driver;
	
	@Test 
	public void a_pageLoad() 
	{
	System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	driver.manage().window().maximize();
	}
	@Test
	public void b_logIn()
	{
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.cssSelector("#email")).sendKeys("Thur15@gmail.com");
		driver.findElement(By.cssSelector("#passwd")).sendKeys("Passw0rd$123");
		WebElement submitlogin=driver.findElement(By.id("SubmitLogin"));
		submitlogin.click();
	}
}
