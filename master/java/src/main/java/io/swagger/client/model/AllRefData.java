package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * AllRefData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class AllRefData   {
  
  private Double refPercent = null;
  private Long time = null;
  private String refID = null;

  
  /**
   **/
  public AllRefData refPercent(Double refPercent) {
    this.refPercent = refPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refPercent")
  public Double getRefPercent() {
    return refPercent;
  }
  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }


  /**
   **/
  public AllRefData time(Long time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  /**
   **/
  public AllRefData refID(String refID) {
    this.refID = refID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refID")
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllRefData allRefData = (AllRefData) o;
    return Objects.equals(this.refPercent, allRefData.refPercent) &&
        Objects.equals(this.time, allRefData.time) &&
        Objects.equals(this.refID, allRefData.refID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPercent, time, refID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllRefData {\n");
    
    sb.append("    refPercent: ").append(toIndentedString(refPercent)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    refID: ").append(toIndentedString(refID)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

