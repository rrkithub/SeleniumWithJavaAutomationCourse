package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitEx {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/login.html");
        // to maximize the screen.
        driver.manage().window().maximize();
        WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("admin");
        WebElement login = driver.findElement(By.id("SubmitLogin"));

        login.submit();

    }
}
