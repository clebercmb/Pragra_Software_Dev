import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class HomeTest {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/cleber/Downloads/chromedriver");
    }

    @Test
    public void tc() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://zoom.us");
        driver.findElement(By.xpath("//div[@id='signupfree']/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='btnJoinMeeting']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@class='logo']")).click();

        //driver.navigate().back();
    }


    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}
