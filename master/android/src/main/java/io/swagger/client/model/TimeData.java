package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TimeData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("verifiedTime")
  private Long verifiedTime = null;
  @SerializedName("completedTime")
  private Long completedTime = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getVerifiedTime() {
    return verifiedTime;
  }
  public void setVerifiedTime(Long verifiedTime) {
    this.verifiedTime = verifiedTime;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCompletedTime() {
    return completedTime;
  }
  public void setCompletedTime(Long completedTime) {
    this.completedTime = completedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeData timeData = (TimeData) o;
    return (time == null ? timeData.time == null : time.equals(timeData.time)) &&
        (verifiedTime == null ? timeData.verifiedTime == null : verifiedTime.equals(timeData.verifiedTime)) &&
        (completedTime == null ? timeData.completedTime == null : completedTime.equals(timeData.completedTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (verifiedTime == null ? 0: verifiedTime.hashCode());
    result = 31 * result + (completedTime == null ? 0: completedTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  verifiedTime: ").append(verifiedTime).append("\n");
    sb.append("  completedTime: ").append(completedTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
