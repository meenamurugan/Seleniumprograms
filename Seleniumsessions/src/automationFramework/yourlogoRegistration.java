package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class yourlogoRegistration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("meenaug04@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(4000);
		WebElement gender=driver.findElement(By.id("uniform-id_gender1"));
		gender.click();
		driver.findElement(By.id("customer_firstname")).sendKeys("meena");
		driver.findElement(By.id("customer_lastname")).sendKeys("murugan");
		driver.findElement(By.id("passwd")).sendKeys("Aug123");
		Select date=new Select (driver.findElement(By.id("days")));
		date.selectByVisibleText("15  ");
		Select month=new Select (driver.findElement(By.id("months")));
		month.selectByVisibleText("August ");
		Select year=new Select (driver.findElement(By.id("years")));
		year.selectByVisibleText("1998  ");
		WebElement select=driver.findElement(By.id("newsletter"));
		select.click();
		driver.findElement(By.id("firstname")).sendKeys("Tuesday");
		driver.findElement(By.id("lastname")).sendKeys("August");
		driver.findElement(By.id("address1")).sendKeys("123 TSVV");
		driver.findElement(By.id("city")).sendKeys("wednesday");
		Select state=new Select (driver.findElement(By.id("id_state")));
		state.selectByVisibleText("Indiana");
		driver.findElement(By.id("postcode")).sendKeys("00012");
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
