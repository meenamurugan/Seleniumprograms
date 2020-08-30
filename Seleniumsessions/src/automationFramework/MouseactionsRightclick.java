package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseactionsRightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement right=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act= new Actions(driver);
		act.contextClick(right).build().perform();
		driver.findElement(By.xpath("//span[contains(text(),'Cut')]")).click();
		Alert aler=driver.switchTo().alert();
		String popuptext= aler.getText();
		System.out.println(popuptext);
		aler.accept();
		
		
		
		
		

	}

}
