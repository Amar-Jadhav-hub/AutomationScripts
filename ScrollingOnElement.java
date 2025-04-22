package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOnElement {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement widgetFactory = driver.findElement(By.xpath("//a[text()='Widget Factory']"));

		widgetFactory.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		js.executeScript("arguments[0].ScrollIntoView(true)", widgetFactory);
	}

}
