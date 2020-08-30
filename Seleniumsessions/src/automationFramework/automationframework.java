package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationframework {


	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
			driver.findElement(By.id("u_0_m")).sendKeys("meena");
		driver.findElement(By.name("lastname")).sendKeys("murugan");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("muruganmeena30@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Meena@123");
				
		

	}

}
