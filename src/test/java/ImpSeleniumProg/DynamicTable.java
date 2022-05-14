package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DynamicTable {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.opencart.com/admin/index.php");
        driver.manage().window().maximize();

        //enter username and password
        WebElement username=driver.findElement(By.id("input-username"));
        username.clear();
        username.sendKeys("demo");

        WebElement password=driver.findElement(By.id("input-password"));
        username.clear();
        username.sendKeys("demo");

        //Click on Login
        WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.submit();


        //Navigate to Sales>Orders
        WebElement salesLink=driver.findElement(By.xpath("//a[normalize-space()='Sales']"));
        salesLink.click();
        Thread.sleep(4000);

        WebElement orderLink=driver.findElement(By.xpath("//a[normalize-space()='Orders']"));
        orderLink.click();

        //Get Total table pages count
        String text=driver.findElement(By.xpath("//div[contains(text(),'Showing 1')]")).getText();
        System.out.println(text);

        String text1= text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);


        //converting number string into number value(int value)
        int totalPages=Integer.valueOf(text1);
        System.out.println(totalPages);

        //Navigate to all the pages and get total rows
        for (int P=1; P<=5;P++){

            WebElement active_page= driver.findElement(By.xpath("//ul[@class='pagination']//span"));
            System.out.println("Active Page is: "+active_page.getText());
            active_page.click();

            //Total Rows
            List totalRows=driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr"));
            int totalRowscount=totalRows.size();
            System.out.println("Total Rows: "+totalRowscount);

            //Read all the rows from each page and get data from orderID,Customer & status columns only for Pending Statues
            for (int r=1;r<=totalRowscount;r++){
                String orderID=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
                String Customer=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[3]")).getText();
                String Status=driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[4]")).getText();

                if(Status.equals("Pending")){
                    System.out.println(orderID+"  "+Customer+"   "+Status);
                }

            }

            //Get next page number
            String nextPageNo=Integer.toString(P+1);

            //navigate to the next page
            driver.findElement(By.xpath("//ul[@class='pagination']//li//a[text()='"+nextPageNo+"']")).click();




        }

        driver.close();





    }
}
