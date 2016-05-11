package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PageMetadata   {
  
  private Long number = null;
  private Long size = null;
  private Long totalElements = null;
  private Long totalPages = null;

  /**
   **/
  public PageMetadata number(Long number) {
    this.number = number;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("number")
  public Long getNumber() {
    return number;
  }
  public void setNumber(Long number) {
    this.number = number;
  }

  /**
   **/
  public PageMetadata size(Long size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  /**
   **/
  public PageMetadata totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalElements")
  public Long getTotalElements() {
    return totalElements;
  }
  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  /**
   **/
  public PageMetadata totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("totalPages")
  public Long getTotalPages() {
    return totalPages;
  }
  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageMetadata pageMetadata = (PageMetadata) o;
    return Objects.equals(number, pageMetadata.number) &&
        Objects.equals(size, pageMetadata.size) &&
        Objects.equals(totalElements, pageMetadata.totalElements) &&
        Objects.equals(totalPages, pageMetadata.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, size, totalElements, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageMetadata {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

