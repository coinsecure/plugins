package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LastTradeData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("avgRate")
  private Long avgRate = null;
  @SerializedName("vol")
  private Long vol = null;
  @SerializedName("ordType")
  private String ordType = null;

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
  public Long getAvgRate() {
    return avgRate;
  }
  public void setAvgRate(Long avgRate) {
    this.avgRate = avgRate;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getVol() {
    return vol;
  }
  public void setVol(Long vol) {
    this.vol = vol;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastTradeData lastTradeData = (LastTradeData) o;
    return (time == null ? lastTradeData.time == null : time.equals(lastTradeData.time)) &&
        (avgRate == null ? lastTradeData.avgRate == null : avgRate.equals(lastTradeData.avgRate)) &&
        (vol == null ? lastTradeData.vol == null : vol.equals(lastTradeData.vol)) &&
        (ordType == null ? lastTradeData.ordType == null : ordType.equals(lastTradeData.ordType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (avgRate == null ? 0: avgRate.hashCode());
    result = 31 * result + (vol == null ? 0: vol.hashCode());
    result = 31 * result + (ordType == null ? 0: ordType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastTradeData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  avgRate: ").append(avgRate).append("\n");
    sb.append("  vol: ").append(vol).append("\n");
    sb.append("  ordType: ").append(ordType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
