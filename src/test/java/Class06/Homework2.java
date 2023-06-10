package Class06;
//Go to:  http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
//Click on get new user
//Print the first name of user

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Click on get new user
        WebElement newUserBtn = driver.findElement(By.xpath("//button[@id='save']"));
        newUserBtn.click();

        //Print the first name of user
        WebElement firstNameUser = driver.findElement(By.xpath("//p[contains(text(), 'First Name')]"));
        System.out.println(firstNameUser.getText());
        driver.close();
    }
}
