package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import javax.print.attribute.standard.Chromaticity;

public class driver {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriverManager.firefoxdriver().setup();
        ChromeDriver driverc = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        FirefoxDriver driverf= new FirefoxDriver();



    }

}
