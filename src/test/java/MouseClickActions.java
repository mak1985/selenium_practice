import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClickActions {

    public static void main(String[] args) {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Makhan AutomationHub\\Desktop\\java_programs\\SeleniumAutomation\\src\\test\\resources\\drivers\\chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url
        //driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.get("https://demo.opencart.com/");
// Step 4: Maximize the browser
        driver.manage().window().maximize();

//        WebElement ele1 = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral'][text()='right click me']"));
//        Actions act1 = new Actions(driver);
//        act1.contextClick(ele1).perform(); //right click action

//        WebElement ele2 = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
//        Actions act2 = new Actions(driver);
//        act2.doubleClick(ele2).perform(); // double click action

//        WebElement source = driver.findElement(By.xpath("//a[@class='button button-orange'][text()=' 5000 ']"));
//        WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//
//        Actions act3 = new Actions(driver);
//        //drag & drop (sourceElement, targetElement)
//        act3.dragAndDrop(source, target).perform();

        //mouse over
        WebElement desktopLocator = driver.findElement(By.xpath("//li[@class='nav-item dropdown'][2]"));
        Actions act4 = new Actions(driver);
        act4.moveToElement(desktopLocator).perform();
        System.out.println("Passed");

    }
}
