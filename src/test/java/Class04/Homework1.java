package Class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homework1 extends CommonMethods {
    /*
    Go to: http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
    Select Tuesday, Thursday and Friday one by one
    */
    public static void main(String[] args) throws InterruptedException {

        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement day = driver.findElement(By.xpath("//select[@id='select-demo']"));

        Select sel = new Select(day);

        sel.selectByVisibleText("Tuesday");

        Thread.sleep(2000);

        sel.selectByValue("Thursday");

        Thread.sleep(2000);

        sel.selectByIndex(6);




    }
}
