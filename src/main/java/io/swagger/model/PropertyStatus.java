package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class PropertyStatus   {
  
  private Boolean otmForRent = null;
  private Boolean otmForSale = null;
  private Boolean recentSale = null;

  /**
   * Identifies if a property is currently listed on the market (otm) for rent. A property is flagged as a being on the market for rent if CoreLogic has received notification of a rental campaign within the past 30 days.
   **/
  public PropertyStatus otmForRent(Boolean otmForRent) {
    this.otmForRent = otmForRent;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies if a property is currently listed on the market (otm) for rent. A property is flagged as a being on the market for rent if CoreLogic has received notification of a rental campaign within the past 30 days.")
  @JsonProperty("otmForRent")
  public Boolean getOtmForRent() {
    return otmForRent;
  }
  public void setOtmForRent(Boolean otmForRent) {
    this.otmForRent = otmForRent;
  }

  /**
   * Identifies if a property is currently listed on the market (otm) for sale. A property is flagged as being on the market (otm) if CoreLogic has not received notification of a sale 30 days prior to the first ad date received or if an ad has been received in the last 6 months and no sale in that time.
   **/
  public PropertyStatus otmForSale(Boolean otmForSale) {
    this.otmForSale = otmForSale;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies if a property is currently listed on the market (otm) for sale. A property is flagged as being on the market (otm) if CoreLogic has not received notification of a sale 30 days prior to the first ad date received or if an ad has been received in the last 6 months and no sale in that time.")
  @JsonProperty("otmForSale")
  public Boolean getOtmForSale() {
    return otmForSale;
  }
  public void setOtmForSale(Boolean otmForSale) {
    this.otmForSale = otmForSale;
  }

  /**
   * Identifies if a property is a recent sale. A property is flagged as a recent sale if CoreLogic has received notification of a sale within the past 60 days.
   **/
  public PropertyStatus recentSale(Boolean recentSale) {
    this.recentSale = recentSale;
    return this;
  }

  
  @ApiModelProperty(value = "Identifies if a property is a recent sale. A property is flagged as a recent sale if CoreLogic has received notification of a sale within the past 60 days.")
  @JsonProperty("recentSale")
  public Boolean getRecentSale() {
    return recentSale;
  }
  public void setRecentSale(Boolean recentSale) {
    this.recentSale = recentSale;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyStatus propertyStatus = (PropertyStatus) o;
    return Objects.equals(otmForRent, propertyStatus.otmForRent) &&
        Objects.equals(otmForSale, propertyStatus.otmForSale) &&
        Objects.equals(recentSale, propertyStatus.recentSale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otmForRent, otmForSale, recentSale);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyStatus {\n");
    
    sb.append("    otmForRent: ").append(toIndentedString(otmForRent)).append("\n");
    sb.append("    otmForSale: ").append(toIndentedString(otmForSale)).append("\n");
    sb.append("    recentSale: ").append(toIndentedString(recentSale)).append("\n");
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

