package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        //driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        // or you can use code below this

        WebElement userNameTxtBox=driver.findElement(By.id("txtUsername"));
        userNameTxtBox.sendKeys("Admin");

        Thread.sleep(2000);

        userNameTxtBox.clear(); // use this to clear the text box

        userNameTxtBox.sendKeys("Admin");

        WebElement pass = driver.findElement(By.name("txtPassword")); // find the password
        pass.sendKeys("Hum@nhrm123");

        driver.findElement(By.className("button")); //find the login button
        WebElement loginBtn = driver.findElement(By.className("button"));
        loginBtn.click();

        // get the welcome message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text); // prints out on IntelliJ


        driver.findElement(By.partialLinkText("Recru")).click();
    }
}
