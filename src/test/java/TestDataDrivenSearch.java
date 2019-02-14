import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestDataDrivenSearch {

    // Instantiate configuration and pageObject classes
    TestConfiguration testConfiguration = new TestConfiguration();
    TestData testData = new TestData();
    PageObject pageObject = new PageObject();

    // Create single driver for class
    WebDriver driver = testConfiguration.getDriver();
    private String urlToTest  =  TestConfiguration.urlToTest ;

    @Test
    public void canAssertMoreThanOneSearchItemsResult() {

        try
        {
            Map<String, String> mapOfItemsToSearch = testData.mapOfsearchItemsWithExpectedCount();
            Map<String, String> itemsFoundActual = pageObject.getCounterOfFoundItemsUsingList(driver,urlToTest,mapOfItemsToSearch);
            assertEquals(mapOfItemsToSearch,itemsFoundActual);
        }
        finally
        {
            testConfiguration.quitDriver();
        }
    }
}
