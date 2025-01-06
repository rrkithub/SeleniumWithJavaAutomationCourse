package PF.PFMethods;

import PF.PFClass.PFHomePage;
import PF.PFClass.PFLoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PFMercuryTest {

    WebDriver driver;
    PFHomePage homePage;
    PFLoginPage loginn;

    @BeforeTest
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void verifuMercuryLogin() {
        loginn = new PFLoginPage(driver);
        homePage = new PFHomePage(driver);
        Assert.assertEquals(loginn.expectedTitle, loginn.getLoginpageTitle());
        loginn.LoginIntoMercurySite("admin", "admin");
        Assert.assertEquals("Login Successfully", homePage.getHomePageText());
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
