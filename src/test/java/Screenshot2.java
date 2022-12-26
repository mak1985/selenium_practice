import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot2 {
    public static void main(String[] args) throws IOException {

        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://testautomationpractice.blogspot.com/");

// Step 4: Maximize the browser
        driver.manage().window().maximize();
        // Step 1:  Convert webdriver object to TakeScreenshot interface
        TakesScreenshot takesScreenshot1 = ((TakesScreenshot) driver);

//        //Step 2 : Call getScreenshotAs() method to create image file
//        File scr = takesScreenshot1.getScreenshotAs(OutputType.FILE);
//        File destination = new File("C:\\Users\\Makhan AutomationHub\\Desktop\\SeleniumProjectsSample\\src\\test\\resources\\screenshots.test.png");
//
//        //Step 3: Copy image file to destination
//        FileUtils.copyFile(scr, destination);

        WebElement specificss= driver.findElement(By.xpath("//input[@id=\"field2\"]"));
        specificss.sendKeys("Hello Web Page");
        File src1 = specificss.getScreenshotAs(OutputType.FILE);
        File dest1 = new File("C:\\Users\\Makhan AutomationHub\\Desktop\\SeleniumProjectsSample\\src\\test\\resources\\screenshots.test2.png");
        FileUtils.copyFile(src1, dest1);
    }
}
