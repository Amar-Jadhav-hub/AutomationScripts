package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver (Chrome)
        WebDriver driver = new ChromeDriver();

        try {
            // Open a web application (Google)
            driver.get("https://www.google.com");
            System.out.println("Opened Google");

            // Wait for 2 seconds
            Thread.sleep(2000);

            // Navigate to another website (YouTube)
            driver.get("https://www.youtube.com");
            System.out.println("Navigated to YouTube");

            // Wait for 3 seconds
            Thread.sleep(3000);

            // Go back to the previous page (Google)
            driver.navigate().back();
            System.out.println("Navigated Back to Google");

            // Wait for 2 seconds
            Thread.sleep(2000);

            // Go forward to YouTube again
            driver.navigate().forward();
            System.out.println("Navigated Forward to YouTube");

            // Wait for 2 seconds
            Thread.sleep(2000);

            // Refresh the page
            driver.navigate().refresh();
            System.out.println("Page Refreshed");

            // Wait before closing
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
            System.out.println("Browser Closed");
        }
    }
}
