package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerificationCommendsTestNG {
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
	public void b_verification() throws InterruptedException
	{
		Thread.sleep(5000);
		Boolean radiocheck=driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).isEnabled();
		System.out.println(radiocheck);
		WebElement returncheck= driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		returncheck.click();
		Boolean roundtripcheck =driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isEnabled();
		System.out.println(roundtripcheck);
		WebElement studentcheckbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		studentcheckbox.click();
		Boolean studentcheck =driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected();
		System.out.println(studentcheck);
		Boolean informationcheck =driver.findElement(By.xpath("//span[contains(text(),'Covid-19 Information')]")).isDisplayed();
	System.out.println(informationcheck);
	}
}
