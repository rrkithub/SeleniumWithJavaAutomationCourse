package TestNGBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGEx {
    WebDriver driver;

    @BeforeTest
    public void launchTheURL() {
        System.out.println(System.getProperty("user.dir"));
        //   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
    }

    @Test
    public void verifyHomepageText() {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
        boolean elem = false;
        try {
            elem = driver.findElement(By.xpath("//h3[text()='Login Successfully']")).isDisplayed();

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        Assert.assertTrue(elem, "Login Failed");
    }

    @AfterTest
    public void quit() {
        driver.quit();
    }
}

