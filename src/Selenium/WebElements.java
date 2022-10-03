import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\Users\kather.oli\IdeaProjects\Selenium\config\driver\chromedriver.exe");
        ChromeOptions options= new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://tnpsc.gov.in/");
        WebElement elmnt=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']//following::input[1]"));
//        System.out.println(elmnt.isEnabled());
        System.out.println(elmnt.isDisplayed());
        System.out.println(elmnt.isSelected());

    }
}
