package PF.PFClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PFLoginPage {

    @FindBy(name="userName")
    WebElement userName;

    @FindBys({
            @FindBy(name="password"),
            @FindBy(xpath="//input[@type='password']")
    })
            WebElement passWord;
    @FindAll({
            @FindBy(name="submit"),
            @FindBy(xpath="//*[@name='submit']")
    })
    WebElement loginButton;

    public String expectedTitle = "Welcome: Mercury Tours";

    WebDriver driver;

    public PFLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void setUserName(String uname){
        userName.sendKeys(uname);
    }
    public void setPassWord(String pwd){
        passWord.sendKeys(pwd);
    }
    public void clickLogin(){
        loginButton.click();
    }
    public String getLoginpageTitle(){
        return  driver.getTitle();
    }
    public void LoginIntoMercurySite(String uname, String pwd){
        setUserName(uname);
        setPassWord(pwd);
        clickLogin();
    }

}
