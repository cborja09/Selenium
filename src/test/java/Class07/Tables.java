package Class07;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //print the whole table on the console
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("***********************");

        //print all rows of the table
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:allRows){
            String rowText = row.getText();
            System.out.println(rowText);
        }
    }
}
