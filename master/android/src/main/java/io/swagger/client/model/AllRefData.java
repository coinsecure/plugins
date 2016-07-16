package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AllRefData  {
  
  @SerializedName("refPercent")
  private Double refPercent = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("refID")
  private String refID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getRefPercent() {
    return refPercent;
  }
  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }

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
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AllRefData allRefData = (AllRefData) o;
    return (refPercent == null ? allRefData.refPercent == null : refPercent.equals(allRefData.refPercent)) &&
        (time == null ? allRefData.time == null : time.equals(allRefData.time)) &&
        (refID == null ? allRefData.refID == null : refID.equals(allRefData.refID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (refPercent == null ? 0: refPercent.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (refID == null ? 0: refID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AllRefData {\n");
    
    sb.append("  refPercent: ").append(refPercent).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  refID: ").append(refID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
