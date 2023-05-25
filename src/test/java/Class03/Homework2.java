package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text “Password cannot be empty” is displayed.

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

       WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
       userName.sendKeys("Admin");

       WebElement login = driver.findElement(By.xpath("//input[@id='btnLogin']"));
       Thread.sleep(1000);
       login.click();


    }
}
