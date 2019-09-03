package api;

import java.util.Map;
import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;


/**
 * The type Request.
 */
public class Request {


    /**
     * Constant API_URL.
     */
    private static final String API_URL = ResourceBundle.getBundle("").getString("");

    /**
     * Make request api json.
     *
     * @param query the query
     * @return the api json
     */
    public static ApiJson makeRequest(Map<String, String> query) {
        String json = given()
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
