package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class EdgeBrowser {


    public static void main(String[] args) {
        String baseUrl= "https://www.harrow.gov.uk/";
        WebDriver driver;
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");

        driver =new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String title =driver.getTitle();
        System.out.println(title);
         driver.close();

    }
}
