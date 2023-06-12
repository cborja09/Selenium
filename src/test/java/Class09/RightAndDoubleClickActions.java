package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Find the element to be right click
        WebElement rightClickBtn = driver.findElement(By.xpath("//span[text()='right click me']"));

        //Action class
        Actions action = new Actions(driver);

        //Perform the right click
        //Right click is also called context click
        action.contextClick(rightClickBtn).perform();

        //Find the element which is edit option
        WebElement editOpt = driver.findElement(By.xpath("//span[text()='Edit']"));
        action.click(editOpt).perform();

        //Clicking edit alert appears
        //In order to handle the alert
        Alert alert = driver.switchTo().alert();
        alert.accept();

        //Find the WebElement to double click on
        WebElement doubleClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
        action.doubleClick(doubleClick).perform();


    }
}
