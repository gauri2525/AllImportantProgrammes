package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StaticTable {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        //Inspect Static WebTable
        driver.findElement(By.xpath("//table[@id='customers']"));

        //Total no of rows in the table (including header row)
        int totalRows=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
        System.out.println("Total rows in the table :" +totalRows);

        //Total no of columns in the table
        int totalCol=driver.findElements(By.xpath("//table[@id='customers']//tr//th")).size();
        System.out.println("Total columns in the table:" +totalCol);

        //Retrieve the data from the 3rd Row and 1 column
        String data =driver.findElement(By.xpath("//table[@id='customers']//tr[3]/td[1]")).getText();
        System.out.println("data from the 3rd Row and 1 column" +data);

        //Retrieve all data from the table
        for(int r=2;r<=totalRows;r++){

            for(int c=1;c<=totalCol;c++){
                String dataTable=driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
                System.out.print(dataTable +" ");
            }
            System.out.println();
        }

        //Fetch particular details based on the data
        for( int r1=2;r1<=totalRows;r1++){
            String companyName=driver.findElement(By.xpath("//table[@id='customers']//tr["+r1+"]//td[1]")).getText();
            if(companyName.equals("Amazon")){
                String contactPerson=driver.findElement(By.xpath("//table[@id='customers']//tr["+r1+"]//td[2]")).getText();
                String country=driver.findElement(By.xpath("//table[@id='customers']//tr["+r1+"]//td[3]")).getText();
                System.out.print("companyName: "+companyName+"contactPerson: "+contactPerson+"country: "+country);
            }
        }

        driver.quit();


    }
}
