import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OpenNewTabOrWindow {
    public static void main(String[] args) {
        // Step 1: Set Chrome web driver property along with chromedriver.exe path
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

// Step 2: Create an object of WebDriver(Interface) using ChromeDriver class
        WebDriver driver = new ChromeDriver();

// Step 3: Launch the web url

//        driver.get("https://testautomationpractice.blogspot.com/"); //1st url[0]
//        System.out.println(driver.getTitle());

// Step 4: Maximize the browser
//        driver.manage().window().maximize();
//
//        //Open new tab
//        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.google.com/"); // 2nd url[1]
//        System.out.println(driver.getTitle());

//        driver.quit();

//        //get window handles of open window
//        Set<String> windowHandles = driver.getWindowHandles();
//        List<String> handles = new ArrayList<String>();
//        handles.addAll(windowHandles);
//        //driver.close();
//
//
//
//
//        driver.switchTo().window(handles.get(1)); //switch to testautomationpractice url
//        System.out.println(driver.getTitle());

        driver.get("https://www.naukri.com/");
        driver.manage().window().maximize();
        String parent_window = driver.getWindowHandle();
        Set<String> s=driver.getWindowHandles();

        Iterator<String> I1 = s.iterator();

        while(I1.hasNext())
        {
            String child_window=I1.next();

            if (!parent_window.equals(child_window))
            {
                driver.switchTo().window(child_window);
                System.out.println(driver.switchTo().window(child_window).getTitle());
                driver.close();
            }

        }
        //switch to the parent window
        driver.switchTo().window(parent_window);
    }
}
