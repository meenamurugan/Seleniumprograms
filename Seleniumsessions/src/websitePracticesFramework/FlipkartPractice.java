package websitePracticesFramework;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement item = driver.findElement(By.xpath("(//span[@class='_1QZ6fC _3Lgyp8'])[1]"));
		item.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]//span[@class='nsslWl']")).click();
		
		
		

	}

}
