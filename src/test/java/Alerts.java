import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Desktop\\chrome_webdriver\\chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://demoqa.com/alerts");

// Step 4: Maximize the browser
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//*[@id=\"alertButton\"]")).click();
//        //switch to alert window and accept the alert

        //Find the locator for box# 3
        driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
//        driver.switchTo().alert().accept(); // OK button is clicked
        driver.switchTo().alert().dismiss(); //Cancel button is clicks
        Thread.sleep(2000);

//        driver.switchTo().alert().sendKeys("Test");
//        driver.switchTo().alert().accept();
    }

}
