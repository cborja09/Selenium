package Class08;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class TablesDynamic3 extends CommonMethods {
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

        //Get all the ids from the table into the list
        List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        //Iterate through the ids and find the id 53481A and click on associated checkbox
        for (int i = 0; i < allIds.size(); i++) {
            String id = allIds.get(i).getText();
            if (id.equals("53481A")) {
                System.out.println("click on the check box on row number " + (i + 1));
                WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
            }
        }
    }
}
