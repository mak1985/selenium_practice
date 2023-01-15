import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JavaScriptExecutorDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.get("https://testautomationpractice.blogspot.com/");
        driver.get("https://demo.guru99.com/test/guru99home/scrolling.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("Script, Arguments");
//
//        Thread.sleep(2000);
//        // 1 Scroll down to web page by pixel 500
//        js.executeScript("window.scrollBy(0,1500)");
//        Thread.sleep(2000);
//        //scroll down the web page by the visibility of the element
//        WebElement ele = driver.findElement(By.xpath("//input[@type='submit'][@value='Submit']"));
////        js.executeScript("arguments[0].scrollIntoView();", ele);
//        js.executeScript("arguments[0].scrollIntoView();", ele);


        //scroll Horizontal
        WebElement ele1 = driver.findElement(By.linkText("VBScript"));
        js.executeScript("arguments[0].scrollIntoView();", ele1);


    }
}
