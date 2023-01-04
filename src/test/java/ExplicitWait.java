import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        //Using for any spacific element -
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1)); //After selenium 4.0
        WebElement e = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Click Me']")));
        e.click();
        //
    }
}
