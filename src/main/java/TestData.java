import java.util.HashMap;
import java.util.Map;

public class TestData {

    public Map<String, String>  mapOfsearchItemsWithExpectedCount() {
        Map<String, String> mapOfSearchItemExpectedCount = new HashMap<>();

        mapOfSearchItemExpectedCount.put("SUMMER", "4 results have been found.");
        mapOfSearchItemExpectedCount.put("Faded", "1 result has been found.");
        mapOfSearchItemExpectedCount.put("printed", "4 results have been found.");
        mapOfSearchItemExpectedCount.put("casual", "4 results have been found.");
        mapOfSearchItemExpectedCount.put("girly", "3 results have been found.");
        mapOfSearchItemExpectedCount.put("gir", "3 results have been found.");

        return mapOfSearchItemExpectedCount;
    }
}
