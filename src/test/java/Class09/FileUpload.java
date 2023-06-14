package Class09;

import Utlis.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://the-internet.herokuapp.com/upload";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //Find the element which you can click to upload the file
        WebElement fileUploadBtn = driver.findElement(By.xpath("//input[@id='file-upload']"));
        //In order to send or upload the file, you can send hte path of that file in sendKeys
        //The file path will be different for everyone depending on their own system
        fileUploadBtn.sendKeys("/Users/coreyborja/Desktop/Screenshot 2023-06-12 at 7.03.33 AM.png");

    }
}
