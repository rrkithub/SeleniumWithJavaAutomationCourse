package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImage {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='Facebook']")).click();
        driver.close();
    }
}
