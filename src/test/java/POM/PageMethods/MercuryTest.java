package POM.PageMethods;


import PF.PFClass.PFHomePage;
import PF.PFClass.PFLoginPage;
import POM.PageClass.HomePage;
import POM.PageClass.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MercuryTest {

    WebDriver driver;
    HomePage homePage;
    LoginPage loginn;

    @BeforeTest
    public void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @Test
    public void verifuMercuryLogin() {
        loginn = new LoginPage(driver);
        homePage = new HomePage(driver);
        Assert.assertEquals(loginn.expectedTitle, loginn.getLoginpageTitle());
        loginn.LoginIntoMercurySite("admin", "admin");
        Assert.assertEquals("Login Successfully", homePage.getHomePageText());
    }

    @AfterTest
    public void tearDown() {

        driver.close();
    }
}
