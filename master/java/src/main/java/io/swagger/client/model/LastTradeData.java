package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LastTradeData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class LastTradeData   {
  
  private Long time = null;
  private Long avgRate = null;
  private Long vol = null;
  private String ordType = null;

  
  /**
   **/
  public LastTradeData time(Long time) {
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
  public LastTradeData avgRate(Long avgRate) {
    this.avgRate = avgRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("avgRate")
  public Long getAvgRate() {
    return avgRate;
  }
  public void setAvgRate(Long avgRate) {
    this.avgRate = avgRate;
  }


  /**
   **/
  public LastTradeData vol(Long vol) {
    this.vol = vol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("vol")
  public Long getVol() {
    return vol;
  }
  public void setVol(Long vol) {
    this.vol = vol;
  }


  /**
   **/
  public LastTradeData ordType(String ordType) {
    this.ordType = ordType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ordType")
  public String getOrdType() {
    return ordType;
  }
  public void setOrdType(String ordType) {
    this.ordType = ordType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastTradeData lastTradeData = (LastTradeData) o;
    return Objects.equals(this.time, lastTradeData.time) &&
        Objects.equals(this.avgRate, lastTradeData.avgRate) &&
        Objects.equals(this.vol, lastTradeData.vol) &&
        Objects.equals(this.ordType, lastTradeData.ordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, avgRate, vol, ordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastTradeData {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    avgRate: ").append(toIndentedString(avgRate)).append("\n");
    sb.append("    vol: ").append(toIndentedString(vol)).append("\n");
    sb.append("    ordType: ").append(toIndentedString(ordType)).append("\n");
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

