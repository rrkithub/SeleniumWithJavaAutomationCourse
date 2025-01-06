package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class findElementsEx {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getAttribute("value"));
            if(i==1) {
                list.get(i).click();
                break;
            }
        }
        Thread.sleep(5000);
        driver.close();
    }
}
