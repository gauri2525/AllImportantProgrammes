package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckedSortedDropdowns {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();

        //Clicking on the Live posting FAQ link
        driver.findElement(By.xpath("//a[text()='Live Posting']")).click();

        //Inspect dropdown
        WebElement dropdown= driver.findElement(By.name("category_id"));

        //Create instance of select class
        Select SC =new Select(dropdown);

        //Fetch all values from the dropdown
        List<WebElement> drpOptions = SC.getOptions();

        //Store these options into two lists
        ArrayList originalList = new ArrayList<>();
        ArrayList tempList = new ArrayList<>();

        for ( WebElement option:drpOptions){
            originalList.add(option.getText());
            tempList.add(option.getText());
        }

        // Printing values from both the lists
        System.out.println("originalList options" +originalList );
        System.out.println("tempList options" +tempList );

        //sort tempList values
        Collections.sort(tempList);

        if(originalList.equals(tempList)){
            System.out.println("Dropdown sorted..");
        }
        else
        {
            System.out.println("Dropdown unsorted");
        }


        driver.close();

    }
}
