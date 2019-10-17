package api.schema;

import com.fasterxml.jackson.annotation.JsonProperty;

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
     * No args constructor for use in serialization
     */
    public ImageEntity() {
        super();
        //empty
        return;
    }

    /**
     * @param mediumImage
     * @param largeImage
     * @param entityType
     * @param thumbnailImage
     */
    public ImageEntity(final String thumbnailImage, final String mediumImage, final String largeImage, final String entityType) {
        super();
        this.thumbnailImage = thumbnailImage;
        this.mediumImage = mediumImage;
        this.largeImage = largeImage;
        this.entityType = entityType;
    }

    public String getThumbnailImage() {
        return thumbnailImage;
    }

    public void setThumbnailImage(final String thumbnailImage) {
        this.thumbnailImage = thumbnailImage;
    }

    public String getMediumImage() {
        return mediumImage;
    }

    public void setMediumImage(final String mediumImage) {
        this.mediumImage = mediumImage;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(final String largeImage) {
        this.largeImage = largeImage;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(final String entityType) {
        this.entityType = entityType;
    }

}
