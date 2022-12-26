import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageLink {
    public static void main(String[] args) {

        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://www.opencart.com/");

// Step 4: Maximize the browser
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@title=\"OpenCart - Open Source Shopping Cart Solutio\"]")).click();

        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
        {
            System.out.println("Passed");
        }
        else
        {
            System.out.println("Failed");
        }
    }
}
