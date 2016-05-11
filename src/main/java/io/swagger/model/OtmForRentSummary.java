package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import io.swagger.model.Attributes;
import io.swagger.model.Coordinate;
import io.swagger.model.LocationIdentifiers;
import io.swagger.model.OtmForRentDetail;
import io.swagger.model.PropertyPhoto;
import io.swagger.model.PropertyStatus;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class OtmForRentSummary   {
  
  private Address address = null;
  private Attributes attributes = null;
  private Coordinate coordinate = null;
  private Long id = null;
  private LocationIdentifiers locationIdentifiers = null;
  private OtmForRentDetail otmForRentDetail = null;
  private PropertyPhoto propertyPhoto = null;
  private PropertyStatus propertyStatus = null;
  private String propertySubType = null;
  private String propertySubTypeShort = null;
  private String propertyType = null;

  /**
   * Details of the property's address.
   **/
  public OtmForRentSummary address(Address address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's address.")
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }

  /**
   * Details of the property's basic attributes.
   **/
  public OtmForRentSummary attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's basic attributes.")
  @JsonProperty("attributes")
  public Attributes getAttributes() {
    return attributes;
  }
  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Details of the property's geo coordinates (latitude, longitude).
   **/
  public OtmForRentSummary coordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's geo coordinates (latitude, longitude).")
  @JsonProperty("coordinate")
  public Coordinate getCoordinate() {
    return coordinate;
  }
  public void setCoordinate(Coordinate coordinate) {
    this.coordinate = coordinate;
  }

  /**
   * The unique identifier of the property.
   **/
  public OtmForRentSummary id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "The unique identifier of the property.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Details of the unique location Ids that relate to the property's location.
   **/
  public OtmForRentSummary locationIdentifiers(LocationIdentifiers locationIdentifiers) {
    this.locationIdentifiers = locationIdentifiers;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the unique location Ids that relate to the property's location.")
  @JsonProperty("locationIdentifiers")
  public LocationIdentifiers getLocationIdentifiers() {
    return locationIdentifiers;
  }
  public void setLocationIdentifiers(LocationIdentifiers locationIdentifiers) {
    this.locationIdentifiers = locationIdentifiers;
  }

  /**
   * Details of the property's latest advertisement record, as observed by CoreLogic
   **/
  public OtmForRentSummary otmForRentDetail(OtmForRentDetail otmForRentDetail) {
    this.otmForRentDetail = otmForRentDetail;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's latest advertisement record, as observed by CoreLogic")
  @JsonProperty("otmForRentDetail")
  public OtmForRentDetail getOtmForRentDetail() {
    return otmForRentDetail;
  }
  public void setOtmForRentDetail(OtmForRentDetail otmForRentDetail) {
    this.otmForRentDetail = otmForRentDetail;
  }

  /**
   * Details of the property's primary photo provided as numerous URLs varying in size.
   **/
  public OtmForRentSummary propertyPhoto(PropertyPhoto propertyPhoto) {
    this.propertyPhoto = propertyPhoto;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's primary photo provided as numerous URLs varying in size.")
  @JsonProperty("propertyPhoto")
  public PropertyPhoto getPropertyPhoto() {
    return propertyPhoto;
  }
  public void setPropertyPhoto(PropertyPhoto propertyPhoto) {
    this.propertyPhoto = propertyPhoto;
  }

  /**
   * Details of the property's current status, as observed by CoreLogic.
   **/
  public OtmForRentSummary propertyStatus(PropertyStatus propertyStatus) {
    this.propertyStatus = propertyStatus;
    return this;
  }

  
  @ApiModelProperty(value = "Details of the property's current status, as observed by CoreLogic.")
  @JsonProperty("propertyStatus")
  public PropertyStatus getPropertyStatus() {
    return propertyStatus;
  }
  public void setPropertyStatus(PropertyStatus propertyStatus) {
    this.propertyStatus = propertyStatus;
  }

  /**
   * The sub type of the property, which can offer additional info to that of propertyType.
   **/
  public OtmForRentSummary propertySubType(String propertySubType) {
    this.propertySubType = propertySubType;
    return this;
  }

  
  @ApiModelProperty(value = "The sub type of the property, which can offer additional info to that of propertyType.")
  @JsonProperty("propertySubType")
  public String getPropertySubType() {
    return propertySubType;
  }
  public void setPropertySubType(String propertySubType) {
    this.propertySubType = propertySubType;
  }

  /**
   * The short sub type of the property. This corresponds to the propertyType and provides a more descriptive indication of the property type.
   **/
  public OtmForRentSummary propertySubTypeShort(String propertySubTypeShort) {
    this.propertySubTypeShort = propertySubTypeShort;
    return this;
  }

  
  @ApiModelProperty(value = "The short sub type of the property. This corresponds to the propertyType and provides a more descriptive indication of the property type.")
  @JsonProperty("propertySubTypeShort")
  public String getPropertySubTypeShort() {
    return propertySubTypeShort;
  }
  public void setPropertySubTypeShort(String propertySubTypeShort) {
    this.propertySubTypeShort = propertySubTypeShort;
  }

  /**
   * The type of the property (e.g.: HOUSE, UNIT, etc.)
   **/
  public OtmForRentSummary propertyType(String propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  
  @ApiModelProperty(value = "The type of the property (e.g.: HOUSE, UNIT, etc.)")
  @JsonProperty("propertyType")
  public String getPropertyType() {
    return propertyType;
  }
  public void setPropertyType(String propertyType) {
    this.propertyType = propertyType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtmForRentSummary otmForRentSummary = (OtmForRentSummary) o;
    return Objects.equals(address, otmForRentSummary.address) &&
        Objects.equals(attributes, otmForRentSummary.attributes) &&
        Objects.equals(coordinate, otmForRentSummary.coordinate) &&
        Objects.equals(id, otmForRentSummary.id) &&
        Objects.equals(locationIdentifiers, otmForRentSummary.locationIdentifiers) &&
        Objects.equals(otmForRentDetail, otmForRentSummary.otmForRentDetail) &&
        Objects.equals(propertyPhoto, otmForRentSummary.propertyPhoto) &&
        Objects.equals(propertyStatus, otmForRentSummary.propertyStatus) &&
        Objects.equals(propertySubType, otmForRentSummary.propertySubType) &&
        Objects.equals(propertySubTypeShort, otmForRentSummary.propertySubTypeShort) &&
        Objects.equals(propertyType, otmForRentSummary.propertyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, attributes, coordinate, id, locationIdentifiers, otmForRentDetail, propertyPhoto, propertyStatus, propertySubType, propertySubTypeShort, propertyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtmForRentSummary {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    coordinate: ").append(toIndentedString(coordinate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locationIdentifiers: ").append(toIndentedString(locationIdentifiers)).append("\n");
    sb.append("    otmForRentDetail: ").append(toIndentedString(otmForRentDetail)).append("\n");
    sb.append("    propertyPhoto: ").append(toIndentedString(propertyPhoto)).append("\n");
    sb.append("    propertyStatus: ").append(toIndentedString(propertyStatus)).append("\n");
    sb.append("    propertySubType: ").append(toIndentedString(propertySubType)).append("\n");
    sb.append("    propertySubTypeShort: ").append(toIndentedString(propertySubTypeShort)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
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

