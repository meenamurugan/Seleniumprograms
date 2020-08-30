package automationFramework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class automationTesting {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://selenium//geckodriver-v0.27.0-win32//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//Alert popup
		WebElement AlertButton = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		AlertButton.click();
		Thread.sleep(2000);
		Alert aler = driver.switchTo().alert();
		String text1 = aler.getText();
		System.out.println(text1);
		aler.accept();
		//Confirm Popup
		WebElement AlertwithOKandcancel = driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel ')]"));
		AlertwithOKandcancel.click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Alert confirm = driver.switchTo().alert();
		String text2 = aler.getText();
		System.out.println(text2);
        //confirm.accept();
        confirm.dismiss();
        // Prompt Popup
        WebElement AlertwithTextbox = driver.findElement(By.xpath("(//a[@class='analystic'][3])"));
        AlertwithTextbox.click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        String text3 = prompt.getText();
        System.out.println(text3);
        prompt.sendKeys("meena");
        prompt.accept();

	}

}
