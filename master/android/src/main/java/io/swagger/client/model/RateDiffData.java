package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RateDiffData  {
  
  @SerializedName("rate")
  private Long rate = null;
  @SerializedName("difference")
  private Long difference = null;

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
  public Long getDifference() {
    return difference;
  }
  public void setDifference(Long difference) {
    this.difference = difference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateDiffData rateDiffData = (RateDiffData) o;
    return (rate == null ? rateDiffData.rate == null : rate.equals(rateDiffData.rate)) &&
        (difference == null ? rateDiffData.difference == null : difference.equals(rateDiffData.difference));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (rate == null ? 0: rate.hashCode());
    result = 31 * result + (difference == null ? 0: difference.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateDiffData {\n");
    
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  difference: ").append(difference).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
