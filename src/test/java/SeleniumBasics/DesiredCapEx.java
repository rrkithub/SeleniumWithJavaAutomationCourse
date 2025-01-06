package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapEx {

    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.acceptInsecureCerts();
        WebDriver driver=new EdgeDriver(desiredCapabilities);
        driver.manage().window().maximize();
        driver.get("http://gmail.com");
        driver.close();

    }
}
