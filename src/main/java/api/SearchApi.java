package api;

import java.util.HashMap;
import java.util.Map;


/**
 * The type Search api.
 */
public class SearchApi {

    private final String apiKey;
    private final String isPublisherId;
    private final String query;
    private final String categoryId;
    private final String start;
    private final String sort;
    private final String order;
    private final String numItems;
    private final String format;
    private final String responseGroup;
    private final String facet;
    private final String facetFilter;
    private final String facetRange;
    private Map<String, String> searchApiMap = new HashMap<>();

    /**
     * Instantiates a new Search api.
     *
     * @param apiKey        the api key
     * @param isPublisherId the is publisher id
     * @param query         the query
     * @param categoryId    the category id
     * @param start         the start
     * @param sort          the sort
     * @param order         the order
     * @param numItems      the num items
     * @param format        the format
     * @param responseGroup the response group
     * @param facet         the facet
     * @param facetFilter   the facet filter
     * @param facetRange    the facet range
     * @param searchApiMap  the search api map
     */
    public SearchApi(String apiKey, String isPublisherId, String query,
                     String categoryId, String start, String sort, String order,
                     String numItems, String format, String responseGroup,
                     String facet, String facetFilter, String facetRange, Map<String, String> searchApiMap) {
        this.apiKey = apiKey;
        this.isPublisherId = isPublisherId;
        this.query = query;
        this.categoryId = categoryId;
        this.start = start;
        this.sort = sort;
        this.order = order;
        this.numItems = numItems;
        this.format = format;
        this.responseGroup = responseGroup;
        this.facet = facet;
        this.facetFilter = facetFilter;
        this.facetRange = facetRange;
        this.searchApiMap.putAll(searchApiMap);

    }

    /**
     * Gets search api map.
     *
     * @return the search api map
     */
    public Map<String, String> getSearchApiMap() {
        return searchApiMap;
    }
}
