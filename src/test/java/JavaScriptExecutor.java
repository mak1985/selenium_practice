import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Index");
        driver.manage().window().maximize();
        // Syntax
//        JavaScriptExecutor js = (JavaScriptExecutor) driver;
//        j
//
//
//        //click on button
//        WebElement element = driver.findElement(By.xpath("//input[@value=\"Find\"]"));


    }

    public void executeScript(String s, WebElement element) {
    }
}
