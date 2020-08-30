package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='name2ade2d8e']")).sendKeys("Meenakshi");
		driver.findElement(By.xpath("//input[@name='login2ade2d8e']")).sendKeys("aug123@gmail.com");
		
	}

}
