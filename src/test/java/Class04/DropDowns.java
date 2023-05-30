package Class04;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDowns extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        //because the DOM doesn't have first name by default
        //it only shows up after clicking on create new account
        //and the code takes some time to appear in the DOM for first name
        //so we must add a sleep here
        Thread.sleep(2000);
        // 1. find the element associated with the dropdown
        WebElement days = driver.findElement(By.xpath("//select[@id='day']"));
        // 2. create an object of the select class and pass in the parameters the element dropdown
        Select sel = new Select(days);
        // 3. use method provided in select class to select the option that you desire
        sel.selectByVisibleText("8");
        //for observation
        Thread.sleep(2000);
        //another method
        sel.selectByValue("26");
    }
}
