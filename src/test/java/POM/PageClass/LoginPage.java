package POM.PageClass;

import POM.PageMethods.MercuryTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    By userName = By.name("userName");
    By passWord = By.name("password");
    By loginButton = By.name("submit");

    public String expectedTitle = "Welcome: Mercury Tours";

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String uname) {
        driver.findElement(userName).sendKeys(uname);
    }

    public void setPassWord(String pwd) {
        driver.findElement(passWord).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public String getLoginpageTitle() {
        return driver.getTitle();
    }

    public void LoginIntoMercurySite(String uname, String pwd) {
        setUserName(uname);
        setPassWord(pwd);
        clickLogin();
    }

}
