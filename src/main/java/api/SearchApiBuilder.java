package api;

import java.util.HashMap;
import java.util.Map;

import static api.schema.Parameters.*;

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

    /**
     * Setter setIsPublisherId.
     *
     * @param isPublisherId this isPublisherId.
     * @return this.
     */
    public SearchApiBuilder setIsPublisherId(String isPublisherId) {
        this.isPublisherId = isPublisherId;
        this.searchApiMap.put(LS_PUBLISHER_ID.getParameter(), isPublisherId);
        return this;
    }

    public SearchApi build() {
        return new SearchApi(
                apiKey,
                query,
                isPublisherId,
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