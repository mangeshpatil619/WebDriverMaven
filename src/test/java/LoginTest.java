import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

    public static WebDriver driver;


    @BeforeSuite
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MACK\\Documents\\TestSoftware\\ChromeDriver.exe");
        driver = new ChromeDriver();

    }

    @Test
    public void doLogin() {
        driver.get("http://gmail.com");
        driver.findElement(By.id("identifierId")).sendKeys("mangeshpatil619@gmail.com");
      //  driver.findElement(By.id("Passwd")).sendKeys("shaa@123");


    }

    @AfterSuite
    public void tearDown(){

        driver.quit();
    }
}
