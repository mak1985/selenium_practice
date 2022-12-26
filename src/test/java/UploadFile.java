import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UploadFile {

    public static void main(String[] args) throws InterruptedException, AWTException {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        driver.get("https://www.foundit.in/");
        Thread.sleep(10000);

// Step 4: Maximize the browser
        driver.manage().window().maximize();

//        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']"))
//                .click();
//        driver.findElement(By.xpath("//input[@type=\"file\"][@id=\"file-upload\"]"))
//                .sendKeys("C:\\Users\\Makhan AutomationHub\\Desktop\\java_programs\\testDoc.txt");



        driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn__text']")).click();

        //Using Robot class
        WebElement uploadFile = driver.findElement(By.xpath("//input[@id=\"file-upload\"]"));

        Actions act = new Actions(driver);
        act.moveToElement(uploadFile).click().perform();

        Robot rb = new Robot();
        rb.delay(2000);
        //Copy file to clip board

        StringSelection ss = new StringSelection("C:\\Users\\Makhan AutomationHub\\Desktop\\java_programs\\testDoc.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        //perform control+V action to paste file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
    }
}
