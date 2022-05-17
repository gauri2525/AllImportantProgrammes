package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyBoardActions1 {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        WebElement textArea1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement textArea2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));

        //Enter text into textArea1
        textArea1.sendKeys("Welcome to Selenium");

        Actions act= new Actions(driver);

        //Ctrl+A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //Ctrl+c
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //TAB --To shift textArea2
        act.sendKeys(Keys.TAB).perform();

        //Ctrl+v
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        if(textArea1.getAttribute("value").equals(textArea2.getAttribute("value"))){
            System.out.println("Text copied");
        }
        else
        {
            System.out.println("Text not copied");
        }





    }
}
