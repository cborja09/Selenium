package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KEYSDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Locate the text box username
        WebElement userName = driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester",Keys.TAB);

        //Locate the password text box
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test",Keys.ENTER);
    }
}
