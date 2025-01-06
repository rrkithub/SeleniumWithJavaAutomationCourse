package SeleniumBasics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class DynamicTableEx {
    public static void main(String[] args) {
        String max;
        double m = 0, highestval = 0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
        List columns = driver.findElements(By.xpath("//table/thead/tr/th"));
        List Rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));

        System.out.println("No of columns : " + columns.size());
        System.out.println("No of Rows : " + Rows.size());
        List<Double> l = new ArrayList<Double>();
        for (int i = 1; i < Rows.size(); i++) {
            max = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[" + i + "]/td[4]")).getText();
            m = Double.parseDouble(max);
            l.add(m);
            if (m > highestval) {
                highestval = m;
            }
        }
        System.out.println("List of elements : "+ l);
        System.out.println("Number of elemetns in list : "+l.size());
        System.out.println("Maximum current price : " + highestval);

        Double sum = 0.0;
        for (int k = 0; k < l.size(); k++) {
            sum = sum + l.get(k);
        }
        System.out.println("average value :" + sum / l.size()+1);

        driver.close();
    }
}
