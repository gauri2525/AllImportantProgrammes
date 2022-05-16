package ImpJAVAprogrammes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DatePickerDropdownHandle {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.manage().window().maximize();

        //opens the date picker
        driver.findElement(By.id("dob")).click();

        //Select month and year
        WebElement monthDropdown= driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select month_drp=new Select(monthDropdown);
        month_drp.selectByVisibleText("Nov");

        WebElement yearDropdown= driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select year_drp=new Select(yearDropdown);
        year_drp.selectByVisibleText("2021");
        
        //Select date
        String expDate="25";

        List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));

        for(WebElement element:allDates){
            String date=element.getText();
            System.out.println(date);
            if(date.equals(expDate)){
                element.click();
                break;
            }
        }


    }
}
