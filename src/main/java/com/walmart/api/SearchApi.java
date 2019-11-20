package com.walmart.api;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The type Search com.walmart.api.
 */
public class SearchApi {

    /**
     * The private value apiKey.
     */
    private final String apiKey;

    /**
     * The private value isPublisherId .
     */
    private final String isPublisherId;

    /**
     * The private value query.
     */
    private final String query;

    /**
     * The private value categoryId.
     */
    private final String categoryId;

    /**
     * The private value start.
     */
    private final String start;
    /**
     * The private value sort.
     */
    private final String sort;
    /**
     * The private value order.
     */
    private final String order;

    /**
     * The private value numItems.
     */
    private final String numItems;
    /**
     * The private value format.
     */
    private final String format;

    /**
     * The private value responseGroup.
     */
    private final String responseGroup;

    /**
     * The private value facet.
     */
    private final String facet;

    /**
     * The private value facetFilter.
     */
    private final String facetFilter;

    /**
     * The private value facetRange.
     */
    private final String facetRange;

    /**
     * The private value searchApiMap.
     */
    private ConcurrentHashMap<String, String> searchApiMap = new ConcurrentHashMap<>();

    /**
     * Constructor search com.walmart.api.
     *
     * @param apiKey        the com.walmart.api key
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
     * @param searchApiMap  the search com.walmart.api map
     */
    public SearchApi(final String apiKey, final String isPublisherId, final String query,
                     final String categoryId, final String start, final String sort, final String order,
                     final String numItems, final String format, final String responseGroup,
                     final String facet, final String facetFilter, final String facetRange, final Map<String, String> searchApiMap) {
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
     * Gets search com.walmart.api map.
     *
     * @return the search com.walmart.api map
     */
    public Map<String, String> getSearchApiMap() {
        return searchApiMap;

    }
}
