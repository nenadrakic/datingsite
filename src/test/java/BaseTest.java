import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import pages.HomePage;

public class BaseTest {
    WebDriver driver;
    String mainUrl = "https://romanceabroad.com";

    HomePage homePage;

    @BeforeMethod
    @Parameters("browser")
    public void setup(@Optional("chrome") String browser) {
        if (browser.equalsIgnoreCase("firefox")) {
            // Create firefox instance
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.manage().deleteAllCookies();
        } else if (browser.equalsIgnoreCase("chrome")) {
            // Create Chrome instance
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowseData");
        } else if (browser.equalsIgnoreCase("IE")){
            //Create IE instance
            System.setProperty("webdriver.ie.driver", "resources/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();
        } else{
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowseData");
        }
        driver.manage().window().maximize();
        driver.get(mainUrl);

        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void close(){
        driver.quit();
    }
}
