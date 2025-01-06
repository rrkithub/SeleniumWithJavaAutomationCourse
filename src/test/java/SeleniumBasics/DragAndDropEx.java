package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement sourceEle = driver.findElement(By.xpath("//a[normalize-space(text())='BANK']"));
        WebElement targetEle = driver.findElement(By.xpath("//ol[@id='bank']//li"));

        Actions actions = new Actions(driver);
        //  Action action=actions.dragAndDropBy(sourceEle,147,25).build();
        Action action = actions.dragAndDrop(sourceEle, targetEle).build();
        action.perform();

    }
}
