package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import io.swagger.model.OtmForRentRadiusSummary;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class OtmForRentRadiusSearchResource   {
  
  private List<Link> links = new ArrayList<Link>();
  private OtmForRentRadiusSummary propertySummary = null;

  /**
   * Returns a list of relative pagination links. 'first'= The first page. 'self' = The current page. 'next' = The next page. 'last' = The last page.
   **/
  public OtmForRentRadiusSearchResource links(List<Link> links) {
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
   * Contains the basic details of the property including information on its latest advertisement record, as observed by CoreLogic.
   **/
  public OtmForRentRadiusSearchResource propertySummary(OtmForRentRadiusSummary propertySummary) {
    this.propertySummary = propertySummary;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the basic details of the property including information on its latest advertisement record, as observed by CoreLogic.")
  @JsonProperty("propertySummary")
  public OtmForRentRadiusSummary getPropertySummary() {
    return propertySummary;
  }
  public void setPropertySummary(OtmForRentRadiusSummary propertySummary) {
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
    OtmForRentRadiusSearchResource otmForRentRadiusSearchResource = (OtmForRentRadiusSearchResource) o;
    return Objects.equals(links, otmForRentRadiusSearchResource.links) &&
        Objects.equals(propertySummary, otmForRentRadiusSearchResource.propertySummary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, propertySummary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtmForRentRadiusSearchResource {\n");
    
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

