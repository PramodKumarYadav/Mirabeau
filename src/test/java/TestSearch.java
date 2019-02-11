import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class TestSearch {

    // Instantiate configuration and pageObject classes
    TestConfiguration testConfiguration = new TestConfiguration();
    PageObject pageObject = new PageObject();

    // Create single driver for class
    WebDriver driver = testConfiguration.getDriver();
    private String urlToTest  =  TestConfiguration.urlToTest ;

    @Test
    public void canSearchAndAssertSummerItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"SUMMER");
        assertEquals("4 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertFadedItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"Faded");
        assertEquals("1 result has been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertPrintedItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"printed");
        assertEquals("5 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertCasualItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"casual");
        assertEquals("4 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertEveningItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"evening");
        assertEquals("1 result has been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertGirlyItemsCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"girly");
        assertEquals("3 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
    @Test
    public void canSearchAndAssertPartialItemNamesCount() {
        String itemsFound = pageObject.getCounterOfFoundItems(driver,urlToTest,"gir");
        assertEquals("3 results have been found.",itemsFound);
        testConfiguration.quitDriver();
    }
}