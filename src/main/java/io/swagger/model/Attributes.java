package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class Attributes   {
  
  private Long bathrooms = null;
  private Long bedrooms = null;
  private Long carSpaces = null;
  private Boolean isCalculatedLandArea = null;
  private Long landArea = null;
  private Long lockUpGarages = null;

  /**
   * The number of bathrooms in the property.
   **/
  public Attributes bathrooms(Long bathrooms) {
    this.bathrooms = bathrooms;
    return this;
  }

  
  @ApiModelProperty(value = "The number of bathrooms in the property.")
  @JsonProperty("bathrooms")
  public Long getBathrooms() {
    return bathrooms;
  }
  public void setBathrooms(Long bathrooms) {
    this.bathrooms = bathrooms;
  }

  /**
   * The number of bedrooms in the property.
   **/
  public Attributes bedrooms(Long bedrooms) {
    this.bedrooms = bedrooms;
    return this;
  }

  
  @ApiModelProperty(value = "The number of bedrooms in the property.")
  @JsonProperty("bedrooms")
  public Long getBedrooms() {
    return bedrooms;
  }
  public void setBedrooms(Long bedrooms) {
    this.bedrooms = bedrooms;
  }

  /**
   * The number of car spaces available at the property.
   **/
  public Attributes carSpaces(Long carSpaces) {
    this.carSpaces = carSpaces;
    return this;
  }

  
  @ApiModelProperty(value = "The number of car spaces available at the property.")
  @JsonProperty("carSpaces")
  public Long getCarSpaces() {
    return carSpaces;
  }
  public void setCarSpaces(Long carSpaces) {
    this.carSpaces = carSpaces;
  }

  /**
   * For all states excluding Victoria: government land area is returned if available; otherwise CoreLogic Calculated Land Area will be returned if available.For Victoria: CoreLogic Calculated Land Area is returned if available, otherwise government land area will be returned if available. If land area data is not available, then this will not be returned.
   **/
  public Attributes isCalculatedLandArea(Boolean isCalculatedLandArea) {
    this.isCalculatedLandArea = isCalculatedLandArea;
    return this;
  }

  
  @ApiModelProperty(value = "For all states excluding Victoria: government land area is returned if available; otherwise CoreLogic Calculated Land Area will be returned if available.For Victoria: CoreLogic Calculated Land Area is returned if available, otherwise government land area will be returned if available. If land area data is not available, then this will not be returned.")
  @JsonProperty("isCalculatedLandArea")
  public Boolean getIsCalculatedLandArea() {
    return isCalculatedLandArea;
  }
  public void setIsCalculatedLandArea(Boolean isCalculatedLandArea) {
    this.isCalculatedLandArea = isCalculatedLandArea;
  }

  /**
   * The land area of the property, in m2
   **/
  public Attributes landArea(Long landArea) {
    this.landArea = landArea;
    return this;
  }

  
  @ApiModelProperty(value = "The land area of the property, in m2")
  @JsonProperty("landArea")
  public Long getLandArea() {
    return landArea;
  }
  public void setLandArea(Long landArea) {
    this.landArea = landArea;
  }

  /**
   * The number of lock up garages available at the property.
   **/
  public Attributes lockUpGarages(Long lockUpGarages) {
    this.lockUpGarages = lockUpGarages;
    return this;
  }

  
  @ApiModelProperty(value = "The number of lock up garages available at the property.")
  @JsonProperty("lockUpGarages")
  public Long getLockUpGarages() {
    return lockUpGarages;
  }
  public void setLockUpGarages(Long lockUpGarages) {
    this.lockUpGarages = lockUpGarages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attributes attributes = (Attributes) o;
    return Objects.equals(bathrooms, attributes.bathrooms) &&
        Objects.equals(bedrooms, attributes.bedrooms) &&
        Objects.equals(carSpaces, attributes.carSpaces) &&
        Objects.equals(isCalculatedLandArea, attributes.isCalculatedLandArea) &&
        Objects.equals(landArea, attributes.landArea) &&
        Objects.equals(lockUpGarages, attributes.lockUpGarages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bathrooms, bedrooms, carSpaces, isCalculatedLandArea, landArea, lockUpGarages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attributes {\n");
    
    sb.append("    bathrooms: ").append(toIndentedString(bathrooms)).append("\n");
    sb.append("    bedrooms: ").append(toIndentedString(bedrooms)).append("\n");
    sb.append("    carSpaces: ").append(toIndentedString(carSpaces)).append("\n");
    sb.append("    isCalculatedLandArea: ").append(toIndentedString(isCalculatedLandArea)).append("\n");
    sb.append("    landArea: ").append(toIndentedString(landArea)).append("\n");
    sb.append("    lockUpGarages: ").append(toIndentedString(lockUpGarages)).append("\n");
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

