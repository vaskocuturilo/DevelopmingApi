package page;


/**
 * The enum Sort values.
 */
public enum SortValues {

    /**
     * None sort values.
     */
    NONE("none"),
    /**
     * Best match sort values.
     */
    BEST_MATCH("best_match"),
    /**
     * Best sellers sort values.
     */
    BEST_SELLERS("best_seller"),
    /**
     * Price low sort values.
     */
    PRICE_LOW("price_low"),
    /**
     * Price high sort values.
     */
    PRICE_HIGH("price_high"),
    /**
     * Rating high sort values.
     */
    RATING_HIGH("rating_high");

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
