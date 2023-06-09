package Class08;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Calendar extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Click on the calendar
        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        //Select the date August 4 2023
        boolean monthFound = false;
        while (!monthFound) {
            //Get the month and check if it is the desired one
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth = month.getText();
            if (currentMonth.equals("August")) {
                System.out.println("You are on the right month");
                List<WebElement> alldates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement date:alldates){
                     String currentDate = date.getText();
                     if (currentDate.equals("4")) {
                         date.click();
                     }
                }
                monthFound = true;
            } else {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])")); //Click on next
                nextBtn.click();
            }
        }
    }
}

