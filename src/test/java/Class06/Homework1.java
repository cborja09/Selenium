package Class06;

//Go to: http://practice.syntaxtechs.net/dynamic-elements-loading.php
//Click on start
//Print the text "welcome syntax technologies" on console

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homework1 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Click on start button
        WebElement startBtn = driver.findElement(By.xpath("//button[@id='startButton']"));
        startBtn.click();

        //Print the text "welcome to syntax technologies"
        WebElement textMessage = driver.findElement(By.xpath("//h4[text()='Welcome Syntax Technologies']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElement(textMessage, "Welcome Syntax Technologies"));
        System.out.println("The text after clicking on the start button is : "+ textMessage.getText());
        driver.close();
    }
}
