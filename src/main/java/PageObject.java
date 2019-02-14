import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.Map;

public class PageObject {

    public String getTitleOfAPage(WebDriver driver, String urlOfPage) {

        // Navigate to url and get title
        driver.navigate().to(urlOfPage);
        String pageTitle = driver.getTitle();
        System.out.println("pageTitle : " + pageTitle);

        return pageTitle;
    }
    public String getCounterOfFoundItems(WebDriver driver, String urlOfPage, String itemToSearch) {

        driver.navigate().to(urlOfPage);

        // Clear existing value and search with value provided by user
        WebElement search_query = driver.findElement(By.id("search_query_top"));
        search_query.clear();
        search_query.sendKeys(itemToSearch);

        // Now click the search button
        WebElement submit_search = driver.findElement(By.name("submit_search"));
        submit_search.click();

        // Get the count of items found
        WebElement heading_counter = driver.findElement(By.className("heading-counter"));
        String itemsFound = heading_counter.getText();
        System.out.println("itemsFound : " +itemsFound);

        return  itemsFound;
    }
    public Map<String, String> getCounterOfFoundItemsUsingList(WebDriver driver, String urlOfPage, Map<String, String> mapOfItemsToTest) {

        driver.navigate().to(urlOfPage);
        Map<String, String> actualMap = new HashMap<>();


        for (Map.Entry<String, String> entry : mapOfItemsToTest.entrySet()) {
            System.out.println("Testing entry : " + entry.getKey());
            System.out.println("Expected : " + entry.getValue());

            // Clear existing value and search with value provided by user
            // For each item in list, search and assert the value.
            WebElement search_query = driver.findElement(By.id("search_query_top"));
            search_query.clear();
            search_query.sendKeys(entry.getKey());

            // Now click the search button
            WebElement submit_search = driver.findElement(By.name("submit_search"));
            submit_search.click();

            // Get the count of items found
            WebElement heading_counter = driver.findElement(By.className("heading-counter"));
            String itemsFound = heading_counter.getText();
            System.out.println("Actual   : " + itemsFound);
            System.out.println("");
            actualMap.put(entry.getKey(), itemsFound);
        }

        System.out.println("Returned actual map" + actualMap);
        return  actualMap;
    }
}
