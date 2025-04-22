package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://makemytrip.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement MobileNo = driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']"));

		boolean result = MobileNo.isEnabled();

		if (result) {
			System.out.println("mobile field is enabled");
		} else {
			System.out.println("Disabled");
		}
		
		driver.close();

	}

}
