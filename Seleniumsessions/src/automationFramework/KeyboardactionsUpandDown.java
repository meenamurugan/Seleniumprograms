package automationFramework;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardactionsUpandDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/inputs");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//p[text()='Number']/following::input")).sendKeys("5");
		Actions act = new Actions(driver);
		for(int i=1;i<=5;i++);
		{
         Thread.sleep(2000);	
         act.sendKeys(Keys.ARROW_UP).build().perform();
		}
		
	}

}
