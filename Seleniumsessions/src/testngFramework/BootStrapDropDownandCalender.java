package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootStrapDropDownandCalender {
	WebDriver driver;

	@Test 
	public void a_pageLoad()
	{
	System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void b_dropdown() {
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
	}
}
