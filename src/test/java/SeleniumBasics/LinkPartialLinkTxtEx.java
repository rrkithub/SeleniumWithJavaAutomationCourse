package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPartialLinkTxtEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Security Project")).click();
        WebElement frame0=driver.findElement(By.xpath("//iframe[@title='3rd party ad content']"));
        driver.switchTo().frame(frame0);
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='ad_iframe']"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.partialLinkText("Telecom")).click();
    }
}
