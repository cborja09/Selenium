package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    /*
    Task:
    Navigate to Google.com
     */

    public static void main(String[] args) throws InterruptedException {
        //declare the instance
        WebDriver driver = new ChromeDriver();
        // use .get(url) to navigate to the desired url
        driver.get("https://www.google.com");

        // maximize the window
        driver.manage().window().maximize();

        // gets the current url
        String currentURL = driver.getCurrentUrl();
        System.out.println("the current url of the websisite is : "+currentURL);

        // get the title of the page
       String title = driver.getTitle();
        System.out.println("the title of the page is : "+title);

        // add some wait time
        Thread.sleep(5000);
        // close the browser
        driver.quit();
    }
}
