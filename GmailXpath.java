package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailXpath {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver =new ChromeDriver();
        
        driver.get("https://www.gmail.com");
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        WebElement create=driver.findElement(By.xpath("//span[text()='Create account']"));
        create.click();
        
        WebElement personal=driver.findElement(By.xpath("//span[text()='For my personal use']"));
        personal.click();
        
        WebElement firstname=driver.findElement(By.xpath("//input[@id='firstName']"));
        firstname.sendKeys("Virat");
        
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastName']"));
        lastname.sendKeys("Kohli");
        
        WebElement next=driver.findElement(By.xpath("//span[text()='Next']"));
        next.click();
        
    }

}