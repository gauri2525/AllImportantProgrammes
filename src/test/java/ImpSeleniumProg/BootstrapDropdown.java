package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class BootstrapDropdown {

    public static void main(String[] args) {

        //What is cookies?

        // disable browser notification and launch chrome browser
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);

        driver.get("https://www.hdfcbank.com/");

        //Delete all cookies
        driver.manage().deleteAllCookies();

        //Allow cookies

        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Object Cookie  : allCookies){
            System.out.println("HDFC site cookies are : " + Cookie);
            System.out.println("HDFC site total cookies are : " + allCookies.size());
        }

        driver.manage().window().maximize();
        WebElement closeSummerPopup= driver.findElement(By.xpath("//img[@class='closeSummer']"));
        closeSummerPopup.click();

        //locate the product type dropdown and fetch values from it
        driver.findElement(By.xpath("//div[@class='dropdown'][contains(.,'Select Product Type')]")).click();
        System.out.println("Product Type Dropdown clicked successfully");

        //fetch all values from the product type dropdown and select 'Accounts' option
        List<WebElement> allOptions = driver.findElements(By.xpath("//ul [@class='dropdown1 dropdown-menu']//li"));
        for (WebElement Option:allOptions){
            if(Option.getText().equalsIgnoreCase("accounts")){
                Option.click();
                break;
            }

        }
        System.out.println("Product type- Accounts is selected");

        //fetch all values from the products dropdown and select 'Accounts' option
        driver.findElement(By.xpath("//div[@class='drp2']")).click();
        System.out.println("Product Dropdown clicked successfully");

        //fetch all values from the product  dropdown and select 'Accounts' option
        List<WebElement> allProductOptions = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']//li"));
        for (WebElement Option:allProductOptions){
            if(Option.getText().equalsIgnoreCase("Savings accounts")){
                Option.click();
                break;
            }



        }
        System.out.println("Product - Savings Accounts is selected");
    }
}
