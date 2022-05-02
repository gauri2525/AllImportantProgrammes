package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBoxSelection {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        driver.manage().window().maximize();

        //1.select specific checkbox
        driver.findElement(By.id("monday")).click();

        //Unchecking same checkbox
        driver.findElement(By.id("monday")).click();

        Thread.sleep(3000);

        //2. select all checkboxes
      List<WebElement> checkBoxOptions=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

      //Using for each loop
        for (WebElement checkBox:checkBoxOptions){
            checkBox.click();
        }

        Thread.sleep(3000);

        //Unselect all checkboxes
        List<WebElement> checkBoxOptions1=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        //Using for each loop
        for (WebElement checkBox:checkBoxOptions1){
            checkBox.click();
        }

        Thread.sleep(3000);

        //3. select only 2 checkboxes
        List<WebElement> checkBoxOptions2=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        //Using for each loop
        for (WebElement checkBox1:checkBoxOptions2) {

            String checkboxText=checkBox1.getAttribute("id");

            if (checkboxText.equals("tuesday") ||checkboxText.equals("wednesday")) {
                checkBox1.click();

            }

        }
        for (WebElement checkBox1:checkBoxOptions2) {

            String checkboxText=checkBox1.getAttribute("id");

            if (checkboxText.equals("tuesday") ||checkboxText.equals("wednesday")) {
                checkBox1.click();

            }

        }

        // 4.Select last 2 checkboxes

        List<WebElement> checkBoxOptions3=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));

        int TotalcheckBoxOptions=checkBoxOptions3.size();

        //select last two options from the TotalcheckBoxOptions
        for( int i=TotalcheckBoxOptions-3 ; i<TotalcheckBoxOptions ; i++){
            checkBoxOptions3.get(i).click();
        }

        //Select first two options from the TotalcheckBoxOptions

        for (int  i=0 ; i<=TotalcheckBoxOptions;i++){
            if(i<3){
                checkBoxOptions.get(i).click();
            }

        }




    }
}
