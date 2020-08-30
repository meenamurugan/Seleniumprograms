package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingpopups {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		//Alert Popup
		WebElement AlertButton = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
		AlertButton.click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		String text1 = aler.getText();
		System.out.println(text1);
		aler.accept();
		//Confirm Popup
		WebElement ConfirmButton = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
		ConfirmButton.click();
        Thread.sleep(2000);
        Alert confirm = driver.switchTo().alert();
        String text2 = confirm.getText();
        System.out.println(text2);
        //confirm.accept();
        confirm.dismiss();
        // Prompt Popup
        WebElement PromptButton = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        PromptButton.click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        String text3 = prompt.getText();
        System.out.println(text3);
        prompt.sendKeys("meena");
        prompt.accept();
        
        
	}

}
