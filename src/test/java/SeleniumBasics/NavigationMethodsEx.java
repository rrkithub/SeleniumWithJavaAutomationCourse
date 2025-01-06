package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethodsEx {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //to launch the url.
        driver.navigate().to("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        boolean elem = false;
        try {
            elem = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).isDisplayed();

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        if (elem == true) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}

