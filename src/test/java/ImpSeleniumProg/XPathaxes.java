package ImpSeleniumProg;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class XPathaxes {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //self node : select the current node
        String optionText = driver.findElement(By.xpath("//a[contains(text(),'Om Infra')]/self::a")).getText();
        System.out.println("Text using self node :" +optionText );

        //Parent : select the Immediate parent of the current node (always one)
        String Parent=driver.findElement(By.xpath("//a[contains(text(),'Om Infra')]/parent::td")).getText();
        System.out.println("Text using parent node :" +Parent );

        //Child (select the children of the current node)( this element doesn't have child element)
        //WebElement Echild= driver.findElement(By.xpath("//a[contains(text(),'Om Infra')]/child::*"));

        //ancestor : (select all ancestor Parents+grand parent of the current node)
        String ancestor=driver.findElement(By.xpath("//a[contains(text(),'Om Infra')]/ancestor::tr/child::td")).getText();
        System.out.println("Text using ancestor node :" + ancestor );

        //descendant : select all the descendant including children and grand children of the current node.
        List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'Om Infra')]/ancestor::tr/descendant::td"));
        int totaldes = descendants.size();
        System.out.println( totaldes );

        //Following: select everything in the document after the closing tag of the current node.
        List<WebElement>  allfollowingnodes =driver.findElements(By.xpath("//a[contains(text(),'Om Infra')]/following::*"));
        int totalfollowingnodes = allfollowingnodes.size();
        System.out.println( totalfollowingnodes );

        //Following Sibling : select all siblings after the current node.
        List<WebElement>  followingSib =driver.findElements(By.xpath("//a[contains(text(),'Om Infra')]/parent::td/following-sibling::td"));
        int totalfollowingSib = followingSib.size();
        System.out.println( totalfollowingSib );

        //Preceding : select all the nodes that appear before the current node in the document
        List<WebElement>  preceding =driver.findElements(By.xpath("//a[contains(text(),'Om Infra')]/parent::td/preceding::td"));
        int totalpreceding = preceding.size();
        System.out.println( totalpreceding );

        //Preceding-sibling: select all the siblings before the current node
        List<WebElement>  precedingSib =driver.findElements(By.xpath("//a[contains(text(),'Om Infra')]/ancestor::tr/preceding-sibling::tr"));
        int totalprecedingSib = precedingSib.size();
        System.out.println( totalprecedingSib );

        //close the current browser instance.
        driver.close();



    }



}
