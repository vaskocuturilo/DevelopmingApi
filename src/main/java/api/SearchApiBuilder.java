package api;

import java.util.concurrent.ConcurrentHashMap;

import static api.Parameters.*;

/**
 * The type Search api builder.
 */
public class SearchApiBuilder {

    /**
     * The private value apiKey.
     */
    private final String apiKey;

    /**
     * The private value query.
     */
    private final String query;

    /**
     * The private value publisherId.
     */
    private String publisherId;

    /**
     * The private value categoryId.
     */
    private String categoryId;

    /**
     * The private value start.
     */
    private String start;

    /**
     * The private value sort.
     */
    private String sort;

    /**
     * The private value order.
     */
    private String order;

    /**
     * The private value numItems.
     */
    private String numItems;

    /**
     * The private value format.
     */
    private String format;

    /**
     * The private value responseGroup.
     */
    private String responseGroup;

    /**
     * The private value facet.
     */
    private String facet;

    /**
     * The private value facetFilter.
     */
    private String facetFilter;

    /**
     * The private value facetRange.
     */
    private String facetRange;

    /**
     * The private value searchApiMap.
     */
    private ConcurrentHashMap<String, String> searchApiMap = new ConcurrentHashMap<>();

    /**
     * Instantiates a new Search api builder.
     * For parameters API_KEY and QUERY.
     *
     * @param apiKeyData the api key
     * @param queryData  the query
     */
    public SearchApiBuilder(final String apiKeyData, final String queryData) {
        this.apiKey = apiKeyData;
        this.searchApiMap.put(API_KEY.getParameter(), apiKeyData);
        this.query = queryData;
        this.searchApiMap.put(QUERY.getParameter(), queryData);
    }

    /**
     * Setter setPublisherId.
     * For parameters LS_PUBLISHER_ID.
     *
     * @param publisherId this publisherId.
     * @return this.
     */
    public SearchApiBuilder setPublisherId(final String publisherId) {
        this.publisherId = publisherId;
        this.searchApiMap.put(LS_PUBLISHER_ID.getParameter(), publisherId);

        return this;
    }

    /**
     * Setter setCategoryId.
     * For parameters CATEGORY_ID.
     *
     * @param categoryId this is categoryId.
     * @return this.
     */
    public SearchApiBuilder setCategoryId(final String categoryId) {
        this.categoryId = categoryId;
        this.searchApiMap.put(CATEGORY_ID.getParameter(), categoryId);

        return this;
    }

    /**
     * Setter setStart.
     * For parameters START.
     *
     * @param start this is start.
     * @return this.
     */
    public SearchApiBuilder setStart(final String start) {
        this.start = start;
        this.searchApiMap.put(START.getParameter(), start);
        return this;
    }

    /**
     * Setter setStart.
     * For parameters SORT.
     *
     * @param sort this is sort.
     * @return this.
     */
    public SearchApiBuilder setSort(final String sort) {
        this.sort = sort;
        this.searchApiMap.put(SORT.getParameter(), sort);

        return this;
    }

    /**
     * Setter setOrder.
     * For parameters ORDER.
     *
     * @param order this is order.
     * @return this.
     */
    public SearchApiBuilder setOrder(final String order) {
        this.order = order;
        this.searchApiMap.put(ORDER.getParameter(), order);
        return this;
    }

    /**
     * Setter setNumItems.
     * For parameters NUMBER_OF_ITEMS.
     *
     * @param numItems this is numItems.
     * @return this.
     */
    public SearchApiBuilder setNumItems(final String numItems) {
        this.numItems = numItems;
        this.searchApiMap.put(NUMBER_OF_ITEMS.getParameter(), numItems);

        return this;
    }

    /**
     * Setter setFormat.
     * For parameters FORMAT.
     *
     * @param format this is format.
     * @return this.
     */
    public SearchApiBuilder setFormat(final String format) {
        this.format = format;
        this.searchApiMap.put(FORMAT.getParameter(), format);

        return this;
    }

    /**
     * Setter setResponseGroup.
     * For parameters RESPONSE_GROUP.
     *
     * @param responseGroup this is responseGroup.
     * @return this.
     */
    public SearchApiBuilder setResponseGroup(final String responseGroup) {
        this.responseGroup = responseGroup;
        this.searchApiMap.put(RESPONSE_GROUP.getParameter(), responseGroup);

        return this;
    }


    /**
     * Setter setFacet.
     * For parameters FACET.
     *
     * @param facet this is facet.
     * @return this.
     */
    public SearchApiBuilder setFacet(final String facet) {
        this.facet = facet;
        this.searchApiMap.put(FACET.getParameter(), facet);

        return this;
    }

    /**
     * Setter setFacetFilter.
     * For parameters FACET_FILTER.
     *
     * @param facetFilter this is facet filter.
     * @return this.
     */
    public SearchApiBuilder setFacetFilter(final String facetFilter) {
        this.facetFilter = facetFilter;
        this.searchApiMap.put(FACET_FILTER.getParameter(), facetFilter);

        return this;
    }

    /**
     * Setter setFacetRange.
     * For parameters FACET_RANGE.
     *
     * @param facetRange this is facet facet range.
     * @return this.
     */
    public SearchApiBuilder setFacetRange(final String facetRange) {
        this.facetRange = facetRange;
        this.searchApiMap.put(FACET_RANGE.getParameter(), facetRange);

        return this;
    }

    /**
     * Builder build.
     *
     * @return new SearchApi.
     */
    public SearchApi build() {
        return new SearchApi(
                apiKey,
                query,
                publisherId,
                categoryId,
                start,
                sort,
                order,
                numItems,
                format,
                responseGroup,
                facet,
                facetFilter,
                facetRange,
                searchApiMap
        );
    }
}