package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    //Open Chrome browser
    //Go to: “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D"
    //Fill in the complete form

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");

        driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='first_name']"));
        firstName.sendKeys("Moe");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='last_name']"));
        lastName.sendKeys("Szyslak");

        WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
        email.sendKeys("moestavern@icloud.com");

        WebElement phoneNumber = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys("458-123-4567");

        WebElement address = driver.findElement(By.xpath("//input[@ name ='address']"));
        address.sendKeys("365 Duff Lane");

        WebElement city = driver.findElement(By.xpath("//input[@ name ='city']"));
        city.sendKeys("Springfield");

        WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
        state.sendKeys("Oregon");

        WebElement zipCode = driver.findElement(By.xpath("//input[@name='zip']"));
        zipCode.sendKeys("97475");

        WebElement webSite = driver.findElement(By.xpath("//input[@name='website']"));
        webSite.sendKeys("www.moestavern.com");

        WebElement haveHosting = driver.findElement(By.xpath("//input[@value='yes']"));
        haveHosting.click();

        WebElement projectDescription = driver.findElement(By.xpath("//textarea[@name='comment']"));
        projectDescription.sendKeys("Sports bar.");

        WebElement submit = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        Thread.sleep(2000);
        submit.click();




    }
}
