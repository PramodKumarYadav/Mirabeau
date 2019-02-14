import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestSearchNegative {

    // Instantiate configuration and pageObject classes
    TestConfiguration testConfiguration = new TestConfiguration();
    PageObject pageObject = new PageObject();

    // Create single driver for class
    WebDriver driver = testConfiguration.getDriver();
    private String urlToTest  =  TestConfiguration.urlToTest ;

    @Test
    public void canSearchAndAssertEmptyItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"");
        assertEquals("0 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertWithSpacesAsItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest," ");
        assertEquals("0 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertWithSpecialCharactersAsItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"#&(*#$(*&#$");
        assertEquals("0 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertWithWildCardAsItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"*");
        assertEquals("0 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
}