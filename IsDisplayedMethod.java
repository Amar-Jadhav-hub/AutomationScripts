package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement googleLogo = driver.findElement(By.xpath("//img[@class='lnXdpd']"));

		boolean result = googleLogo.isDisplayed();

		if (result) {
			System.out.println("Google Logo is present");
		} else {
			System.out.println("Google Logo is absent");
		}
		driver.close();
	}

}
