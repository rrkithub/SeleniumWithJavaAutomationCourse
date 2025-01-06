package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

public class StepDefs {
    WebDriver driver;
    PropertyFileReader pf = new PropertyFileReader();
    WebDriverWait wait;

    @Given("I launch the mercury URL.")
    public void i_launch_the_mercury_url() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 60);
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
    }

    @When("I enter {string} as {string}")
    public void i_enter_as(String webele, String testdat) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pf.getPropertyValue(webele))));
        driver.findElement(By.xpath(pf.getPropertyValue(webele))).sendKeys(testdat);
    }

    @Then("I click on {string} button")
    public void i_click_on_button(String webele) throws IOException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pf.getPropertyValue(webele))));
        driver.findElement(By.xpath(pf.getPropertyValue(webele))).click();
    }

    @Then("I should see {string} text")
    public void i_should_see_text(String text) {

        boolean value = driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).isDisplayed();
        Assert.assertTrue(value, "Text not displayed in webpage");
        driver.close();
    }
   @Given("I open amazon website")
   public void i_open_amazon_website() {
       WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       wait = new WebDriverWait(driver, 60);
       driver.manage().window().maximize();
       driver.get("https://amazon.in");
   }

    @When("I Order Ios mobile")
    public void i_order_ios_mobile() {

    }

    @Then("I should receive the order")
    public void i_should_receive_the_order() {

    }
}
