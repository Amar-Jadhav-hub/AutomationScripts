package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
        
        public static void main(String[] args) throws InterruptedException {
            
            WebDriver driver=new ChromeDriver();
            
            driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
            
            driver.manage().window().maximize();
            
            Thread.sleep(3000);
            
            Actions act=new Actions(driver);
            
            WebElement signin=driver.findElement(By.xpath("//a[@href='https://selenium08.blogspot.com/']"));
            
            act.contextClick(signin);
            act.doubleClick(signin);
            
            act.build().perform();
    }

}