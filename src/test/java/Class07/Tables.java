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

        //Get the whole table
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String allText = wholeTable.getText();
        System.out.println(allText);

        System.out.println("-----------------------------");

        //Print all the rows data of the table
        //Modified: print the row that contains "Google" as company name
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement row:allRows){
            String rowText = row.getText();
            if (rowText.contains("Google")) //Modified task
            System.out.println(rowText);
        }

        System.out.println("-----------------------------");
        //Print each and every column data in the table
        List<WebElement> allCellData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement cell:allCellData){
            String cellData = cell.getText();
            System.out.println(cellData);
        }
    }
}
