package testpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlert {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Alert alt = driver.switchTo().alert();

		String text1 = alt.getText();
		System.out.println(text1);
		alt.accept();

		// alt.dismiss();

		String text = alt.getText();
		System.out.println(text);

		// alt.sendKeys("");

	}

}
