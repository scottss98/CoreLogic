package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import io.swagger.model.OtmForRentRadiusSearchResource;
import io.swagger.model.PageMetadata;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PagedResourcesOfOtmForRentRadiusSearchResource   {
  
  private List<OtmForRentRadiusSearchResource> embedded = new ArrayList<OtmForRentRadiusSearchResource>();
  private List<Link> links = new ArrayList<Link>();
  private PageMetadata page = null;

  /**
   **/
  public PagedResourcesOfOtmForRentRadiusSearchResource embedded(List<OtmForRentRadiusSearchResource> embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public List<OtmForRentRadiusSearchResource> getEmbedded() {
    return embedded;
  }
  public void setEmbedded(List<OtmForRentRadiusSearchResource> embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  public PagedResourcesOfOtmForRentRadiusSearchResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public List<Link> getLinks() {
    return links;
  }
  public void setLinks(List<Link> links) {
    this.links = links;
  }

  /**
   **/
  public PagedResourcesOfOtmForRentRadiusSearchResource page(PageMetadata page) {
    this.page = page;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("page")
  public PageMetadata getPage() {
    return page;
  }
  public void setPage(PageMetadata page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResourcesOfOtmForRentRadiusSearchResource pagedResourcesOfOtmForRentRadiusSearchResource = (PagedResourcesOfOtmForRentRadiusSearchResource) o;
    return Objects.equals(embedded, pagedResourcesOfOtmForRentRadiusSearchResource.embedded) &&
        Objects.equals(links, pagedResourcesOfOtmForRentRadiusSearchResource.links) &&
        Objects.equals(page, pagedResourcesOfOtmForRentRadiusSearchResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfOtmForRentRadiusSearchResource {\n");
    
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

