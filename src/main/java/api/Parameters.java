package api;


/**
 * The enum Parameters.
 */
public enum  Parameters {
    /**
     * Api key parameters.
     */
    API_KEY("apiKey"),
    /**
     * Ls publisher id parameters.
     */
    LS_PUBLISHER_ID("lsPublisherId"),
    /**
     * Query parameters.
     */
    QUERY("query"),
    /**
     * Category id parameters.
     */
    CATEGORY_ID("categoryId"),
    /**
     * Start parameters.
     */
    START("start"),
    /**
     * Sort parameters.
     */
    SORT("sort"),
    /**
     * Order parameters.
     */
    ORDER("order"),
    /**
     * Number of items parameters.
     */
    NUMBER_OF_ITEMS("numItems"),
    /**
     * Format parameters.
     */
    FORMAT("format"),
    /**
     * Response group parameters.
     */
    RESPONSE_GROUP("responseGroup"),
    /**
     * Facet parameters.
     */
    FACET("facet"),
    /**
     * Facet filter parameters.
     */
    FACET_FILTER("facet.filter"),

    /**
     * Facet range parameters.
     */
    FACET_RANGE("facet.range");

    /**
     * Private parameter.
     */
    private String parameter;

    /**
     * Default Constructor.
     */
    Parameters(String parameter) {
        this.parameter = parameter;
    }

    /**
     * Gets parameter.
     *
     * @return the parameter
     */
    public String getParameter() {
        return parameter;
    }
}
