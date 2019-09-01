package api;

import java.util.concurrent.ConcurrentHashMap;

import static api.schema.Parameters.*;

/**
 * The type Search api builder.
 */
public class SearchApiBuilder {

    private final String apiKey;
    private final String query;
    private String publisherId;
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
    private ConcurrentHashMap<String, String> searchApiMap = new ConcurrentHashMap<>();

    /**
     * Instantiates a new Search api builder.
     * For parameters API_KEY and QUERY.
     *
     * @param apiKey the api key
     * @param query  the query
     */
    public SearchApiBuilder(final String apiKey, final String query) {
        this.apiKey = apiKey;
        this.searchApiMap.put(API_KEY.getParameter(), apiKey);
        this.query = query;
        this.searchApiMap.put(QUERY.getParameter(), query);
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
     * Builder build.
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