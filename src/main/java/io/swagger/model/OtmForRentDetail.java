package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class OtmForRentDetail   {
  
  private String agency = null;
  private String agent = null;
  private Date date = null;
  private Boolean isActiveCampaign = null;
  private String period = null;
  private Integer price = null;
  private String priceDescription = null;

  /**
   * The current or last agency advertising the property for sale.
   **/
  public OtmForRentDetail agency(String agency) {
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
  public OtmForRentDetail agent(String agent) {
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
  public OtmForRentDetail date(Date date) {
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
  public OtmForRentDetail isActiveCampaign(Boolean isActiveCampaign) {
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
   * Filter on the period for the rental term. Accepted values are: 'D' = daily, 'W' = weekly (most common), 'F' = fortnightly, 'M' = monthly, 'Q' = quarterly, 'A' = annual
   **/
  public OtmForRentDetail period(String period) {
    this.period = period;
    return this;
  }

  
  @ApiModelProperty(value = "Filter on the period for the rental term. Accepted values are: 'D' = daily, 'W' = weekly (most common), 'F' = fortnightly, 'M' = monthly, 'Q' = quarterly, 'A' = annual")
  @JsonProperty("period")
  public String getPeriod() {
    return period;
  }
  public void setPeriod(String period) {
    this.period = period;
  }

  /**
   * The latest/last advertisement price that the property was listed at in the for rent campaign.
   **/
  public OtmForRentDetail price(Integer price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "The latest/last advertisement price that the property was listed at in the for rent campaign.")
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  /**
   * The latest/last price description that the property was listed at in the campaign.Sometimes an actual price is not used but a description such as P.O.A or Offers over
   **/
  public OtmForRentDetail priceDescription(String priceDescription) {
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
    OtmForRentDetail otmForRentDetail = (OtmForRentDetail) o;
    return Objects.equals(agency, otmForRentDetail.agency) &&
        Objects.equals(agent, otmForRentDetail.agent) &&
        Objects.equals(date, otmForRentDetail.date) &&
        Objects.equals(isActiveCampaign, otmForRentDetail.isActiveCampaign) &&
        Objects.equals(period, otmForRentDetail.period) &&
        Objects.equals(price, otmForRentDetail.price) &&
        Objects.equals(priceDescription, otmForRentDetail.priceDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agency, agent, date, isActiveCampaign, period, price, priceDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtmForRentDetail {\n");
    
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    isActiveCampaign: ").append(toIndentedString(isActiveCampaign)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

