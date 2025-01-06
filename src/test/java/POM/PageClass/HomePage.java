package POM.PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    By HomepageText = By.xpath("//h3[text()='Login Successfully']");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public String getHomePageText() {
        return driver.findElement(HomepageText).getText();
    }
}
