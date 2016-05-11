package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class OtmForSaleDetail   {
  
  private String agency = null;
  private String agent = null;
  private Date date = null;
  private Boolean isActiveCampaign = null;
  private String method = null;
  private String priceDescription = null;

  /**
   * The current or last agency advertising the property for sale.
   **/
  public OtmForSaleDetail agency(String agency) {
    this.agency = agency;
    return this;
  }

  
  @ApiModelProperty(value = "The current or last agency advertising the property for sale.")
  @JsonProperty("agency")
  public String getAgency() {
    return agency;
  }
  public void setAgency(String agency) {
    this.agency = agency;
  }

  /**
   * The current or last agent advertising the property for sale.
   **/
  public OtmForSaleDetail agent(String agent) {
    this.agent = agent;
    return this;
  }

  
  @ApiModelProperty(value = "The current or last agent advertising the property for sale.")
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

  /**
   * The publication date of the latest advertisement recorded in the campaign in format YYYY-MM-DD.
   **/
  public OtmForSaleDetail date(Date date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(value = "The publication date of the latest advertisement recorded in the campaign in format YYYY-MM-DD.")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  /**
   * Indicates if the campaign is considered 'Active', meaning there are no sales associated with it and we have observed a advertisement publication within the past 60 days.
   **/
  public OtmForSaleDetail isActiveCampaign(Boolean isActiveCampaign) {
    this.isActiveCampaign = isActiveCampaign;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if the campaign is considered 'Active', meaning there are no sales associated with it and we have observed a advertisement publication within the past 60 days.")
  @JsonProperty("isActiveCampaign")
  public Boolean getIsActiveCampaign() {
    return isActiveCampaign;
  }
  public void setIsActiveCampaign(Boolean isActiveCampaign) {
    this.isActiveCampaign = isActiveCampaign;
  }

  /**
   * The latest/last listing method for the property in for the for sale campaign and refers to the way the property is being sold.For example, these include 'Normal Sale', 'Auction', etc.
   **/
  public OtmForSaleDetail method(String method) {
    this.method = method;
    return this;
  }

  
  @ApiModelProperty(value = "The latest/last listing method for the property in for the for sale campaign and refers to the way the property is being sold.For example, these include 'Normal Sale', 'Auction', etc.")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   * The latest/last price description that the property was listed at in the campaign.Sometimes an actual price is not used but a description such as P.O.A or Offers over
   **/
  public OtmForSaleDetail priceDescription(String priceDescription) {
    this.priceDescription = priceDescription;
    return this;
  }

  
  @ApiModelProperty(value = "The latest/last price description that the property was listed at in the campaign.Sometimes an actual price is not used but a description such as P.O.A or Offers over")
  @JsonProperty("priceDescription")
  public String getPriceDescription() {
    return priceDescription;
  }
  public void setPriceDescription(String priceDescription) {
    this.priceDescription = priceDescription;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtmForSaleDetail otmForSaleDetail = (OtmForSaleDetail) o;
    return Objects.equals(agency, otmForSaleDetail.agency) &&
        Objects.equals(agent, otmForSaleDetail.agent) &&
        Objects.equals(date, otmForSaleDetail.date) &&
        Objects.equals(isActiveCampaign, otmForSaleDetail.isActiveCampaign) &&
        Objects.equals(method, otmForSaleDetail.method) &&
        Objects.equals(priceDescription, otmForSaleDetail.priceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agency, agent, date, isActiveCampaign, method, priceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtmForSaleDetail {\n");
    
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isActiveCampaign: ").append(toIndentedString(isActiveCampaign)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    priceDescription: ").append(toIndentedString(priceDescription)).append("\n");
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

