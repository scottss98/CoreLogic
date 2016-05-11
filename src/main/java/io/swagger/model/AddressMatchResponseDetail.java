package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class AddressMatchResponseDetail   {
  
  private String matchRule = null;
  private String matchType = null;
  private Long propertyId = null;
  private String updateDetail = null;
  private String updateIndicator = null;

  /**
   * The rule of the resulting match and is a more detailed view of the matchType that can be used to identify the match. For more details, please see the [Address Matcher guide](/address_matcher).
   **/
  public AddressMatchResponseDetail matchRule(String matchRule) {
    this.matchRule = matchRule;
    return this;
  }

  
  @ApiModelProperty(value = "The rule of the resulting match and is a more detailed view of the matchType that can be used to identify the match. For more details, please see the [Address Matcher guide](/address_matcher).")
  @JsonProperty("matchRule")
  public String getMatchRule() {
    return matchRule;
  }
  public void setMatchRule(String matchRule) {
    this.matchRule = matchRule;
  }

  /**
   * Details of the resulting match type and only returned when a successful match is returned.For more details, please see the [Address Matcher guide](/address_matcher).
   **/
  public AddressMatchResponseDetail matchType(String matchType) {
    this.matchType = matchType;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the resulting match type and only returned when a successful match is returned.For more details, please see the [Address Matcher guide](/address_matcher).")
  @JsonProperty("matchType")
  public String getMatchType() {
    return matchType;
  }
  public void setMatchType(String matchType) {
    this.matchType = matchType;
  }

  /**
   * Unique identifier of the matched property. If a match cannot be found, then this will not be returned.
   **/
  public AddressMatchResponseDetail propertyId(Long propertyId) {
    this.propertyId = propertyId;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the matched property. If a match cannot be found, then this will not be returned.")
  @JsonProperty("propertyId")
  public Long getPropertyId() {
    return propertyId;
  }
  public void setPropertyId(Long propertyId) {
    this.propertyId = propertyId;
  }

  /**
   * Indicates the detail code(s) that was applied when modifying the input string. When multiple changes are made to the input string, the codes are concatenated. For example, code 1322 means that rule codes 13 and 22 were applied to the string. For more details on the detail code(s), please see the [Address Matcher guide](/address_matcher).
   **/
  public AddressMatchResponseDetail updateDetail(String updateDetail) {
    this.updateDetail = updateDetail;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates the detail code(s) that was applied when modifying the input string. When multiple changes are made to the input string, the codes are concatenated. For example, code 1322 means that rule codes 13 and 22 were applied to the string. For more details on the detail code(s), please see the [Address Matcher guide](/address_matcher).")
  @JsonProperty("updateDetail")
  public String getUpdateDetail() {
    return updateDetail;
  }
  public void setUpdateDetail(String updateDetail) {
    this.updateDetail = updateDetail;
  }

  /**
   * Identifies whether the original input string has been altered by data cleansing (formatting, updating address with missing elements, etc.). While the cleansing is designed to improve match rates, the updateIndicator will clearly indicate if the input string was modified. Available values are: *O: Original string, so no significant changes were made; *U:Updated, so the string was modified.
   **/
  public AddressMatchResponseDetail updateIndicator(String updateIndicator) {
    this.updateIndicator = updateIndicator;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies whether the original input string has been altered by data cleansing (formatting, updating address with missing elements, etc.). While the cleansing is designed to improve match rates, the updateIndicator will clearly indicate if the input string was modified. Available values are: *O: Original string, so no significant changes were made; *U:Updated, so the string was modified.")
  @JsonProperty("updateIndicator")
  public String getUpdateIndicator() {
    return updateIndicator;
  }
  public void setUpdateIndicator(String updateIndicator) {
    this.updateIndicator = updateIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressMatchResponseDetail addressMatchResponseDetail = (AddressMatchResponseDetail) o;
    return Objects.equals(matchRule, addressMatchResponseDetail.matchRule) &&
        Objects.equals(matchType, addressMatchResponseDetail.matchType) &&
        Objects.equals(propertyId, addressMatchResponseDetail.propertyId) &&
        Objects.equals(updateDetail, addressMatchResponseDetail.updateDetail) &&
        Objects.equals(updateIndicator, addressMatchResponseDetail.updateIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchRule, matchType, propertyId, updateDetail, updateIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressMatchResponseDetail {\n");
    
    sb.append("    matchRule: ").append(toIndentedString(matchRule)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    propertyId: ").append(toIndentedString(propertyId)).append("\n");
    sb.append("    updateDetail: ").append(toIndentedString(updateDetail)).append("\n");
    sb.append("    updateIndicator: ").append(toIndentedString(updateIndicator)).append("\n");
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

