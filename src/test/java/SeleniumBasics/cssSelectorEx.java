package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.cssSelector("input#email")).sendKeys("Test@abc.com");
        driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("dsfasdf");
        driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
       /* driver.findElement(By.linkText("Bank Project")).click();
        driver.findElement(By.partialLinkText("Bank")).click();*/
        driver.close();
    }
}
