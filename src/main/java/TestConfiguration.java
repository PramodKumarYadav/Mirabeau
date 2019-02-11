import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestConfiguration {

    public static final String TestBrowser = "Chrome";
    public static String urlToTest = "http://automationpractice.com";
    private WebDriver driver;

    // Environment variables
    private String chosenDriver = "";
    private String chosenDriversLocation = "";

    public TestConfiguration()  {
        this(TestBrowser);
    }
    public TestConfiguration(String TestBrowser)  {
        // Create a new instance of the selected driver
        switch (TestBrowser) {
            case "Chrome":
                chosenDriver = "webdriver.chrome.driver";
                chosenDriversLocation = "D:\\chromedriver_win32\\chromedriver.exe";
                System.setProperty(chosenDriver,chosenDriversLocation);
                driver = new ChromeDriver();
                break;
            case "Firefox":
                chosenDriver = "webdriver.chrome.driver";
                chosenDriversLocation = "D:\\chromedriver_win32\\chromedriver.exe";
                System.setProperty(chosenDriver,chosenDriversLocation);
                driver = new FirefoxDriver();
                break;
            case "InternetExplorer":
                chosenDriver = "webdriver.chrome.driver";
                chosenDriversLocation = "D:\\chromedriver_win32\\chromedriver.exe";
                System.setProperty(chosenDriver,chosenDriversLocation);
                driver = new FirefoxDriver();
                break;
            default:
                chosenDriver = "webdriver.chrome.driver";
                chosenDriversLocation = "D:\\chromedriver_win32\\chromedriver.exe";
                System.setProperty(chosenDriver,chosenDriversLocation);
                driver = new ChromeDriver();
                break;
        }
    }
    public WebDriver getDriver() {
        return driver ;
    }
    public void quitDriver() {
        driver.close();
        driver.quit();
    }
}

