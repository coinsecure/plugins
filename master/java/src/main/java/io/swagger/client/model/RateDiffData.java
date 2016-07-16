package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * RateDiffData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class RateDiffData   {
  
  private Long rate = null;
  private Long difference = null;

  
  /**
   **/
  public RateDiffData rate(Long rate) {
    this.rate = rate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("rate")
  public Long getRate() {
    return rate;
  }
  public void setRate(Long rate) {
    this.rate = rate;
  }


  /**
   **/
  public RateDiffData difference(Long difference) {
    this.difference = difference;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("difference")
  public Long getDifference() {
    return difference;
  }
  public void setDifference(Long difference) {
    this.difference = difference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateDiffData rateDiffData = (RateDiffData) o;
    return Objects.equals(this.rate, rateDiffData.rate) &&
        Objects.equals(this.difference, rateDiffData.difference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rate, difference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateDiffData {\n");
    
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    difference: ").append(toIndentedString(difference)).append("\n");
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

