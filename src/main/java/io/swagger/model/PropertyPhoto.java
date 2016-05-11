package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PropertyPhoto   {
  
  private String largePhotoUrl = null;
  private String mediumPhotoUrl = null;
  private Date scanDate = null;
  private String thumbnailPhotoUrl = null;

  /**
   * Large size photo URL. Photo size 768x512.
   **/
  public PropertyPhoto largePhotoUrl(String largePhotoUrl) {
    this.largePhotoUrl = largePhotoUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Large size photo URL. Photo size 768x512.")
  @JsonProperty("largePhotoUrl")
  public String getLargePhotoUrl() {
    return largePhotoUrl;
  }
  public void setLargePhotoUrl(String largePhotoUrl) {
    this.largePhotoUrl = largePhotoUrl;
  }

  /**
   * Medium size photo URL. Photo size 470x313.
   **/
  public PropertyPhoto mediumPhotoUrl(String mediumPhotoUrl) {
    this.mediumPhotoUrl = mediumPhotoUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Medium size photo URL. Photo size 470x313.")
  @JsonProperty("mediumPhotoUrl")
  public String getMediumPhotoUrl() {
    return mediumPhotoUrl;
  }
  public void setMediumPhotoUrl(String mediumPhotoUrl) {
    this.mediumPhotoUrl = mediumPhotoUrl;
  }

  /**
   * The date the image was created in format YYYY-MM-DD.
   **/
  public PropertyPhoto scanDate(Date scanDate) {
    this.scanDate = scanDate;
    return this;
  }

  
  @ApiModelProperty(value = "The date the image was created in format YYYY-MM-DD.")
  @JsonProperty("scanDate")
  public Date getScanDate() {
    return scanDate;
  }
  public void setScanDate(Date scanDate) {
    this.scanDate = scanDate;
  }

  /**
   * Thumbnail photo URL. Photo size 120x80.
   **/
  public PropertyPhoto thumbnailPhotoUrl(String thumbnailPhotoUrl) {
    this.thumbnailPhotoUrl = thumbnailPhotoUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Thumbnail photo URL. Photo size 120x80.")
  @JsonProperty("thumbnailPhotoUrl")
  public String getThumbnailPhotoUrl() {
    return thumbnailPhotoUrl;
  }
  public void setThumbnailPhotoUrl(String thumbnailPhotoUrl) {
    this.thumbnailPhotoUrl = thumbnailPhotoUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyPhoto propertyPhoto = (PropertyPhoto) o;
    return Objects.equals(largePhotoUrl, propertyPhoto.largePhotoUrl) &&
        Objects.equals(mediumPhotoUrl, propertyPhoto.mediumPhotoUrl) &&
        Objects.equals(scanDate, propertyPhoto.scanDate) &&
        Objects.equals(thumbnailPhotoUrl, propertyPhoto.thumbnailPhotoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(largePhotoUrl, mediumPhotoUrl, scanDate, thumbnailPhotoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyPhoto {\n");
    
    sb.append("    largePhotoUrl: ").append(toIndentedString(largePhotoUrl)).append("\n");
    sb.append("    mediumPhotoUrl: ").append(toIndentedString(mediumPhotoUrl)).append("\n");
    sb.append("    scanDate: ").append(toIndentedString(scanDate)).append("\n");
    sb.append("    thumbnailPhotoUrl: ").append(toIndentedString(thumbnailPhotoUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

