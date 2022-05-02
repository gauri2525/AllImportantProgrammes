package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleBrokenLinks {

    public static void main(String[] args) throws IOException {

        //Broken links means links which doesn't have any target page.

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List<WebElement> links = driver.findElements(By.tagName("a"));

        int brokenLinks=0;

        for(WebElement element:links) {
            String url = element.getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("url is empty,neither broken nor valid");
                continue;
            }

            //Using URL class to convert string url into actual URL
            URL link = new URL(url);

            //Using below methods of the HttpURLConnection class
            //-openConnection() , -connect() , getResponseCode()
            try{
            HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
            httpConn.connect();

            if (httpConn.getResponseCode() >= 400) {
                System.out.println(httpConn.getResponseCode() + url + "is Broken link");
                brokenLinks++;
            } else {
                System.out.println(httpConn.getResponseCode() + url + "is valid link");
            }
        }
            catch (Exception e){
                e.printStackTrace();
            }

        }

        System.out.println("Total no of broken links" + brokenLinks);


    }
}
