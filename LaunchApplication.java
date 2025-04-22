package testpackage;

//                program to get the url link using get method.      //

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LaunchApplication {
//    
//    public static void main(String[] args) throws InterruptedException {
//        
//        WebDriver driver=new ChromeDriver();
//      
//        driver.get("https://www.sevenmentor.com");
//        
//        driver.manage().window().maximize();
//        
//        Thread.sleep(3000); 
//          
//    }
//}

//      program to set application size in maximum and also set the size and position of the application window. //

//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class LaunchApplication {
//    
//    public static void main(String[] args) throws InterruptedException {
//        
//        WebDriver driver=new ChromeDriver();
//       
//        driver.navigate().to("https://www.sevenmentor.com");
//         
//        driver.manage().window().maximize();
//     
//        Thread.sleep(3000); 
//        
//        driver.navigate().refresh();
//       
//        Thread.sleep(1000);
//        driver.navigate().back();
//      
//        Thread.sleep(1000);
//        driver.navigate().forward();
//        
//        Dimension d=new Dimension(200,400);
//        driver.manage().window().setSize(d);
//        
//        Point p=new Point(400,400);
//        driver.manage().window().setPosition(p);
//        
//        
//    }
//}

//                      Program to get url and matching the actual and Expected url. //

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  LaunchApplication  {
    
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver=new ChromeDriver();
        
        driver.get("https://www.amazon.in");
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
        
        String ActualUrl=driver.getCurrentUrl();
        
        System.out.println(ActualUrl);
        
        String ExpectedUrl="https://www.amazon.in/";
        
        if(ActualUrl.equalsIgnoreCase(ExpectedUrl))
        {
            System.out.println("Navigated to correct page");
        }
        else
        {
            System.out.println("Invalid webpage");
        }
        driver.quit();
       
    }

}
