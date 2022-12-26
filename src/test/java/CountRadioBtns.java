import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CountRadioBtns {

    public static void main(String[] args) {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");

// Step 4: Maximize the browser
        driver.manage().window().maximize();

        List<WebElement> radioBtn = driver.findElements(By.xpath("//tbody/tr/td"));
        System.out.println("Total no.of radio btns on web page : " +radioBtn.size());//2 radio btns
    }
}
