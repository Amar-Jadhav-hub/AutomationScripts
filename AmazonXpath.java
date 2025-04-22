package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        
        driver.navigate().to("https://www.amazon.in");
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        driver.navigate().refresh();
        
        driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
        
        driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        
        driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Virat Kohli");
        
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8659522047");
        
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aj@8546");
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        
        
    }

}
