package com.walmart;

import api.ApiJson;
import api.Request;
import base.BaseAPI;
import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.HomePage;
import page.SortValues;

import java.util.Map;

import static api.Parameters.NUMBER_OF_ITEMS;
import static api.Parameters.QUERY;
import static org.testng.Assert.assertEquals;
import static page.SearchPage.getProductNameForItemsRange;
import static page.SearchPage.getProductPriceForItemsRange;

public class CheckResultTest extends BaseAPI {

    @Test(dataProvider = "insertSearchData", dataProviderClass = DataProviders.class)
    @Story("The search example with api request.")
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
