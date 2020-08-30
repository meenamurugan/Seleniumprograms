package testngFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTestNG {
	WebDriver driver;

	
	@Test 
	public void a_pageLoad()
	{
	System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://zero.webappsecurity.com/");
	driver.manage().window().maximize();
	}
	@Test
	public void b_assertEquals()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertEquals(element1, "ONLINE BANKINGG");
		System.out.println("assertequals pass");
	}
	@Test
	public void c_assertNotequals()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertNotEquals(element1, "ONLINE BANKINGG");
		System.out.println("assertnot equals pass");
	}
	@Test
	public void d_assertTrue()
	{
		Assert.assertTrue("ONLINE BANKING".equals(driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText()));
		System.out.println("assert true pass");
	}
	@Test
	public void e_assertFalse()
	{
		String element1 = driver.findElement(By.xpath("//strong[contains(text(),'Online Banking')]")).getText();
		Assert.assertFalse("ONLINE BANKINGG".equals(element1));
		System.out.println("assert false pass");
		
	}
	@Test
	public void f_assertNotnull()
	{
		Object obj=driver.getTitle();
		Assert.assertNotNull(obj);
		System.out.println("assert not null pass");
	}
	@Test
	public void g_assertNull()
	{
		Object obj=null;
		Assert.assertNull(obj);
		System.out.println("assert null pass");
	}
	
}
