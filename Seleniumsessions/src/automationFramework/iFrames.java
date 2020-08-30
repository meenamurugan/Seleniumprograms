package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://nunzioweb.com/index.shtml");
		driver.manage().window().maximize();
		int iframescount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(iframescount);
		driver.switchTo().frame("oddcouple");
		String iframetext =driver.findElement(By.xpath("//div[contains(text(),'television ')]")).getText();
		System.out.println(iframetext);

	}

}
