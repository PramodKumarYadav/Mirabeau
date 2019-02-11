import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}
