import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {

        // Launch Chrome web browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

        // create an object of webdriver
        WebDriver driver = new ChromeDriver();


        // Launch the web page
        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("input-country"));
        Select dropdown = new Select(element);
//        dropdown.selectByVisibleText("Zimbabwe");

//        dropdown.selectByValue("73");

//        dropdown.selectByIndex(69);//Falkland Islands (Malvinas)

        if(dropdown.isMultiple() == true)
        {
            System.out.println("Dropdown is multiple");
        }
        else
        {
            System.out.println("Dropdown is NOT multiple");
        }

        List<WebElement> allDropdownOptions = dropdown.getOptions();

        for(WebElement el: allDropdownOptions)
        {
            System.out.println(el.getText());
        }
        System.out.println("Total options: " + allDropdownOptions.size());

        driver.close();
    }
}
