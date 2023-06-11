package Class08;
//Go to: syntax hrms
//Login
//Click on recruitment
//Select a date on the calendar

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
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

        //Click on recruitment
        WebElement recruitmentBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitmentBtn.click();

        //Click on calendar
        WebElement cal = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        cal.click();

        //Click on month drop down
        WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select month = new Select(monthDropDown);
        month.selectByVisibleText("Jul");

        //Click on year drop down
        WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select year = new Select(yearDropDown);
        year.selectByValue("1999");

        List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td"));

        //I want to select the date July 4th, 1999
        for (WebElement day : days) {
           String dayText= day.getText();
           if (dayText.equals("4")) {
               day.click();
               break;
           }
        }
    }
}
