import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\New folder\\Seleni\\config\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://testleaf.herokuapp.com/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//h5[text()='Checkbox']"));
        Thread.sleep(5000);
        element.click();

        WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        Thread.sleep(5000);
        checkbox.click();

        Thread.sleep(5);

        driver.close();



    }


}

