package com.walmart;

import base.BaseAPI;
import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.SortValues;

import java.util.Map;

public class CheckResultTest extends BaseAPI {

    @Test(dataProvider = "insertSearchData", dataProviderClass = DataProviders.class)
    @Story("")
    public void searchWithApiRequest(Map<String, String> queryMap, SortValues sortValues) {

    }
}
