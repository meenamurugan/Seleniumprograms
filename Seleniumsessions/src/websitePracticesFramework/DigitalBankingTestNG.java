package websitePracticesFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DigitalBankingTestNG {
WebDriver driver;

	@Test 
	public void a_pageLoad()
	{
	System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("http://dbankdemo.com/login");
	driver.manage().window().maximize();
	}
	
	@Test
	public void  b_signUp()  
	{
	driver.findElement(By.xpath("//a[contains(text(),'Sign Up Here')]")).click();
	}
	@Test
	public void c_personalInfo() throws InterruptedException
	{
	Select title= new Select (driver.findElement(By.xpath("//select[@id='title']")));
	title.selectByValue("Ms.");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Meena");
	driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Murugan");
	Thread.sleep(2000);
	WebElement radio1= driver.findElement(By.xpath("(//input[@id='gender'])[2]"));
	Thread.sleep(5000);
	radio1.click();
	driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("30/08/1998");
	driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("098-76-5432");
	driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("meena123@gmail.com");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("August@123");
	driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("August@123");
	driver.findElement(By.xpath("//button[text()='Next']")).click();
	Thread.sleep(2000);
	}
	
}
