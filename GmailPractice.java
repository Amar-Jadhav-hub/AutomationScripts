package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailPractice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.gmail.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Create account']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[text()='For my personal use']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Jack");

		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Sparrow");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		month.click();

		Select s = new Select(month);
		s.selectByVisibleText("March");

		driver.findElement(By.xpath("//input[@id='day']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2005");

		WebElement gender = driver.findElement(By.xpath("//select[@id='gender']"));
		gender.click();

		Thread.sleep(2000);

		Select s1 = new Select(gender);
		s1.selectByIndex(2);

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("jacksparrow1568455");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}
}
