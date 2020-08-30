package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webappsLogin {
	WebDriver driver;

	
		@Test (priority=1)
		public void pageLoad()
		{
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
		}
		
		@Test (priority=2)
		public void signIn() throws InterruptedException
		{
		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		Thread.sleep(5000);
}
		@Test (priority=3)
		public void logIn() throws InterruptedException
		{
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		}

	}


