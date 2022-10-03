import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\Users\kather.oli\IdeaProjects\Selenium\config\driver\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tnpsc.gov.in/");
        Thread.sleep(4000);
        WebElement applyOnline = driver.findElement(By.xpath("//a[text()='Hall Ticket Download']/ancestor::li/preceding-sibling::li//a[.='Apply Online']"));
        applyOnline.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

    }
