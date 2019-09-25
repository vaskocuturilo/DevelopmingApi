package api;

import api.schema.Item;
import groovy.json.JsonException;
import io.restassured.path.json.JsonPath;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * The type Api json.
 */
public class ApiJson {

    /**
     * The Private value.
     */
    private final transient String json;

    /**
     * Instantiates a new Api json.
     *
     * @param jsonData the json
     */
    public ApiJson(final String jsonData) {
        this.json = jsonData;
    }

    /**
     * Gets all items.
     *
     * @return the all items.
     */
    private List<Item> getAllItems() {
        try {
            return JsonPath.from(json).getList("item", Item.class);
        } catch (JsonException ex) {
            return Collections.EMPTY_LIST;
        }
    }

    /**
     * Get Names.
     *
     * @return the all items.
     */
    public Set<String> getNames() {
        return getAllItems().stream().map(Item::getName)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /**
     * Get Prices.
     *
     * @return the all items.
     */
    public Set<Double> getPrices() {
        return getAllItems().stream().map(Item::getSalePrice)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
