package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The type Gift options.
 */
public class GiftOptions {

    @JsonProperty("allowGiftWrap")
    private Boolean allowGiftWrap;
    @JsonProperty("allowGiftMessage")
    private Boolean allowGiftMessage;
    @JsonProperty("allowGiftReceipt")
    private Boolean allowGiftReceipt;

    /**
     * No args constructor for use in serialization
     */
    public GiftOptions() {
        super();
        //empty
        return;
    }

    /**
     * Instantiates a new Gift options.
     *
     * @param allowGiftWrap    the allow gift wrap
     * @param allowGiftMessage the allow gift message
     * @param allowGiftReceipt the allow gift receipt
     */
    public GiftOptions(final Boolean allowGiftWrap, final Boolean allowGiftMessage, final Boolean allowGiftReceipt) {
        super();
        this.allowGiftWrap = allowGiftWrap;
        this.allowGiftMessage = allowGiftMessage;
        this.allowGiftReceipt = allowGiftReceipt;
    }

    /**
     * Gets allow gift wrap.
     *
     * @return the allow gift wrap
     */
    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    /**
     * Sets allow gift wrap.
     *
     * @param allowGiftWrap the allow gift wrap
     */
    public void setAllowGiftWrap(final Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    /**
     * Gets allow gift message.
     *
     * @return the allow gift message
     */
    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    /**
     * Sets allow gift message.
     *
     * @param allowGiftMessage the allow gift message
     */
    public void setAllowGiftMessage(final Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    /**
     * Gets allow gift receipt.
     *
     * @return the allow gift receipt
     */
    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    /**
     * Sets allow gift receipt.
     *
     * @param allowGiftReceipt the allow gift receipt
     */
    public void setAllowGiftReceipt(final Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
    }
}
