package data;

import api.SearchApiBuilder;
import org.testng.annotations.DataProvider;
import page.SortValues;

import java.util.ResourceBundle;


/**
 * The type Data providers.
 */
public class DataProviders {

    /**
     * The Api key.
     */
    public String apiKey = ResourceBundle.getBundle("api").getString("API_KEY");


    /**
     * Search data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */

    @DataProvider
    public Object[][] insertSearchData() {
        return new Object[][]{{
                new SearchApiBuilder(apiKey, "Shell Scripting")
                        .setNumItems("3")
                        .build()
                        .getSearchApiMap(), SortValues.NONE},

                {new SearchApiBuilder(apiKey, "Shell Scripting")
                        .setNumItems("3")
                        .setSort("price")
                        .build()
                        .getSearchApiMap(), SortValues.PRICE_LOW}};
    }
}
