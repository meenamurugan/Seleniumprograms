package automationFramework;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/#");
		driver.manage().window().maximize();
		WebElement create =driver.findElement(By.xpath("(//a[contains(text(),'account')])[1]"));
		create.click();
		ArrayList<String> gmailtabs =new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(gmailtabs.get(1));
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Meena");
	}

}
