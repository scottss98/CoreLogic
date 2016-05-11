package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import io.swagger.model.OtmForRentSearchResource;
import io.swagger.model.PageMetadata;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PagedResourcesOfOtmForRentSearchResource   {
  
  private List<OtmForRentSearchResource> embedded = new ArrayList<OtmForRentSearchResource>();
  private List<Link> links = new ArrayList<Link>();
  private PageMetadata page = null;

  /**
   **/
  public PagedResourcesOfOtmForRentSearchResource embedded(List<OtmForRentSearchResource> embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public List<OtmForRentSearchResource> getEmbedded() {
    return embedded;
  }
  public void setEmbedded(List<OtmForRentSearchResource> embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  public PagedResourcesOfOtmForRentSearchResource links(List<Link> links) {
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
  public PagedResourcesOfOtmForRentSearchResource page(PageMetadata page) {
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
    PagedResourcesOfOtmForRentSearchResource pagedResourcesOfOtmForRentSearchResource = (PagedResourcesOfOtmForRentSearchResource) o;
    return Objects.equals(embedded, pagedResourcesOfOtmForRentSearchResource.embedded) &&
        Objects.equals(links, pagedResourcesOfOtmForRentSearchResource.links) &&
        Objects.equals(page, pagedResourcesOfOtmForRentSearchResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfOtmForRentSearchResource {\n");
    
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

