package com.walmart.api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The class Image entity.
 */
public class ImageEntity {

    @JsonProperty("thumbnailImage")
    private String thumbnailImage;
    @JsonProperty("mediumImage")
    private String mediumImage;
    @JsonProperty("largeImage")
    private String largeImage;
    @JsonProperty("entityType")
    private String entityType;

    /**
     * Default constructor.
     */
    public ImageEntity() {
        super();
        //empty
        return;
    }

    /**
     * Instantiates a new Image entity.
     *
     * @param thumbnailImage the thumbnail image
     * @param mediumImage    the medium image
     * @param largeImage     the large image
     * @param entityType     the entity type
     */
    public ImageEntity(final String thumbnailImage, final String mediumImage, final String largeImage, final String entityType) {
        super();
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.entityType = entityType;
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
    public void setThumbnailImage(final String thumbnailImage) {
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
    public void setMediumImage(final String mediumImage) {
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
    public void setLargeImage(final String largeImage) {
        this.largeImage = largeImage;
    }

    /**
     * Gets entity type.
     *
     * @return the entity type
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * Sets entity type.
     *
     * @param entityType the entity type
     */
    public void setEntityType(final String entityType) {
        this.entityType = entityType;
    }

}
