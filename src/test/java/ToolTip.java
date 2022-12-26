import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {
    public static void main(String[] args) {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Desktop\\chrome_webdriver\\chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://testautomationpractice.blogspot.com/");

// Step 4: Maximize the browser
        driver.manage().window().maximize();

        String actualToolTip = driver.findElement(By.xpath("//input[@id=\"age\"]")).getAttribute("title");

        String exepectedToolTip = "We ask for your age only for statistical purposes.";
        if(actualToolTip.equals(exepectedToolTip))
        {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test Failed");
        }
    }
}
