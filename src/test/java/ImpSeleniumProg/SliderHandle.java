package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SliderHandle {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();

        //Drag min slider
        WebElement Min_Slider=driver.findElement(By.xpath("//span[1]"));

        System.out.println("location of the slider"+ Min_Slider.getLocation());
        System.out.println("Size of the slider"+ Min_Slider.getSize());

        Actions  act=new Actions(driver);
        act.dragAndDropBy(Min_Slider,100,0).perform();

        //Drag max slider
        WebElement Max_Slider=driver.findElement(By.xpath("//span[2]"));

        System.out.println("location of the slider"+ Max_Slider.getLocation());
        System.out.println("Size of the slider"+ Max_Slider.getSize());

        act.dragAndDropBy(Max_Slider,-100,0).perform();

        driver.quit();




    }
}
