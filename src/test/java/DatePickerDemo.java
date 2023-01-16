
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;
import java.util.List;

public class DatePickerDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        //switch to iframe
        driver.switchTo().frame(0);
        //Find date picker weblement to peform click action
        WebElement date_picker = driver.findElement(By.id("datepicker"));
        date_picker.click();

        String expected_day = "1";
        String expected_month = "June";
        String expected_year = "2024";

        while (true)
        {
            String calender_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calender_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            if(calender_month.equals(expected_month) && calender_year.equals(expected_year))
            {
                List <WebElement> no_of_days = driver.findElements(By.xpath("//table/tbody/tr/td"));

                for (WebElement e: no_of_days)
            {
                String calender_day = e.getText();

                if(calender_day.equals(expected_day))
                {
                    e.click();
                    break;
                }

            }break;
            }
            else
            {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }
    }
}
