import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {

        // Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        // create an object of webdriver
        WebDriver driver = new ChromeDriver();

        // Launch the web page
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();

        List< WebElement> linkList = driver.findElements(By.tagName("a"));
        int resCode=0;
        int brokenLinkCount=0;

        System.out.println("Total links on page :"+ linkList.size());

        for(WebElement element:linkList)
        {
            String url = element.getAttribute("href");
            try{
                URL urlLink = new URL(url);
                HttpURLConnection huc = (HttpURLConnection)urlLink.openConnection();
                huc.setRequestMethod("HEAD");
                huc.connect();
                resCode = huc.getResponseCode();
                if(resCode >=500)
                {
                    System.out.println(url+ "broken link");
                    brokenLinkCount++;
                }
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total broken links" + brokenLinkCount);
        }
        driver.close();

    }
}
