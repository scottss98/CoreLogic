package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.EmbeddedSSS;
import io.swagger.model.LinkSSS;
import io.swagger.model.PageMetadata;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:46:00.573+10:00")
public class PagedResourcesOfPropertySearchResource   {
  
  private EmbeddedSSS embedded = null;
  private LinkSSS links = null;
  private PageMetadata page = null;

  /**
   **/
  public PagedResourcesOfPropertySearchResource embedded(EmbeddedSSS embedded) {
    this.embedded = embedded;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_embedded")
  public EmbeddedSSS getEmbedded() {
    return embedded;
  }
  public void setEmbedded(EmbeddedSSS embedded) {
    this.embedded = embedded;
  }

  /**
   **/
  public PagedResourcesOfPropertySearchResource links(LinkSSS links) {
    this.links = links;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("_links")
  public LinkSSS getLinks() {
    return links;
  }
  public void setLinks(LinkSSS links) {
    this.links = links;
  }

  /**
   **/
  public PagedResourcesOfPropertySearchResource page(PageMetadata page) {
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
    PagedResourcesOfPropertySearchResource pagedResourcesOfPropertySearchResource = (PagedResourcesOfPropertySearchResource) o;
    return Objects.equals(embedded, pagedResourcesOfPropertySearchResource.embedded) &&
        Objects.equals(links, pagedResourcesOfPropertySearchResource.links) &&
        Objects.equals(page, pagedResourcesOfPropertySearchResource.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, links, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResourcesOfPropertySearchResource {\n");
    
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

