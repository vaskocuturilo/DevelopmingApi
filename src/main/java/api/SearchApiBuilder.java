package api;

import java.util.HashMap;
import java.util.Map;

import static api.schema.Parameters.API_KEY;
import static api.schema.Parameters.QUERY;

/**
 * The type Search api builder.
 */
public class SearchApiBuilder {

    private final String apiKey;
    private final String query;
    private String isPublisherId;
    private String categoryId;
    private String start;
    private String sort;
    private String order;
    private String numItems;
    private String format;
    private String responseGroup;
    private String facet;
    private String facetFilter;
    private String facetRange;
    private Map<String, String> searchApiMap = new HashMap<>();

    /**
     * Instantiates a new Search api builder.
     *
     * @param apiKey the api key
     * @param query  the query
     */
    public SearchApiBuilder(String apiKey, String query) {
        this.apiKey = apiKey;
        this.searchApiMap.put(API_KEY.getParameter(), apiKey);
        this.query = query;
        this.searchApiMap.put(QUERY.getParameter(), query);
    }
}