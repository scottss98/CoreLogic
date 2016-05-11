package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PropertySearchResourceSSS;
import java.util.ArrayList;
import java.util.List;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2016-05-11T14:00:07.773+10:00")
public class EmbeddedSSS   {
  
  private List<PropertySearchResourceSSS> propertySummaryList = new ArrayList<PropertySearchResourceSSS>();

  /**
   **/
  public EmbeddedSSS propertySummaryList(List<PropertySearchResourceSSS> propertySummaryList) {
    this.propertySummaryList = propertySummaryList;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("propertySummaryList")
  public List<PropertySearchResourceSSS> getPropertySummaryList() {
    return propertySummaryList;
  }
  public void setPropertySummaryList(List<PropertySearchResourceSSS> propertySummaryList) {
    this.propertySummaryList = propertySummaryList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedSSS embeddedSSS = (EmbeddedSSS) o;
    return Objects.equals(propertySummaryList, embeddedSSS.propertySummaryList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertySummaryList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedSSS {\n");
    
    sb.append("    propertySummaryList: ").append(toIndentedString(propertySummaryList)).append("\n");
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

