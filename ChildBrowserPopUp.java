package testpackage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/js_popup.asp");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement alert = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']"));

		WebElement confirm = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_confirm']"));

		WebElement prompt = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_prompt']"));

		WebElement linebreaks = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert2']"));

		alert.click();
		Thread.sleep(2000);
		confirm.click();
		Thread.sleep(2000);
		prompt.click();
		Thread.sleep(2000);
		linebreaks.click();
		Thread.sleep(2000);

		String main = driver.getWindowHandle();
		System.out.println(main);

		ArrayList<String> addrs = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(addrs.get(1));
		System.out.println(addrs.get(2));
		System.out.println(addrs.get(3));
		System.out.println(addrs.get(4));

		for (int i = 1; i < addrs.size(); i++) {
			driver.switchTo().window(addrs.get(i));

			String Url = driver.getCurrentUrl();

			System.out.println("index:" + i + "" + Url);
			Thread.sleep(3000);
		}
	}
}