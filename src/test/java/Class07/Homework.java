package Class07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

//Go to: http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//Login
//Click on PIM
//From the table choose any ID and print out the row number of that id
//Please make sure that your code is dynamic enough to cater if another row gets deleted, it still prints the row correctly
public class Homework extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Login into the website
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //Click on PIM
        WebElement pimtBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimtBtn.click();

        //Print the row number that has the id 53554A
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        //Look for 53554A
        for (int i = 0; i < allIDs.size(); i++) {
            String id = allIDs.get(i).getText();
            if (id.equals("53554A")) {
                System.out.println("the id is on row number " + (i + 1));
            }
        }
    }
}