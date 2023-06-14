package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://amazon.com";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Perform a scroll operation
        //Using JavaScript

        JavascriptExecutor js =(JavascriptExecutor) driver;
        //Scroll down
        js.executeScript("window.scrollBy(0, 500)");
        //Sleep for observation
        Thread.sleep(3000);
        //Scroll up
        js.executeScript("window.scrollBy(0, -500)");

        //Click on drop down "All"
        //Use click from jsExecutor
        WebElement select = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        js.executeScript("arguments[0].click();",select);

    }
}
