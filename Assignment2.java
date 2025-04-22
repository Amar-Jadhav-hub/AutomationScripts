package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address or phone number')]"));
		email.sendKeys("ViratKohli18@gmail.com");

		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("RCB@25");

		Thread.sleep(1000);

		WebElement button = driver.findElement(By.xpath("//button[@value='1']"));
		button.click();

		Thread.sleep(2000);

		driver.close();

	}

}


