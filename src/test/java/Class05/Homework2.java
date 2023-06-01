package Class05;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homework2 extends CommonMethods {
    /*
    Go to: https://chercher.tech/practice/frames
    Click on check box
    Then select baby cat from drop down
    Then enter text in text box (edited)
     */
    public static void main(String[] args) throws InterruptedException {
        String url = "https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //click on check box
        driver.switchTo().frame("frame1");
        driver.switchTo().frame("frame3");
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        Thread.sleep(2000);

        //then select baby cat
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='animals']"));
        Select select = new Select(dropDown);
        select.selectByValue("babycat");
        Thread.sleep(2000);

        //then enter text in text box
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("Type something here!");


    }
}
