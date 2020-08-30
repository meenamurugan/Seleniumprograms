package websitePracticesFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MILLISECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
	}

}
