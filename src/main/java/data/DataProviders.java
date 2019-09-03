package data;

import api.SearchApiBuilder;
import org.testng.annotations.DataProvider;
import page.SortValues;

/**
 * The type Data providers.
 */
public class DataProviders {

    /**
     * Constant API_KEY.
     */
    private static final String API_KEY = "bq3jse8evy2euc6hwqg4huya";

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
                        .getSearchApiMap(), SortValues.NONE},

                {new SearchApiBuilder(API_KEY, "Shell Scripting")
                        .setNumItems("3")
                        .setSort("price")
                        .build()
                        .getSearchApiMap(), SortValues.PRICE_LOW}};
    }
}
