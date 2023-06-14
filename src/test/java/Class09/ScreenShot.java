package Class09;

import Utlis.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShot extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Press the login button
        //Find the login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);

        //Take the screenshot

        //Declare the instance
        TakesScreenshot ts = (TakesScreenshot) driver;

        //Take screenshot as output type FILE
        File screenShot = ts.getScreenshotAs(OutputType.FILE);

        //Save it in your computer
        FileUtils.copyFile(screenShot,new File("/Users/coreyborja/IdeaProjects/SyntaxSdetBatch16Basic/screenshot/testSyntax.png"));

    }
}
