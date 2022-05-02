package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class HandleJavaScriptAlerts {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        //Javascript alert(browser alert) with ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        //Javascript alert(browser alert) with ok & Cancel buttons
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();

        //Javascript alert(browser alert) with input box and ok button
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        //driver.switchTo().alert().accept();
        Alert alertWindow=driver.switchTo().alert();
        System.out.println(alertWindow.getText());
        alertWindow.sendKeys("Automation Testing");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
    }
}
