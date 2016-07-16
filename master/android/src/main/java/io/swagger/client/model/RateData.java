package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RateData  {
  
  @SerializedName("rate")
  private Long rate = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getRate() {
    return rate;
  }
  public void setRate(Long rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateData rateData = (RateData) o;
    return (rate == null ? rateData.rate == null : rate.equals(rateData.rate));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (rate == null ? 0: rate.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateData {\n");
    
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
