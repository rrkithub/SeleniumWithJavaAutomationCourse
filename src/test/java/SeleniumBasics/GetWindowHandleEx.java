package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class GetWindowHandleEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/popup.php");
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String currentWidnow = driver.getWindowHandle();
        Set s = driver.getWindowHandles();
        Iterator itr = s.iterator();
        while (itr.hasNext()) {
            String tagetWindow = String.valueOf(itr.next());
            if (!(currentWidnow == tagetWindow)) {
                driver.switchTo().window(tagetWindow);
            }
        }
        driver.findElement(By.name("emailid")).sendKeys("abc@abc.com");
        driver.findElement(By.name("btnLogin")).click();
        // it will close the currrent window
        driver.close();
        //it will close the all open widows
        driver.quit();
    }
}
