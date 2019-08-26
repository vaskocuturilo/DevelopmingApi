package data;

import org.testng.annotations.DataProvider;

/**
 * The type Data providers.
 */
public class DataProviders {
    /**
     * Search data object [ ] [ ].
     *
     * @return the object [ ] [ ]
     */
    @DataProvider(name = "searchData")
    public Object[][] searchData() {
        return new Object[][]{{}};
    }
}
