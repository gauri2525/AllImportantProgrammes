package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

    public static WebDriver driver= null;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
    }
}
