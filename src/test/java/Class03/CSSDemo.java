package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //the browswer window opens and it maximizes
        driver.manage().window().maximize();

        //navigate to Facebook site
        driver.get("https://www.facebook.com");

        //click on create new account
        WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        createNewAccount.click();
        //because the DOM doesn't have first name by default
        //it only shows up after clicking on create new account
        //and the code takes some time to appear in the DOM for first name
        //so we must add a sleep here
        Thread.sleep(2000);

        //enter the first name
        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Corey");


    }
}
