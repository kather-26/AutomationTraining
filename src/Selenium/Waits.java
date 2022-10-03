import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\Users\kather.oli\IdeaProjects\Selenium\config\driver\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://tnpsc.gov.in/");
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']")));
        WebElement applyOnline = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        applyOnline.click();
        driver.quit();




        // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
//    new WebDriverWait().until((ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
    }
}
