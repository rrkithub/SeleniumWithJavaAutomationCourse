package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SeriesOfActionsEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        Actions act = new Actions(driver);
        Action a = act.moveToElement(email).
                click()
                .keyDown(email, Keys.SHIFT)
                .sendKeys("abcd@gmail.com")
                .keyUp(email, Keys.SHIFT)
                .doubleClick()
                .contextClick()
                .build();
        a.perform();
    }
}
