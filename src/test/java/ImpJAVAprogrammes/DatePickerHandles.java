package ImpJAVAprogrammes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePickerHandles {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();

        //Set Expected date
        String expYear = "2022";
        String expMonth = "Dec";
        String expDate= "25";

        //Inspect date picker icon and click on it
        driver.findElement(By.xpath(" //input[@id='onward_cal']")).click();

        //Select expected moth and year from the date picker
        while(true) {
            String monthyear = driver.findElement(By.xpath(" //td[@class='monthTitle']")).getText();

            String array[] = monthyear.split(" ");
            String month = array[0];
            System.out.println(month);
            String year = array[1];
            System.out.println(year);
            if (month.equalsIgnoreCase(expMonth) && year.equalsIgnoreCase(expYear))
                break;

            else
                driver.findElement(By.xpath("//button[normalize-space()='>']")).click();
        }

            //Select expected date from the picker
            List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//tr//td"));

            for (WebElement element: allDates){
                String date=element.getText();
                if(date.equals(expDate)){
                    element.click();
                    break;
                }

            }

        }
    }

