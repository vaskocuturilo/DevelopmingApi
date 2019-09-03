package data;

import api.SearchApiBuilder;
import api.Values;
import org.testng.annotations.DataProvider;
import page.SortValues;

import static api.Parameters.API_KEY;

/**
 * The type Data providers.
 */
public class DataProviders {
    /**
     * Search data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider
    public Object[][] insertSearchData() {
        return new Object[][]{{
                new SearchApiBuilder(API_KEY, "Shell Scripting")
                        .setNumItems("3")
                        .build()
                        .getSearchApiMap(), SortValues.NONE}, {
                new SearchApiBuilder(API_KEY, "Shell Scripting")
                        .setNumItems("3")
                        .setSort(Values.PRICE)
                        .build()
                        .getSearchApiMap(), SortValues.PRICE_LOW}};
    }
}
