import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
public class Download {
    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Seleni\\config\\driver\\chromedriver.exe");

        String downloadFilepath = "D:\\New folder\\Seleni\\src\\main\\java\\Path";
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("download.default_directory", downloadFilepath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.selenium.dev/downloads/");
        driver.manage().window().maximize();
        Thread.sleep(9000);
        WebElement ele=driver.findElement(By.xpath("//a[text()='4.5.0']"));
        ele.click();
       // chromePrefs.put("profile.default_content_settings.popups", 1);
      //    driver.quit();
    }
}
//java -jar selenium-server-4.2.2.jar hub
//        http://192.168.5.199:4444

// java -jar selenium-server-4.4.0.jar node --detect-drivers true --publish-events tcp://192.168.5.34:4442 --subscribe-events tcp://192.168.5.34:4443