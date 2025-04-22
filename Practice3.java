package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");

		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,1500)");

	}

}
