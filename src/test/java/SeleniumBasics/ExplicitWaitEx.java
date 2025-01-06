package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitEx {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        //Explicit wait

        WebDriverWait wait = new WebDriverWait(driver, 10);
// it will wait max time mentioned in the parameters before throughing No such element Exception and it is specific to element.

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='userName']")));

        WebElement username = driver.findElement(By.xpath("//input[@name='userName']"));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));

        username.sendKeys("admin");
        password.sendKeys(("admin"));

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='submit']")));
        WebElement login = driver.findElement(By.xpath("//input[@name='submit']"));

        login.click();
        driver.close();
    }
}
