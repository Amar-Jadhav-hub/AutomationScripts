package testpackage;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LocatorsInselenium {
//    public static void main(String[] args) {
//        // 1. Set ChromeDriver path (Update with your path)
//        System.setProperty("webdriver.chrome.driver", "https://www.google.com");
//
//        // 2. Initialize ChromeDriver
//        WebDriver driver = new ChromeDriver();
//
//        // 3. Open Google.com
//        driver.get("https://www.google.com");
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInselenium {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Pune");

		Thread.sleep(3000);

		WebElement location = driver.findElement(By.xpath("//span[text()='Pune']"));
		location.click();

	}

}