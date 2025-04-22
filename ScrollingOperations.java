package testpackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jquery.com");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,800)");

		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0,-800)");

		js.executeScript("window.scrollBy(500,0)");

		js.executeScript("window.scrollBy(-500,0)");

	}

}
