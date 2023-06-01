package Class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Homework2 extends CommonMethods {
    /*
    Go to: facebook.com
    Click on create account
    and select your date of birth using select class
    */
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement regButton = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        regButton.click();

        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select selMonth = new Select(month);
        selMonth.selectByVisibleText("Jan");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select selDay = new Select(day);
        selDay.selectByValue("1");
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select selYear = new Select(year);
        selYear.selectByValue("2003");
        Thread.sleep(2000);




    }

}
