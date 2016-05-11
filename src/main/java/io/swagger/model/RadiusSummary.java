package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class RadiusSummary   {
  
  private String distanceFromPoint = null;

  /**
   * The property's distance from the centre point (lat/lon) in kilometres (km).
   **/
  public RadiusSummary distanceFromPoint(String distanceFromPoint) {
    this.distanceFromPoint = distanceFromPoint;
    return this;
  }

  
  @ApiModelProperty(value = "The property's distance from the centre point (lat/lon) in kilometres (km).")
  @JsonProperty("distanceFromPoint")
  public String getDistanceFromPoint() {
    return distanceFromPoint;
  }
  public void setDistanceFromPoint(String distanceFromPoint) {
    this.distanceFromPoint = distanceFromPoint;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RadiusSummary radiusSummary = (RadiusSummary) o;
    return Objects.equals(distanceFromPoint, radiusSummary.distanceFromPoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(distanceFromPoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RadiusSummary {\n");
    
    sb.append("    distanceFromPoint: ").append(toIndentedString(distanceFromPoint)).append("\n");
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

