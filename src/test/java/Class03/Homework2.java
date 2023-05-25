package Class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login”
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text “Password cannot be empty” is displayed.

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");

        driver.manage().window().maximize();

    }
}
