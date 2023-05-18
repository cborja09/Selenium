package Class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver(); // create instance

        driver.get("https://www.google.com"); // go to the Google site

        Thread.sleep(2000); // slow down process

        driver.navigate().to("https://www.facebook.com");

        Thread.sleep(2000); // slow down process

        driver.navigate().refresh(); // refresh the page after waiting for 2 seconds

        Thread.sleep(1000); // slow down process

        driver.navigate().back(); // takes back to previous page

        Thread.sleep(2000); // slow down process

        driver.navigate().forward(); // goes forward

        //driver.quit(); // close the browser

        driver.close(); // close the current tab


    }
}
