package com.walmart;

import base.BaseAPI;
import data.DataProviders;
import io.qameta.allure.Story;
import org.testng.annotations.Test;

public class CheckResultTest extends BaseAPI {


    @Test(dataProvider = "searchData", dataProviderClass = DataProviders.class)
    @Story("")
    public void searchWithApiRequest() {

    }
}
