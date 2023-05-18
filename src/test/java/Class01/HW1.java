package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    Fill out the form and close the browser.
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstname")).sendKeys("Bart");
        driver.findElement(By.id("customer.lastname")).sendKeys("Simpson");
        driver.findElement(By.id("customer.address.street")).sendKeys("109 Springfield Lane");
        driver.findElement(By.id("customer.address.city")).sendKeys("Springfield");
        driver.findElement(By.id("customer.address.state")).sendKeys("Illinois");
        driver.findElement(By.name("customer.address.zipcode")).sendKeys("10999");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("650-109-9999");
        driver.findElement(By.id("customer.ssn")).sendKeys("999-01-9999");
        driver.findElement(By.id("customer.username")).sendKeys("Bartdude");
        driver.findElement(By.id("customer.password")).sendKeys("skateboard");
        driver.findElement(By.id("repeatedPassword")).sendKeys("skateboard");
        Thread.sleep(5000);
        driver.quit();







    }
}
