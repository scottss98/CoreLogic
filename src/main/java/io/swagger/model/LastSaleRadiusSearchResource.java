package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.LastSaleRadiusSummary;
import io.swagger.model.Link;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class LastSaleRadiusSearchResource   {
  
  private List<Link> links = new ArrayList<Link>();
  private LastSaleRadiusSummary propertySummary = null;

  /**
   * Returns a list of relative pagination links. 'first'= The first page. 'self' = The current page. 'next' = The next page. 'last' = The last page.
   **/
  public LastSaleRadiusSearchResource links(List<Link> links) {
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
   * Contains the basic details of the property including information on its latest sale.
   **/
  public LastSaleRadiusSearchResource propertySummary(LastSaleRadiusSummary propertySummary) {
    this.propertySummary = propertySummary;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the basic details of the property including information on its latest sale.")
  @JsonProperty("propertySummary")
  public LastSaleRadiusSummary getPropertySummary() {
    return propertySummary;
  }
  public void setPropertySummary(LastSaleRadiusSummary propertySummary) {
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
    LastSaleRadiusSearchResource lastSaleRadiusSearchResource = (LastSaleRadiusSearchResource) o;
    return Objects.equals(links, lastSaleRadiusSearchResource.links) &&
        Objects.equals(propertySummary, lastSaleRadiusSearchResource.propertySummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, propertySummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSaleRadiusSearchResource {\n");
    
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
