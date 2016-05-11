package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class LocationIdentifiers   {
  
  private Long localityId = null;
  private Long postCodeId = null;
  private Long streetId = null;

  /**
   * The unique identifier of the locality (suburb) in which the property is located.
   **/
  public LocationIdentifiers localityId(Long localityId) {
    this.localityId = localityId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique identifier of the locality (suburb) in which the property is located.")
  @JsonProperty("localityId")
  public Long getLocalityId() {
    return localityId;
  }
  public void setLocalityId(Long localityId) {
    this.localityId = localityId;
  }

  /**
   * The unique identifier of the postcode in which the property is located.
   **/
  public LocationIdentifiers postCodeId(Long postCodeId) {
    this.postCodeId = postCodeId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique identifier of the postcode in which the property is located.")
  @JsonProperty("postCodeId")
  public Long getPostCodeId() {
    return postCodeId;
  }
  public void setPostCodeId(Long postCodeId) {
    this.postCodeId = postCodeId;
  }

  /**
   * The unique identifier of the street on which the property is located.
   **/
  public LocationIdentifiers streetId(Long streetId) {
    this.streetId = streetId;
    return this;
  }

  
  @ApiModelProperty(value = "The unique identifier of the street on which the property is located.")
  @JsonProperty("streetId")
  public Long getStreetId() {
    return streetId;
  }
  public void setStreetId(Long streetId) {
    this.streetId = streetId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationIdentifiers locationIdentifiers = (LocationIdentifiers) o;
    return Objects.equals(localityId, locationIdentifiers.localityId) &&
        Objects.equals(postCodeId, locationIdentifiers.postCodeId) &&
        Objects.equals(streetId, locationIdentifiers.streetId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(localityId, postCodeId, streetId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationIdentifiers {\n");
    
    sb.append("    localityId: ").append(toIndentedString(localityId)).append("\n");
    sb.append("    postCodeId: ").append(toIndentedString(postCodeId)).append("\n");
    sb.append("    streetId: ").append(toIndentedString(streetId)).append("\n");
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

