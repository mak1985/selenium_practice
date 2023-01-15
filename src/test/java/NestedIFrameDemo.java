import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class NestedIFrameDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.switchTo().frame("frame1"); //parent/outer frame
        driver.switchTo().frame("frame3"); //child/inner frame

        //find web element checkbox
        driver.findElement(By.id("a")).click(); //child iframe

        driver.switchTo().parentFrame();
        //find web element for textbox
        driver.findElement(By.tagName("input")).sendKeys("Test");

        //driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");

        WebElement dropdown = driver.findElement(By.id("animals"));
        Select s1 = new Select(dropdown);
        s1.selectByVisibleText("Big Baby Cat");





    }
}
