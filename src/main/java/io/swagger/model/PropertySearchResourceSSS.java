package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertySummary;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PropertySearchResourceSSS   {
  
  private PropertySummary propertySummary = null;

  /**
   * Contains the basic details of the property.
   **/
  public PropertySearchResourceSSS propertySummary(PropertySummary propertySummary) {
    this.propertySummary = propertySummary;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the basic details of the property.")
  @JsonProperty("propertySummary")
  public PropertySummary getPropertySummary() {
    return propertySummary;
  }
  public void setPropertySummary(PropertySummary propertySummary) {
    this.propertySummary = propertySummary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertySearchResourceSSS propertySearchResourceSSS = (PropertySearchResourceSSS) o;
    return Objects.equals(propertySummary, propertySearchResourceSSS.propertySummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertySummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertySearchResourceSSS {\n");
    
    sb.append("    propertySummary: ").append(toIndentedString(propertySummary)).append("\n");
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

