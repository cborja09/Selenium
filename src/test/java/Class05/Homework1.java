package Class05;

import Utlis.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework1 extends CommonMethods {
    /*
    Go to: http://practice.syntaxtechs.net/javascript-alert-box-demo.php
    Click on the last alert
    Send keys and accept it
    Note: don't worry if the text you send doesn't appear up in the text box
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement alertThird = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertThird.click();
        Thread.sleep(2000);

        Alert confirmAlert3 = driver.switchTo().alert();
        Thread.sleep(2000);
        confirmAlert3.sendKeys("Shakka brah");
        Thread.sleep(2000);
        confirmAlert3.accept();


    }
}
