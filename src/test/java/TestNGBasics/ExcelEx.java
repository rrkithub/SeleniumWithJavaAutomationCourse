package TestNGBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.math3.analysis.function.Add;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;

public class ExcelEx {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        String filepath = System.getProperty("user.dir") + "\\TestData.xlsx";
        File f = new File(filepath);
        FileInputStream fis = new FileInputStream(f);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheet("STUDENT_DATA");
        int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        WebElement email = driver.findElement(By.id("userEmail"));
        WebElement Male = driver.findElement(By.id("gender-radio-1"));
        WebElement FeMale = driver.findElement(By.id("gender-radio-2"));
        WebElement Mobile = driver.findElement(By.id("userNumber"));
        WebElement Address = driver.findElement(By.id("currentAddress"));
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        for (int i = 1; i <= rowcount; i++) {
            firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
            lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
            email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
            JavascriptExecutor js=(JavascriptExecutor) driver;
            if (sheet.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Male")) {
            //    Male.click();
                js.executeScript("arguments[0].click()",Male);
            } else {
                //  FeMale.click();
                js.executeScript("arguments[0].click()",FeMale);
            }
            Mobile.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
            Address.sendKeys(sheet.getRow(i).getCell(5).getStringCellValue());
            //submit.click();
            js.executeScript("arguments[0].click()",submit);
            WebElement result = driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
            XSSFCell cell=sheet.getRow(i).createCell(6);
            if(result.isDisplayed()){
                cell.setCellValue("Pass");
            }else{
                cell.setCellValue("Fail");
            }
            FileOutputStream fos=new FileOutputStream(filepath);
            wb.write(fos);
            WebElement closepopup=driver.findElement(By.id("closeLargeModal"));
            //closepopup.click();
            js.executeScript("arguments[0].click()",closepopup);
            Thread.sleep(2000);
        }
        wb.close();
        driver.close();
    }
}
