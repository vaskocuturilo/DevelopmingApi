package page;


/**
 * The enum Sort values.
 */
public enum SortValues {

    /**
     * None sort values.
     */
    NEW("New"),
    /**
     * Best match sort values.
     */
    BEST_MATCH("Best Match"),
    /**
     * Best sellers sort values.
     */
    BEST_SELLERS("Best Sellers"),
    /**
     * Price low sort values.
     */
    PRICE_LOW("Price: low to high"),
    /**
     * Price high sort values.
     */
    PRICE_HIGH("Price: high to low"),
    /**
     * Rating high sort values.
     */
    RATING_HIGH("Highest Rating");

    /**
     * The private value.
     */
    private String value;


    /**
     * Constructor.
     *
     * @param value this is value.
     */
    SortValues(final String value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

}
