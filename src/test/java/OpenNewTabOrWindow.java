import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {
    public static void main(String[] args) {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());

// Step 4: Maximize the browser
        driver.manage().window().maximize();

        //Open new tab
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

//        driver.quit();
    }
}
