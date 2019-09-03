package api;

/**
 * The enum Values.
 */
public enum Values {

    /**
     * Relevance values.
     */
    RELEVANCE("relevance"),
    /**
     * Price values.
     */
    PRICE("price"),
    /**
     * Title values.
     */
    TITLE("title"),
    /**
     * Bestseller values.
     */
    BESTSELLER("bestseller"),
    /**
     * Custom rating values.
     */
    CUSTOM_RATING("customerRating"),
    /**
     * New values.
     */
    NEW("new");

    /**
     * private values.
     */
    private String values;

    /**
     * Constructor Values.
     *
     * @param values thi is values.
     */
    Values(String values) {
        this.values = values;
    }

    /**
     * Method getValues.
     *
     * @return the values
     */
    public String getValues() {
        return values;
    }
}
