package Class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //instance

        driver.get("https://www.facebook.com"); //facebook.com website

        driver.manage().window().maximize(); // maximize the site after the url is key

        driver.findElement(By.id("email")).sendKeys("cborja@icloud.com");

        driver.findElement(By.name("pass")).sendKeys("abracadabra");

        // print the url on the console
        String url = driver.getCurrentUrl();
        System.out.println(url);

        // print the title on the console
        String title = driver.getTitle(); // confirms the title is Facebook login or signup
        System.out.println(title);

        if(title.equals("Facebook - log in or sign up")){
            System.out.println("the title is correct");
        }else{
            System.out.println("the title is incorrect");
        }

        driver.quit(); // close


    }
}
