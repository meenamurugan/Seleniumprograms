package websitePracticesFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class JpetStoreTestNg {
WebDriver driver;


	@Test
	public void a_pageLoad()
	{
	System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	driver.manage().window().maximize();

	}
	@Test
	public void b_signUp() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Sign In')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]")).click();
		Thread.sleep(2000);
	}
	@Test
	public void c_userInfo() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("Meena");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("aug@123");
		driver.findElement(By.xpath("//input[@name='repeatedPassword']")).sendKeys("aug@123");
		Thread.sleep(2000);
	}
	@Test
	public void d_accountInfo()
	{
		driver.findElement(By.name("account.firstName")).sendKeys("Meena");
		driver.findElement(By.name("account.lastName")).sendKeys("Murugan");
		driver.findElement(By.name("account.email")).sendKeys("muruganmeena08@gmail.com");
		driver.findElement(By.name("account.phone")).sendKeys("7339028662");
		driver.findElement(By.xpath("//input[@name='account.address1']")).sendKeys("T.S.V.V");
		driver.findElement(By.xpath("//input[@name='account.address2']")).sendKeys("Veerannan Street");
		driver.findElement(By.name("account.city")).sendKeys("Dindigul");
		driver.findElement(By.xpath("//input[@name='account.state']")).sendKeys("Tamil Nadu");
		driver.findElement(By.xpath("//input[@name='account.zip']")).sendKeys("624301");
		driver.findElement(By.xpath("//input[@name='account.country']")).sendKeys("India");
	}
	@Test
	public void e_profileInfo() throws InterruptedException
	{
		Select language=new Select(driver.findElement(By.name("account.languagePreference")));
		language.selectByValue("english");
		Thread.sleep(2000);
		Select category= new Select (driver.findElement(By.name("account.favouriteCategoryId")));
		category.selectByValue("DOGS");
		Thread.sleep(2000);
		WebElement radio1=driver.findElement(By.name("account.listOption"));
		Thread.sleep(3000);
		radio1.click();
		WebElement radio2=driver.findElement(By.name("account.bannerOption"));
		Thread.sleep(3000);
		radio2.click();
		driver.findElement(By.xpath("//input[@name='newAccount']")).click();
		Thread.sleep(2000);
		
	}

}
