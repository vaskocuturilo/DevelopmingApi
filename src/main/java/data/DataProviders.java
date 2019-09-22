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
     * Default constructor.
     */
    public DataProviders() {
        super();
        //empty
        return;
    }

    /**
     * Search data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */

    @DataProvider
    public Object[][] insertSearchData() {
        return new Object[][]{{
                new SearchApiBuilder(apiKey, "Linux books")
                        .setNumItems("3")
                        .build()
                        .getSearchApiMap(), SortValues.NEW},

                {
                        new SearchApiBuilder(apiKey, "Sport car")
                                .setNumItems("3")
                                .setSort("price")
                                .build()
                                .getSearchApiMap(), SortValues.RATING_HIGH}};
    }
}
