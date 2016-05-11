package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class Address   {
  
  private String singleLineAddress = null;

  /**
   * The property's single line address.
   **/
  public Address singleLineAddress(String singleLineAddress) {
    this.singleLineAddress = singleLineAddress;
    return this;
  }

  
  @ApiModelProperty(value = "The property's single line address.")
  @JsonProperty("singleLineAddress")
  public String getSingleLineAddress() {
    return singleLineAddress;
  }
  public void setSingleLineAddress(String singleLineAddress) {
    this.singleLineAddress = singleLineAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(singleLineAddress, address.singleLineAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(singleLineAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    singleLineAddress: ").append(toIndentedString(singleLineAddress)).append("\n");
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

