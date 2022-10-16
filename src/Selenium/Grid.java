package Remote_webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Grid {
    static WebDriver driver;
    public static void main(String[] args) {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");//MicrosoftEdge
        try {
            driver = new RemoteWebDriver(new URL("http://192.168.5.199:4444"),caps);//http://192.168.5.199:4444
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement currentelement = driver.switchTo().activeElement();
        currentelement.sendKeys("selenium grid 4");
        currentelement.submit();

    }
}
