package com.walmart;

import com.walmart.api.ApiJson;
import com.walmart.api.Request;
import com.walmart.base.BaseApi;
import com.walmart.data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import com.walmart.page.HomePage;
import com.walmart.page.SortValues;

import java.util.Map;

import static com.walmart.api.Parameters.NUMBER_OF_ITEMS;
import static com.walmart.api.Parameters.QUERY;
import static org.testng.Assert.assertEquals;
import static com.walmart.page.SearchPage.getProductNameForItemsRange;
import static com.walmart.page.SearchPage.getProductPriceForItemsRange;

public class CheckResultTest extends BaseApi {

    @Test(dataProvider = "insertSearchData", dataProviderClass = DataProviders.class)
    @Story("The search example with com.walmart.api request.")
    public void searchWithApiRequest(Map<String, String> queryMap, SortValues sortValues) {

        ApiJson searchResultsApiJson = Request.makeRequest(queryMap);
        new HomePage()
                .enterTextToSearchField(queryMap.get(QUERY.getParameter()))
                .selectSortBy(sortValues);

        assertEquals(getProductNameForItemsRange(queryMap.get(NUMBER_OF_ITEMS.getParameter())),
                searchResultsApiJson.getNames(), "Wrong name.");

        assertEquals(getProductPriceForItemsRange(queryMap.get(NUMBER_OF_ITEMS.getParameter())),
                searchResultsApiJson.getPrices(), "Wrong price.");
    }
}
