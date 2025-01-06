package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("1234");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        // it will click on OK button on alert
        driver.switchTo().alert().accept();
        Thread.sleep(5000);
        //it will print the text inside the alert
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        // dismiss Example

        driver.findElement(By.name("cusid")).sendKeys("1234");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().dismiss();
    }
}
