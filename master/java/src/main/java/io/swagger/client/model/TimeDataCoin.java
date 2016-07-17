package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TimeDataCoin
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class TimeDataCoin   {
  
  private Long time = null;
  private Long verifiedTime = null;

  
  /**
   **/
  public TimeDataCoin time(Long time) {
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
  public TimeDataCoin verifiedTime(Long verifiedTime) {
    this.verifiedTime = verifiedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("verifiedTime")
  public Long getVerifiedTime() {
    return verifiedTime;
  }
  public void setVerifiedTime(Long verifiedTime) {
    this.verifiedTime = verifiedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDataCoin timeDataCoin = (TimeDataCoin) o;
    return Objects.equals(this.time, timeDataCoin.time) &&
        Objects.equals(this.verifiedTime, timeDataCoin.verifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, verifiedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDataCoin {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    verifiedTime: ").append(toIndentedString(verifiedTime)).append("\n");
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

