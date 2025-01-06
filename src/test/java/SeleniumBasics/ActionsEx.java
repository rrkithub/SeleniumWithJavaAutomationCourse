package SeleniumBasics;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        driver.manage().window().maximize();

        WebElement flights=driver.findElement(By.xpath("//a[text()='Flights']"));
        WebElement flightstd=driver.findElement(By.xpath("//a[text()='Flights']/parent::td/parent::tr//td[@width='20']"));
        System.out.println("Before Mousehover : "+ flightstd.getCssValue("background-color"));

        Actions act=new Actions(driver);
        Action a=act.moveToElement(flights).build();
        a.perform();
        System.out.println("After Mousehover : "+ flightstd.getCssValue("background-color"));


    }
}
