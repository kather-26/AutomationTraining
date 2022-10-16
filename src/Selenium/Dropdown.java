import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

    public class Dropdown {

        public static void main(String[] args) throws InterruptedException {


            System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Seleni\\config\\driver\\chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

            driver.manage().window().maximize();

            WebElement dropDown = driver.findElement(By.xpath("//p/select"));
            Thread.sleep(4000);
            dropDown.click();
            Select select = new Select(dropDown);
            select.selectByVisibleText("Aruba");
            driver.close();

    }
}
