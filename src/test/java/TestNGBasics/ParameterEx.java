package TestNGBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParameterEx {
    WebDriver driver;

    @BeforeTest
    @Parameters({"browser", "url"})
    public void launchTheURL(@Optional("Chrome") String browser, String url) {

        if (browser.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(url);
        }
       else if (browser.equalsIgnoreCase("Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get(url);
        }
       else if (browser.equalsIgnoreCase("Firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(url);
        }
        //to launch the url.

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

