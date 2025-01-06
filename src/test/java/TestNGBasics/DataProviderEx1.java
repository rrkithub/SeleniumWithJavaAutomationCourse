package TestNGBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx1 {
WebDriver driver;
    @Test(dataProvider = "LoginDataProvider")
    public void logintest(String username , String pwd){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(pwd);
        driver.findElement(By.name("submit")).click();
        driver.close();
    }


    @DataProvider(name="LoginDataProvider")
    public Object[][] getdata(){
        Object[][] credentils={
                {"admin","admin"},
                {"test","test"},
                {"demo","demo"}
        };
        return credentils;
    }

}
