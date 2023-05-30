package Class04;

import Utlis.CommonMethods;
import io.netty.util.internal.logging.CommonsLoggerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.sql.CommonDataSource;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //find the radio button male and click on it
        WebElement r1 = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
        r1.click();

        //check if the radio button r1 is selected
        boolean r1Selected = r1.isSelected();
        System.out.println("The radio button Male is selected :" + r1Selected);

        //check if the radio button r1 is displayed
        boolean r1isDisplayed = r1.isDisplayed();
        System.out.println("The radio button Male is displayed :" + r1isDisplayed);

        //check if the radio button r1 is enabled
        boolean r1isEnabled = r1.isEnabled();
        System.out.println("The radio button Male is enabled :" + r1isEnabled);

        //deselect the male r1 button
        WebElement r2 = driver.findElement(By.xpath("//input[@value='Female' and @name='optradio']"));
        r2.click();

        //check if the r1 button has been deselected
        boolean r1isSelected = r1.isSelected();
        System.out.println("The male radio button is selected :"+r1isSelected);
    }
}
