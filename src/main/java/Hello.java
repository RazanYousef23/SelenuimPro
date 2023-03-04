import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello {

    public static void main (String[] s)
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zoopla.co.uk/");
    }
}
