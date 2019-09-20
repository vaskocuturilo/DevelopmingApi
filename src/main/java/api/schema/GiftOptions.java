package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

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
     * @param allowGiftMessage
     * @param allowGiftReceipt
     * @param allowGiftWrap
     */
    public GiftOptions(final Boolean allowGiftWrap, final Boolean allowGiftMessage, final Boolean allowGiftReceipt) {
        super();
        this.allowGiftWrap = allowGiftWrap;
        this.allowGiftMessage = allowGiftMessage;
        this.allowGiftReceipt = allowGiftReceipt;
    }

    public Boolean getAllowGiftWrap() {
        return allowGiftWrap;
    }

    public void setAllowGiftWrap(final Boolean allowGiftWrap) {
        this.allowGiftWrap = allowGiftWrap;
    }

    public Boolean getAllowGiftMessage() {
        return allowGiftMessage;
    }

    public void setAllowGiftMessage(final Boolean allowGiftMessage) {
        this.allowGiftMessage = allowGiftMessage;
    }

    public Boolean getAllowGiftReceipt() {
        return allowGiftReceipt;
    }

    public void setAllowGiftReceipt(final Boolean allowGiftReceipt) {
        this.allowGiftReceipt = allowGiftReceipt;
    }
}
