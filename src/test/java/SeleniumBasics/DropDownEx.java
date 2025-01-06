package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        WebElement countryDropdown = driver.findElement(By.xpath("//select[@name='country']"));
        Select s = new Select(countryDropdown);
        s.selectByIndex(2);
        Thread.sleep(5000);
        s.selectByValue("ARUBA");
        Thread.sleep(5000);
        s.selectByVisibleText("INDIA");
        driver.close();
    }
}
