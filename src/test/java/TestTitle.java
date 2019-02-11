import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestTitle {

    // Instantiate configuration and pageObject classes
    TestConfiguration testConfiguration = new TestConfiguration();
    PageObject pageObject = new PageObject();

    // Create single driver for class
    WebDriver driver = testConfiguration.getDriver();
    private String urlToTest  =  TestConfiguration.urlToTest ;

    @Test
    public void canAssertTitleOfHomePage() {
        String pageTitle = pageObject.getTitleOfAPage(driver,urlToTest);
        assertEquals("My Store",pageTitle);
        testConfiguration.quitDriver();
    }
}