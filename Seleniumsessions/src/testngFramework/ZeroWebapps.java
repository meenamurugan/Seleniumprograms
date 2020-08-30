package testngFramework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZeroWebapps {
	WebDriver driver;

	@Test
	public void a_pageLoad() {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://zero.webappsecurity.com/");
		driver.manage().window().maximize();
	}

	@Test
	public void b_signIn() throws InterruptedException, IOException {
		driver.findElement(By.xpath("//button[@id='signin_button']")).click();
		Thread.sleep(5000);
		getscreenshot();
	}

	@Test
	public void c_logIn() throws InterruptedException, IOException {
		driver.findElement(By.id("user_login")).sendKeys("username");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(5000);
		getscreenshot();
	}

	public void getscreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File("D:\\selenium\\Screenshots\\Screenshot" + System.currentTimeMillis() + ".png"));
	}
}
