package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class LastSaleDetail   {
  
  private String agency = null;
  private String agent = null;
  private Date contractDate = null;
  private Boolean isAgentsAdvice = null;
  private Boolean isArmsLength = null;
  private Integer price = null;
  private Date settlementDate = null;
  private String type = null;

  /**
   * Details of the agency who sold the property.
   **/
  public LastSaleDetail agency(String agency) {
    this.agency = agency;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the agency who sold the property.")
  @JsonProperty("agency")
  public String getAgency() {
    return agency;
  }
  public void setAgency(String agency) {
    this.agency = agency;
  }

  /**
   * Details of the agent who sold the property.
   **/
  public LastSaleDetail agent(String agent) {
    this.agent = agent;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the agent who sold the property.")
  @JsonProperty("agent")
  public String getAgent() {
    return agent;
  }
  public void setAgent(String agent) {
    this.agent = agent;
  }

  /**
   * Refers to the sale date of the property (not the settlement date) in format YYYY-MM-DD.Sales within the Sales History List are sorted descending by contractDate.
   **/
  public LastSaleDetail contractDate(Date contractDate) {
    this.contractDate = contractDate;
    return this;
  }

  
  @ApiModelProperty(value = "Refers to the sale date of the property (not the settlement date) in format YYYY-MM-DD.Sales within the Sales History List are sorted descending by contractDate.")
  @JsonProperty("contractDate")
  public Date getContractDate() {
    return contractDate;
  }
  public void setContractDate(Date contractDate) {
    this.contractDate = contractDate;
  }

  /**
   * The complete price that the property sold for as reported by Agents Advice or the Valuer General.
   **/
  public LastSaleDetail isAgentsAdvice(Boolean isAgentsAdvice) {
    this.isAgentsAdvice = isAgentsAdvice;
    return this;
  }

  
  @ApiModelProperty(value = "The complete price that the property sold for as reported by Agents Advice or the Valuer General.")
  @JsonProperty("isAgentsAdvice")
  public Boolean getIsAgentsAdvice() {
    return isAgentsAdvice;
  }
  public void setIsAgentsAdvice(Boolean isAgentsAdvice) {
    this.isAgentsAdvice = isAgentsAdvice;
  }

  /**
   * Indicates if the property transfer was made at arms length, meaning that there may be a relationship between the buyer and vendor.True = does not appear to be a relationship between the buyer and vendor;False = may be a relationship between the buyer and vendor.Note, this value will only exist for Valuer General records (isAgentsAdvice=false).
   **/
  public LastSaleDetail isArmsLength(Boolean isArmsLength) {
    this.isArmsLength = isArmsLength;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates if the property transfer was made at arms length, meaning that there may be a relationship between the buyer and vendor.True = does not appear to be a relationship between the buyer and vendor;False = may be a relationship between the buyer and vendor.Note, this value will only exist for Valuer General records (isAgentsAdvice=false).")
  @JsonProperty("isArmsLength")
  public Boolean getIsArmsLength() {
    return isArmsLength;
  }
  public void setIsArmsLength(Boolean isArmsLength) {
    this.isArmsLength = isArmsLength;
  }

  /**
   * The complete price that the property sold for as reported by Agents Advice or the Valuer General.
   **/
  public LastSaleDetail price(Integer price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(value = "The complete price that the property sold for as reported by Agents Advice or the Valuer General.")
  @JsonProperty("price")
  public Integer getPrice() {
    return price;
  }
  public void setPrice(Integer price) {
    this.price = price;
  }

  /**
   * Refers to the settlement date of the property (not the contract date) in format YYYY-MM-DD.
   **/
  public LastSaleDetail settlementDate(Date settlementDate) {
    this.settlementDate = settlementDate;
    return this;
  }

  
  @ApiModelProperty(value = "Refers to the settlement date of the property (not the contract date) in format YYYY-MM-DD.")
  @JsonProperty("settlementDate")
  public Date getSettlementDate() {
    return settlementDate;
  }
  public void setSettlementDate(Date settlementDate) {
    this.settlementDate = settlementDate;
  }

  /**
   * Refers to the type of sale as notified by the Valuer General (e.g.: Part Sale, Normal Sale, etc.).
   **/
  public LastSaleDetail type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "Refers to the type of sale as notified by the Valuer General (e.g.: Part Sale, Normal Sale, etc.).")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastSaleDetail lastSaleDetail = (LastSaleDetail) o;
    return Objects.equals(agency, lastSaleDetail.agency) &&
        Objects.equals(agent, lastSaleDetail.agent) &&
        Objects.equals(contractDate, lastSaleDetail.contractDate) &&
        Objects.equals(isAgentsAdvice, lastSaleDetail.isAgentsAdvice) &&
        Objects.equals(isArmsLength, lastSaleDetail.isArmsLength) &&
        Objects.equals(price, lastSaleDetail.price) &&
        Objects.equals(settlementDate, lastSaleDetail.settlementDate) &&
        Objects.equals(type, lastSaleDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agency, agent, contractDate, isAgentsAdvice, isArmsLength, price, settlementDate, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastSaleDetail {\n");
    
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    agent: ").append(toIndentedString(agent)).append("\n");
    sb.append("    contractDate: ").append(toIndentedString(contractDate)).append("\n");
    sb.append("    isAgentsAdvice: ").append(toIndentedString(isAgentsAdvice)).append("\n");
    sb.append("    isArmsLength: ").append(toIndentedString(isArmsLength)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    settlementDate: ").append(toIndentedString(settlementDate)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

