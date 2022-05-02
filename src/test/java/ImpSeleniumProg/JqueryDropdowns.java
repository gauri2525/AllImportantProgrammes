package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JqueryDropdowns {
     static WebDriver driver;

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        //Selecting values from Multi-Select dropdown
        driver.findElement(By.xpath("//input[@id='justAnInputBox'")).click();


        selectChoiceValues(driver,"choice 1");
        //selectChoiceValues(driver,"choice 2","choice 2 3","choice 3");
        //selectChoiceValues(driver,"all");


    }

    public static void selectChoiceValues (WebDriver driver, String... value)
    {

        List<WebElement> choiceList=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));

            if(!value[0].equalsIgnoreCase("all")){
                for ( WebElement option :choiceList){
                    String optionText=option.getText();
                    for (String val :value){
                        if(optionText.equals(val)){
                            option.click();
                        }
                    }
                }

            }
            else{
                for ( WebElement option :choiceList) {
                    option.click();
                }
            }
        }

    }




