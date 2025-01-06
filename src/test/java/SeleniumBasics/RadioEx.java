package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioEx {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();

        WebElement el1=driver.findElement(By.xpath("//input[@value='Option 1']"));
        el1.click();
        List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio']"));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).getAttribute("value"));
            list.get(i).click();
        }

    }
}
