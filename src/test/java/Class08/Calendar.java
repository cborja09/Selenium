package Class08;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Calendar extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.aa.com/homePage.do?locale=en_US";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Click on the calendar
        WebElement calendar = driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]"));
        calendar.click();

        //Select the date August 4 2023
        //get the month and check if it is the desired one
        boolean monthFound = false;
        while (!monthFound) {
            WebElement month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[1]"));
            String currentMonth = month.getText();
            if (currentMonth.equals("August")) {
                System.out.println("You are on the right month");
                monthFound = true;
            } else {
                WebElement nextBtn = driver.findElement(By.xpath("(//a[@class='ui-datepicker-next ui-corner-all'])")); //Click on the next page
                nextBtn.click();
            }
        }
    }
}

