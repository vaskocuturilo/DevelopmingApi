package com.walmart.api;

/**
 * The enum Values.
 */
public enum Values {

    /**
     * Relevance value.
     */
    RELEVANCE("relevance"),
    /**
     * Price value.
     */
    PRICE("price"),
    /**
     * Title value.
     */
    TITLE("title"),
    /**
     * Bestseller value.
     */
    BESTSELLER("bestseller"),
    /**
     * Custom rating value.
     */
    CUSTOM_RATING("customerRating"),
    /**
     * New value.
     */
    NEW("new");

    /**
     * private value.
     */
    private String value;

    /**
     * Constructor Values.
     *
     * @param valueData thi is value.
     */
    Values(final String valueData) {
        this.value = valueData;
    }

    /**
     * Method getValue.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }
}
