package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitEx {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        //implicit wait

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
// it will wait max time mentioned in the parameters before throughing No such element Excepetion

        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        username.sendKeys("admin");
        password.sendKeys(("admin"));
        WebElement login = driver.findElement(By.xpath("//input[@name='submit']"));
        login.click();
        driver.close();
    }
}
