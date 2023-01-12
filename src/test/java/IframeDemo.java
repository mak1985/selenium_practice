import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?index-all.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //switch to first frame using index
        driver.switchTo().frame(0);
        //find web element
        driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();

        //switch to 2nd frame using index
//        driver.switchTo().frame(1);
//        //find web element
//        driver.findElement(By.linkText("AbstractAnnotations")).click();
//
//        //switch to main frame or parent page
//        driver.switchTo().defaultContent(); //parent frame or main window/page
//
        //find & print total no.of iframe on web page
        driver.switchTo().defaultContent();
        int no_of_iframes = driver.findElements(By.tagName("iframe")).size();
        System.out.println("No of iframes : " + no_of_iframes);
    }
}
