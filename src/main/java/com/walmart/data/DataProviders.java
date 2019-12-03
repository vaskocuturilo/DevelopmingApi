package com.walmart.data;

import com.walmart.api.SearchApiBuilder;
import org.testng.annotations.DataProvider;
import com.walmart.page.SortValues;

import java.util.ResourceBundle;


/**
 * The type Data providers.
 */
public class DataProviders {

    /**
     * The Api key.
     */
    private String apiKey = ResourceBundle.getBundle("api").getString("API_KEY");

    /**
     * Default constructor.
     */
    public DataProviders() {
        super();
        //empty
        return;
    }

    /**
     * Search com.walmart.data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */

    @DataProvider
    public Object[][] insertSearchData() {
        return new Object[][]{{
                new SearchApiBuilder(apiKey, "Shell scripting")
                        .setNumItems("3")
                        .build()
                        .getSearchApiMap(), SortValues.NEW},

                {
                        new SearchApiBuilder(apiKey, "Shell scripting")
                                .setNumItems("3")
                                .setSort("price")
                                .build()
                                .getSearchApiMap(), SortValues.RATING_HIGH}};
    }
}
