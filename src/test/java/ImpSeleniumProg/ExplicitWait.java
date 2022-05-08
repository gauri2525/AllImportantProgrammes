package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWait {
    public static void main(String[] args) {

        //here we are creating generic wait method for all the elements.

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        //Enter selenium text and click on Enter
        driver.findElement(By.name("q")).sendKeys("selenium");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

        By elementLocator=By.xpath("//h3[text()='Selenium']");

        //calling generic method
        waitForElementPresent(driver,elementLocator,10).click();



    }

    //generic wait method for all the elements based on the condition.
    public static WebElement waitForElementPresent(WebDriver driver,By locator, int timeout ){
        WebDriverWait myWait= new WebDriverWait(driver,timeout);
        WebElement element=myWait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return element;
    }



}
