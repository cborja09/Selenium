package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    Note: use name or id as locators
    Navigate to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
    Enter the username "Tester"
    Enter the password "test"
    get the title of the webPage and confirm that it is  "Web Orders Login".
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.name("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        String title = driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);
        if(title.equals("Web Orders Login")){
            System.out.println("The title is correct.");
        }else{
            System.out.println("The title is incorrect.");
        }
        driver.quit();

    }
}
