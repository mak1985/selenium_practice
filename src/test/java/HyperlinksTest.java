import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HyperlinksTest {
    public static void main(String[] args) {

        // Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create an object of webdriver
        WebDriver driver = new ChromeDriver();

        // Launch the web page
        driver.get("https://www.calculator.net/");

        //count total numbers of hyperlinks on web page
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Total links on web page: " + linkElements.size());

        //print total numbers of hyperlinks on web page
        for(WebElement el:linkElements)
        {
            System.out.println(el.getText());
        }

    }
}
