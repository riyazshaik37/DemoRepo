import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

//No need to initialise system property,Env. variables and .exe extensions for launching browsers
//version 4.6.0 for selenium-java dependency willbe useful for direct launch
public class SeleniumManagerDemo {

@Test
    public void UseChromeBrowser(){

    String location=SeleniumManager.getInstance().getDriverPath("chromedriver");
    System.out.println(location);

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://dev.automationtesting.in");
    System.out.println(driver.getTitle());
}
    @Test
    public void UseFirefoxBrowser(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://dev.automationtesting.in");
        System.out.println(driver.getTitle());
    }

}
