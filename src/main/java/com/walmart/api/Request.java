package com.walmart.api;

import java.util.Map;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;


/**
 * The type Request.
 */
public final class Request {


    /**
     * Constant API_URL.
     */
    private static final String API_URL = ResourceBundle.getBundle("test").getString("API_URL");


    /**
     * The private constructor.
     */
    private Request() {
    }

    /**
     * Make request com.walmart.api json.
     *
     * @param query the query
     * @return the com.walmart.api json
     */
    public static ApiJson makeRequest(final Map<String, String> query) {
        final String json = given()
                .params(query)
                .log()
                .all()
                .request()
                .when()
                .get(API_URL)
                .getBody().asString();

        return new ApiJson(json);
    }

}
