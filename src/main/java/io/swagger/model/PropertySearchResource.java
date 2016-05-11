package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import io.swagger.model.PropertySummary;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PropertySearchResource   {
  
  private List<Link> links = new ArrayList<Link>();
  private PropertySummary propertySummary = null;

  /**
   * Returns a list of relative pagination links. 'first'= The first page. 'self' = The current page. 'next' = The next page. 'last' = The last page.
   **/
  public PropertySearchResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "Returns a list of relative pagination links. 'first'= The first page. 'self' = The current page. 'next' = The next page. 'last' = The last page.")
  @JsonProperty("_links")
  public List<Link> getLinks() {
    return links;
  }
  public void setLinks(List<Link> links) {
    this.links = links;
  }

  /**
   * Contains the basic details of the property.
   **/
  public PropertySearchResource propertySummary(PropertySummary propertySummary) {
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
    PropertySearchResource propertySearchResource = (PropertySearchResource) o;
    return Objects.equals(links, propertySearchResource.links) &&
        Objects.equals(propertySummary, propertySearchResource.propertySummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, propertySummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertySearchResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

