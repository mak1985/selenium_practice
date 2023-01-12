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
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //Click action using JavaScriptExecutor
        JavascriptExecutor js=(JavascriptExecutor) driver;
//        WebElement element= driver.findElement(By.xpath("//button/a[text()='Create New']"));
//        	js.executeScript("arguments[0].click();", element);

        // Refresh the browser window/page
//        js.executeScript("history.go(0)");

        //get domain name
//        String domain = js.executeScript("return document.domain;").toString();
//        System.out.println(domain);

        //get title name
//        String title = js.executeScript("return document.title").toString();
//        System.out.println(title);

        //get url name
//        String url = js.executeScript("return document.URL;").toString();
//        System.out.println(url);

        // draw border arround web element
//        WebElement element= driver.findElement(By.xpath("//input[@value='Find']"));
//        js.executeScript("arguments[0].style.border = '3px solid red';", element);

        //Zoom web page
//        js.executeScript("document.body.style.zoom='50%'");

        //Retrun height and width of web page
//        System.out.println(js.executeScript("return window.innerHeight;").toString());
//        System.out.println(js.executeScript("return window.innerWidth;").toString());

        //How to scroll down to the end of page - vertically
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//
//        Thread.sleep(10);
//        //How to scroll up to the end of page - vertically
//        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        //Navigate to different url
        js.executeScript("window.location='https://www.google.co.in/'");
    }
}
