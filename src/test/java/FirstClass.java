import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
 @Test
    public void navigateWebsite()
    {
      //  WebDriver driver =new ChromeDriver();
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver.get("zoopla.co.uk");
    }
}
