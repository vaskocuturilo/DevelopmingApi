package api;

import api.schema.Item;
import groovy.json.JsonException;
import io.restassured.path.json.JsonPath;

import java.util.Collections;
import java.util.List;

/**
 * The type Api json.
 */
public class ApiJson {

    /**
     * The Private value.
     */
    private String json;

    /**
     * Instantiates a new Api json.
     *
     * @param json the json
     */
    public ApiJson(String json) {
        this.json = json;
    }

    /**
     * Gets all items.
     *
     * @return the all items
     */
    private List<Item> getAllItems() {
        try {
            return JsonPath.from(json).getList("item", Item.class);
        } catch (JsonException ex) {
            return Collections.EMPTY_LIST;
        }
    }
}
