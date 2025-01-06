package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTextEx {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("admin");
        username.clear();
        password.clear();


    }
}
