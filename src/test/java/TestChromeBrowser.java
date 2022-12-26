import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestChromeBrowser {

    public static void main(String[] args) {

        // Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver.exe"); // for chrome
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\drivername.exe"); // for Firefox

        // create an object of webdriver
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();

        // Launch google web page
        driver.get("https://www.google.com/");

        // Capture title of webpage and print on console
        String title = driver.getTitle();
        System.out.println("Page title:" + title);


        // capture page source
        System.out.println("URL of current webpage : " + driver.getCurrentUrl());
        System.out.println("PageSource : " + driver.getPageSource());

        // close the browser
        driver.close();

        //quit the browser
        //driver.quit();

    }
}
