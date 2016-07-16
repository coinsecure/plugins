package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RateVolData  {
  
  @SerializedName("rate")
  private Long rate = null;
  @SerializedName("vol")
  private Long vol = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getRate() {
    return rate;
  }
  public void setRate(Long rate) {
    this.rate = rate;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateVolData rateVolData = (RateVolData) o;
    return (rate == null ? rateVolData.rate == null : rate.equals(rateVolData.rate)) &&
        (vol == null ? rateVolData.vol == null : vol.equals(rateVolData.vol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (rate == null ? 0: rate.hashCode());
    result = 31 * result + (vol == null ? 0: vol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateVolData {\n");
    
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  vol: ").append(vol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
