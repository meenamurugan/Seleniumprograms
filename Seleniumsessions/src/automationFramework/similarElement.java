package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class similarElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Rajinikanth");
		driver.manage().window().maximize();
		int linkscount = driver.findElements(By.tagName("a")).size();
		System.out.println(linkscount);
		int imagescount = driver.findElements(By.tagName("img")).size();
		System.out.println(imagescount);
	}

}
