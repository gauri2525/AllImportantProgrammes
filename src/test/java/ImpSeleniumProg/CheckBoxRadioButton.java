package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBoxRadioButton{
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox'][@value='checkbox2']"));

        // Select the checkbox
        checkbox.click();

        //Verify that checkbox is selected or not
        if (checkbox.isSelected()){
            System.out.println("Checkbox2 is selected");
        }
        else
        {
            System.out.println("Checkbox2 is not selected");
        }

        //Verify elementtype of radio button : option 2
        WebElement RadioOption2= driver.findElement(By.xpath("//input[@type='radio'][@value='Option 2']"));
        String elementtype = RadioOption2.getAttribute("type");

        //If elementType is radio button then select it
        if (elementtype.equals("radio")){
            RadioOption2.click();
            System.out.println("RadioButton Option 2 is selected");
        }
        else
        {
            System.out.println("RadioButton Option 2 is not radio button hence its not selected");
        }


    }


}
