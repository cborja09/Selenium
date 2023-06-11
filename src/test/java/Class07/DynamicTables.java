package Class07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTables extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Login into the website
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();

        //Click on PIM
        WebElement pimtBtn = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimtBtn.click();

        //Print the row number that has the id 56768A
        List<WebElement> allIDs = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        //Look for 56768A
        for (int i = 0; i < allIDs.size(); i++) {
           String id = allIDs.get(i).getText();
           if (id.equals("56768A")){
               System.out.println("the id is on row number "+(i+1));
               //WebElement row = driver.findElement(By.xpath(" //table/tbody/tr[" + (i + 1) + "]"));
               //System.out.println(row.getText());
           }
        }
    }
}
