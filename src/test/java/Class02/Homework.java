package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    // HW  (only use XPATH)
    //navigate to fb.com
    //click on create new account
    //fill up all the text boxes
    //close the popup
    //close the browser

    //Note : in order for ur code to work
    //you have to put Thread.sleep(2000) after clicking on Create new account
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Bart");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Simpson");

        driver.findElement(By.xpath("//input[@aria-label='Mobile number or email']")).sendKeys("bartdude@icloud.com");

        driver.findElement(By.xpath("//input[@aria-label='Re-enter email']")).sendKeys("bartdude@icloud.com");

        driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("Skateboard");

        driver.findElement(By.xpath("//select[@id='month']")).sendKeys("January");

        driver.findElement(By.xpath("//select[@id='day']")).sendKeys("1");

        driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1999");

        driver.findElement(By.xpath("//label[text()='Male']")).click();

        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//img[@class='_8idr img']"));

        Thread.sleep(2000);

        driver.quit();



    }


}
