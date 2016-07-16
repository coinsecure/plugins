package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TimeKYCData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("updateTime")
  private Long updateTime = null;

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
  public Long getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeKYCData timeKYCData = (TimeKYCData) o;
    return (time == null ? timeKYCData.time == null : time.equals(timeKYCData.time)) &&
        (updateTime == null ? timeKYCData.updateTime == null : updateTime.equals(timeKYCData.updateTime));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (updateTime == null ? 0: updateTime.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeKYCData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  updateTime: ").append(updateTime).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
