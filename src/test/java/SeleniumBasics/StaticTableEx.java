package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/write-xpath-table.html");
        System.out.println("First Row First Column " + driver.findElement(By.xpath("//center//table/tbody/tr[1]/td[1]")).getText());
        System.out.println("First Row Second Column " + driver.findElement(By.xpath("//center//table/tbody/tr[1]/td[2]")).getText());
        System.out.println("Second Row First Column " + driver.findElement(By.xpath("//center//table/tbody/tr[2]/td[1]")).getText());
        System.out.println("Second Row Second Column " + driver.findElement(By.xpath("//center//table/tbody/tr[2]/td[2]")).getText());
        driver.close();
    }
}
