package PF.PFClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFHomePage {
    WebDriver driver;


    @FindBy(xpath = "//h3[text()='Login Successfully']")
    WebElement HomepageText;

    public PFHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public String getHomePageText() {
        return HomepageText.getText();

    }
}
