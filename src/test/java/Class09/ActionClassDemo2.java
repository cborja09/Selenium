package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://jqueryui.com/droppable/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Element is inside an iframe, so we must switch focus
        driver.switchTo().frame(0);

        //Find the draggable WebElement
        WebElement drag = driver.findElement(By.id("draggable"));

        //Find the WebElement where you want to drop
        WebElement drop = driver.findElement(By.id("droppable"));

        //Action Class
        Actions action = new Actions(driver);
        action.dragAndDrop(drag,drop).perform();

    }
}
