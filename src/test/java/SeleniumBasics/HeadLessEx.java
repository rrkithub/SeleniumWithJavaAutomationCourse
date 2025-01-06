package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessEx {

    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));
        //   System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        //options.setHeadless(true);
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);
        //to launch the url.
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        // to maximize the screen.
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("submit")).click();
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
