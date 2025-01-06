package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDownEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");
        driver.manage().window().maximize();

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='fruits']"));
        Select s = new Select(dropdown);
        s.selectByVisibleText("Banana");
        s.selectByIndex(2);
        s.selectByValue("grape");
        s.deselectByIndex(2);
        s.deselectByVisibleText("Banana");
        s.deselectAll();

    }
}
