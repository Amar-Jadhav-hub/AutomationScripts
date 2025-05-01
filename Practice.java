package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		WebElement drag = driver.findElement(By.xpath("//[@id='draggable']"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		act.dragAndDrop(drag, drop);

		Thread.sleep(2000);

		act.build().perform();

		driver.manage().window().minimize();

	}
}

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//public class Practice {
//
//	public static void main(String[] args) throws InterruptedException {

//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
//
//		driver.manage().window().maximize();
//
//		Thread.sleep(3000);
//
//		WebElement drag = driver.findElement(By.id("draggable"));
//
//		WebElement drop = driver.findElement(By.id("droppable"));
//
//		Actions act = new Actions(driver);
//
//		act.dragAndDrop(drag, drop);
//
//		Thread.sleep(2000);
//
//		act.build().perform();
//
//		//driver.close();
//
//		driver.quit();
//
//	}
//}
