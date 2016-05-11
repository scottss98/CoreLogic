package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AddressMatchResponseDetail;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class AddressMatchResponse   {
  
  private AddressMatchResponseDetail matchDetails = null;

  /**
   * Contains the details relevant to the match that includes the match rule, type, property Id, etc.
   **/
  public AddressMatchResponse matchDetails(AddressMatchResponseDetail matchDetails) {
    this.matchDetails = matchDetails;
    return this;
  }

  
  @ApiModelProperty(value = "Contains the details relevant to the match that includes the match rule, type, property Id, etc.")
  @JsonProperty("matchDetails")
  public AddressMatchResponseDetail getMatchDetails() {
    return matchDetails;
  }
  public void setMatchDetails(AddressMatchResponseDetail matchDetails) {
    this.matchDetails = matchDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressMatchResponse addressMatchResponse = (AddressMatchResponse) o;
    return Objects.equals(matchDetails, addressMatchResponse.matchDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressMatchResponse {\n");
    
    sb.append("    matchDetails: ").append(toIndentedString(matchDetails)).append("\n");
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

