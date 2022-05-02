package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BrowserWindowHandles {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        String windowID=driver.getWindowHandle();

        //Clicking on this link -child window will get opened
        driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();

        //getWindowHandles()-->returns IDS of multiple browser window
        Set<String> windowHandleIDs=driver.getWindowHandles();

        //First Method- using iterator() method
        /*Iterator<String> itr = windowHandleIDs.iterator();

        String ParentWindowID=itr.next();
        String ChildWindowID=itr.next();

        System.out.println("ParentWindowID :" + ParentWindowID);
        System.out.println("ChildWindowID :" + ChildWindowID);*/

        //Second Method- using List\Arraylist collection
        List<String> windowIDslist=new ArrayList<String>(windowHandleIDs);
        String ParentWindowID=windowIDslist.get(0);
        String ChildWindowID=windowIDslist.get(1);
        System.out.println("ParentWindowID :" + ParentWindowID);
        System.out.println("ChildWindowID :" + ChildWindowID);

        //Switching in between windows and getting their respective Titles
       /* for ( String winID :windowIDslist){
            String windowTitle=driver.switchTo().window(winID).getTitle();
            System.out.println("Title of the windows: " + windowTitle);
        }

        driver.quit();*/
        
        //Close the specific browser window
        //Here closing parent window
        for ( String winID :windowIDslist){
            String windowTitle=driver.switchTo().window(winID).getTitle();
            if (windowTitle.equals("OrangeHRM")){
                driver.close();
            }
        }










    }
}
