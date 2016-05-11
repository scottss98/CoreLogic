package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class LinkSSS   {
  
  private Link first = null;
  private Link self = null;
  private Link next = null;
  private Link last = null;

  /**
   **/
  public LinkSSS first(Link first) {
    this.first = first;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("first")
  public Link getFirst() {
    return first;
  }
  public void setFirst(Link first) {
    this.first = first;
  }

  /**
   **/
  public LinkSSS self(Link self) {
    this.self = self;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("self")
  public Link getSelf() {
    return self;
  }
  public void setSelf(Link self) {
    this.self = self;
  }

  /**
   **/
  public LinkSSS next(Link next) {
    this.next = next;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("next")
  public Link getNext() {
    return next;
  }
  public void setNext(Link next) {
    this.next = next;
  }

  /**
   **/
  public LinkSSS last(Link last) {
    this.last = last;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("last")
  public Link getLast() {
    return last;
  }
  public void setLast(Link last) {
    this.last = last;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkSSS linkSSS = (LinkSSS) o;
    return Objects.equals(first, linkSSS.first) &&
        Objects.equals(self, linkSSS.self) &&
        Objects.equals(next, linkSSS.next) &&
        Objects.equals(last, linkSSS.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(first, self, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSSS {\n");
    
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

