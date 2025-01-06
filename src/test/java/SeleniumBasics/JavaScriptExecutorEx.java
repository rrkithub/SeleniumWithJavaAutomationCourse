package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");

        WebElement username = driver.findElement(By.name("userName"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement login = driver.findElement(By.name("submit"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','admin')", username);
        js.executeScript("arguments[0].setAttribute('value','admin')", password);
        js.executeScript("arguments[0].click();", login);
        Thread.sleep(5000);
        driver.close();
    }
}
