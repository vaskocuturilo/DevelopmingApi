package com.walmart.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The class Item.
 */
public class Item {

    @JsonProperty("itemId")
    private Integer itemId;
    @JsonProperty("parentItemId")
    private Integer parentItemId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("salePrice")
    private Double salePrice;
    @JsonProperty("upc")
    private Double upc;
    @JsonProperty("categoryPath")
    private String categoryPath;
    @JsonProperty("shortDescription")
    private String shortDescription;
    @JsonProperty("longDescription")
    private String longDescription;
    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("mediumImage")
    private String mediumImage;
    @JsonProperty("largeImage")
    private String largeImage;
    @JsonProperty("productTrackingUrl")
    private String productTrackingUrl;
    @JsonProperty("standardShipRate")
    private Double standardShipRate;
    @JsonProperty("marketplace")
    private Boolean marketplace;
    @JsonProperty("sellerInfo")
    private String sellerInfo;
    @JsonProperty("productUrl")
    private String productUrl;
    @JsonProperty("categoryNode")
    private String categoryNode;
    @JsonProperty("rhid")
    private String rhid;
    @JsonProperty("bundle")
    private Boolean bundle;
    @JsonProperty("stock")
    private String stock;
    @JsonProperty("addToCartUrl")
    private String addToCartUrl;
    @JsonProperty("affiliateAddToCartUrl")
    private String affiliateAddToCartUrl;
    @JsonProperty("freeShippingOver35Dollars")
    private Boolean freeShippingOver35Dollars;
    @JsonProperty("imageEntities")
    private List<ImageEntity> imageEntities = null;
    @JsonProperty("offerType")
    private String offerType;
    @JsonProperty("availableOnline")
    private Boolean availableOnline;
    @JsonProperty("msrp")
    private Double msrp;
    @JsonProperty("giftOptions")
    private GiftOptions giftOptions;
    @JsonProperty("isTwoDayShippingEligible")
    private Boolean isTwoDayShippingEligible;

    /**
     * No args constructor for use in serialization
     */
    public Item() {
        super();
        //empty
        return;
    }

    /**
     * Constructor Item.
     *
     * @param itemId                    the item id
     * @param parentItemId              the parent item id
     * @param name                      the name
     * @param salePrice                 the sale price
     * @param categoryPath              the category path
     * @param shortDescription          the short description
     * @param longDescription           the long description
     * @param thumbnailImage            the thumbnail image
     * @param mediumImage               the medium image
     * @param largeImage                the large image
     * @param productTrackingUrl        the product tracking url
     * @param standardShipRate          the standard ship rate
     * @param marketplace               the marketplace
     * @param sellerInfo                the seller info
     * @param productUrl                the product url
     * @param categoryNode              the category node
     * @param rhid                      the rhid
     * @param bundle                    the bundle
     * @param stock                     the stock
     * @param addToCartUrl              the add to cart url
     * @param affiliateAddToCartUrl     the affiliate add to cart url
     * @param freeShippingOver35Dollars the free shipping over 35 dollars
     * @param imageEntities             the image entities
     * @param offerType                 the offer type
     * @param availableOnline           the available online
     * @param msrp                      the msrp
     * @param giftOptions               the gift options
     * @param isTwoDayShippingEligible  the is two day shipping eligible
     */
    public Item(Integer itemId, Integer parentItemId, String name, Double salePrice, String categoryPath, String shortDescription, String longDescription, String thumbnailImage, String mediumImage, String largeImage, String productTrackingUrl, Double standardShipRate, Boolean marketplace, String sellerInfo, String productUrl, String categoryNode, String rhid, Boolean bundle, String stock, String addToCartUrl, String affiliateAddToCartUrl, Boolean freeShippingOver35Dollars, List<ImageEntity> imageEntities, String offerType, Boolean availableOnline, Double msrp, GiftOptions giftOptions, Boolean isTwoDayShippingEligible) {
        super();
        this.itemId = itemId;
        this.parentItemId = parentItemId;
        this.name = name;
        this.salePrice = salePrice;
        this.categoryPath = categoryPath;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.productTrackingUrl = productTrackingUrl;
        this.standardShipRate = standardShipRate;
        this.marketplace = marketplace;
        this.sellerInfo = sellerInfo;
        this.productUrl = productUrl;
        this.categoryNode = categoryNode;
        this.rhid = rhid;
        this.bundle = bundle;
        this.stock = stock;
        this.addToCartUrl = addToCartUrl;
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
        this.imageEntities = imageEntities;
        this.offerType = offerType;
        this.availableOnline = availableOnline;
        this.msrp = msrp;
        this.giftOptions = giftOptions;
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
    }

    /**
     * Gets item id.
     *
     * @return the item id
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * Sets item id.
     *
     * @param itemId the item id
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * Gets parent item id.
     *
     * @return the parent item id
     */
    public Integer getParentItemId() {
        return parentItemId;
    }

    /**
     * Sets parent item id.
     *
     * @param parentItemId the parent item id
     */
    public void setParentItemId(Integer parentItemId) {
        this.parentItemId = parentItemId;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets sale price.
     *
     * @return the sale price
     */
    public Double getSalePrice() {
        return salePrice;
    }

    /**
     * Sets sale price.
     *
     * @param salePrice the sale price
     */
    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * Gets category path.
     *
     * @return the category path
     */
    public String getCategoryPath() {
        return categoryPath;
    }

    /**
     * Sets category path.
     *
     * @param categoryPath the category path
     */
    public void setCategoryPath(String categoryPath) {
        this.categoryPath = categoryPath;
    }

    /**
     * Gets short description.
     *
     * @return the short description
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Sets short description.
     *
     * @param shortDescription the short description
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * Gets long description.
     *
     * @return the long description
     */
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Sets long description.
     *
     * @param longDescription the long description
     */
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * Gets thumbnail image.
     *
     * @return the thumbnail image
     */
    public String getThumbnailImage() {
        return thumbnailImage;
    }

    /**
     * Sets thumbnail image.
     *
     * @param thumbnailImage the thumbnail image
     */
    public void setThumbnailImage(String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    /**
     * Gets medium image.
     *
     * @return the medium image
     */
    public String getMediumImage() {
        return mediumImage;
    }

    /**
     * Sets medium image.
     *
     * @param mediumImage the medium image
     */
    public void setMediumImage(String mediumImage) {
        this.mediumImage = mediumImage;
    }

    /**
     * Gets large image.
     *
     * @return the large image
     */
    public String getLargeImage() {
        return largeImage;
    }

    /**
     * Sets large image.
     *
     * @param largeImage the large image
     */
    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    /**
     * Gets product tracking url.
     *
     * @return the product tracking url
     */
    public String getProductTrackingUrl() {
        return productTrackingUrl;
    }

    /**
     * Sets product tracking url.
     *
     * @param productTrackingUrl the product tracking url
     */
    public void setProductTrackingUrl(String productTrackingUrl) {
        this.productTrackingUrl = productTrackingUrl;
    }

    /**
     * Gets standard ship rate.
     *
     * @return the standard ship rate
     */
    public Double getStandardShipRate() {
        return standardShipRate;
    }

    /**
     * Sets standard ship rate.
     *
     * @param standardShipRate the standard ship rate
     */
    public void setStandardShipRate(Double standardShipRate) {
        this.standardShipRate = standardShipRate;
    }

    /**
     * Gets marketplace.
     *
     * @return the marketplace
     */
    public Boolean getMarketplace() {
        return marketplace;
    }

    /**
     * Sets marketplace.
     *
     * @param marketplace the marketplace
     */
    public void setMarketplace(Boolean marketplace) {
        this.marketplace = marketplace;
    }

    /**
     * Gets seller info.
     *
     * @return the seller info
     */
    public String getSellerInfo() {
        return sellerInfo;
    }

    /**
     * Sets seller info.
     *
     * @param sellerInfo the seller info
     */
    public void setSellerInfo(String sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    /**
     * Gets product url.
     *
     * @return the product url
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * Sets product url.
     *
     * @param productUrl the product url
     */
    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    /**
     * Gets category node.
     *
     * @return the category node
     */
    public String getCategoryNode() {
        return categoryNode;
    }

    /**
     * Sets category node.
     *
     * @param categoryNode the category node
     */
    public void setCategoryNode(String categoryNode) {
        this.categoryNode = categoryNode;
    }

    /**
     * Gets rhid.
     *
     * @return the rhid
     */
    public String getRhid() {
        return rhid;
    }

    /**
     * Sets rhid.
     *
     * @param rhid the rhid
     */
    public void setRhid(String rhid) {
        this.rhid = rhid;
    }

    /**
     * Gets bundle.
     *
     * @return the bundle
     */
    public Boolean getBundle() {
        return bundle;
    }

    /**
     * Sets bundle.
     *
     * @param bundle the bundle
     */
    public void setBundle(Boolean bundle) {
        this.bundle = bundle;
    }

    /**
     * Gets stock.
     *
     * @return the stock
     */
    public String getStock() {
        return stock;
    }

    /**
     * Sets stock.
     *
     * @param stock the stock
     */
    public void setStock(String stock) {
        this.stock = stock;
    }

    /**
     * Gets add to cart url.
     *
     * @return the add to cart url
     */
    public String getAddToCartUrl() {
        return addToCartUrl;
    }

    /**
     * Sets add to cart url.
     *
     * @param addToCartUrl the add to cart url
     */
    public void setAddToCartUrl(String addToCartUrl) {
        this.addToCartUrl = addToCartUrl;
    }

    /**
     * Gets affiliate add to cart url.
     *
     * @return the affiliate add to cart url
     */
    public String getAffiliateAddToCartUrl() {
        return affiliateAddToCartUrl;
    }

    /**
     * Sets affiliate add to cart url.
     *
     * @param affiliateAddToCartUrl the affiliate add to cart url
     */
    public void setAffiliateAddToCartUrl(String affiliateAddToCartUrl) {
        this.affiliateAddToCartUrl = affiliateAddToCartUrl;
    }

    /**
     * Gets free shipping over 35 dollars.
     *
     * @return the free shipping over 35 dollars
     */
    public Boolean getFreeShippingOver35Dollars() {
        return freeShippingOver35Dollars;
    }

    /**
     * Sets free shipping over 35 dollars.
     *
     * @param freeShippingOver35Dollars the free shipping over 35 dollars
     */
    public void setFreeShippingOver35Dollars(Boolean freeShippingOver35Dollars) {
        this.freeShippingOver35Dollars = freeShippingOver35Dollars;
    }

    /**
     * Gets image entities.
     *
     * @return the image entities
     */
    public List<ImageEntity> getImageEntities() {
        return imageEntities;
    }

    /**
     * Sets image entities.
     *
     * @param imageEntities the image entities
     */
    public void setImageEntities(List<ImageEntity> imageEntities) {
        this.imageEntities = imageEntities;
    }

    /**
     * Gets offer type.
     *
     * @return the offer type
     */
    public String getOfferType() {
        return offerType;
    }

    /**
     * Sets offer type.
     *
     * @param offerType the offer type
     */
    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    /**
     * Gets available online.
     *
     * @return the available online
     */
    public Boolean getAvailableOnline() {
        return availableOnline;
    }

    /**
     * Sets available online.
     *
     * @param availableOnline the available online
     */
    public void setAvailableOnline(Boolean availableOnline) {
        this.availableOnline = availableOnline;
    }

    /**
     * Gets msrp.
     *
     * @return the msrp
     */
    public Double getMsrp() {
        return msrp;
    }

    /**
     * Sets msrp.
     *
     * @param msrp the msrp
     */
    public void setMsrp(Double msrp) {
        this.msrp = msrp;
    }

    /**
     * Gets gift options.
     *
     * @return the gift options
     */
    public GiftOptions getGiftOptions() {
        return giftOptions;
    }

    /**
     * Sets gift options.
     *
     * @param giftOptions the gift options
     */
    public void setGiftOptions(GiftOptions giftOptions) {
        this.giftOptions = giftOptions;
    }

    /**
     * Gets is two day shipping eligible.
     *
     * @return the is two day shipping eligible
     */
    public Boolean getIsTwoDayShippingEligible() {
        return isTwoDayShippingEligible;
    }

    /**
     * Sets is two day shipping eligible.
     *
     * @param isTwoDayShippingEligible the is two day shipping eligible
     */
    public void setIsTwoDayShippingEligible(Boolean isTwoDayShippingEligible) {
        this.isTwoDayShippingEligible = isTwoDayShippingEligible;
    }

}
