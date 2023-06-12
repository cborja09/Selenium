package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Find the draggable WebElement
        WebElement drag = driver.findElement(By.id("draggable"));

        //Find the WebElement where you want to drop
        WebElement drop = driver.findElement(By.id("droppable"));



    }
}
