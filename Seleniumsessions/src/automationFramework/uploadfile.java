package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadfile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\selenium\\image\\falls.jpeg");
		Thread.sleep(2000);
		WebElement filecheckbox = driver.findElement(By.id("terms "));
		filecheckbox.click();
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
		
		

	}

}
