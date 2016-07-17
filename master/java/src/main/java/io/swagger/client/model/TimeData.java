package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TimeData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class TimeData   {
  
  private Long time = null;
  private Long verifiedTime = null;
  private Long completedTime = null;

  
  /**
   **/
  public TimeData time(Long time) {
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
  public TimeData verifiedTime(Long verifiedTime) {
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


  /**
   **/
  public TimeData completedTime(Long completedTime) {
    this.completedTime = completedTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("completedTime")
  public Long getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(Long completedTime) {
    this.completedTime = completedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeData timeData = (TimeData) o;
    return Objects.equals(this.time, timeData.time) &&
        Objects.equals(this.verifiedTime, timeData.verifiedTime) &&
        Objects.equals(this.completedTime, timeData.completedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, verifiedTime, completedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeData {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    verifiedTime: ").append(toIndentedString(verifiedTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
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

