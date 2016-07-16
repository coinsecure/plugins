package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SuccessTickerResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SuccessTickerResponse   {
  
  private Long lastPrice = null;
  private Long timestamp = null;
  private Long bid = null;
  private Long ask = null;
  private Long fiatVolume = null;
  private Long coinVolume = null;
  private Long open = null;
  private Long high = null;
  private Long low = null;

  
  /**
   **/
  public SuccessTickerResponse lastPrice(Long lastPrice) {
    this.lastPrice = lastPrice;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastPrice")
  public Long getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Long lastPrice) {
    this.lastPrice = lastPrice;
  }


  /**
   **/
  public SuccessTickerResponse timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timestamp")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   **/
  public SuccessTickerResponse bid(Long bid) {
    this.bid = bid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bid")
  public Long getBid() {
    return bid;
  }
  public void setBid(Long bid) {
    this.bid = bid;
  }


  /**
   **/
  public SuccessTickerResponse ask(Long ask) {
    this.ask = ask;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ask")
  public Long getAsk() {
    return ask;
  }
  public void setAsk(Long ask) {
    this.ask = ask;
  }


  /**
   **/
  public SuccessTickerResponse fiatVolume(Long fiatVolume) {
    this.fiatVolume = fiatVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiatVolume")
  public Long getFiatVolume() {
    return fiatVolume;
  }
  public void setFiatVolume(Long fiatVolume) {
    this.fiatVolume = fiatVolume;
  }


  /**
   **/
  public SuccessTickerResponse coinVolume(Long coinVolume) {
    this.coinVolume = coinVolume;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("coinVolume")
  public Long getCoinVolume() {
    return coinVolume;
  }
  public void setCoinVolume(Long coinVolume) {
    this.coinVolume = coinVolume;
  }


  /**
   **/
  public SuccessTickerResponse open(Long open) {
    this.open = open;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("open")
  public Long getOpen() {
    return open;
  }
  public void setOpen(Long open) {
    this.open = open;
  }


  /**
   **/
  public SuccessTickerResponse high(Long high) {
    this.high = high;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("high")
  public Long getHigh() {
    return high;
  }
  public void setHigh(Long high) {
    this.high = high;
  }


  /**
   **/
  public SuccessTickerResponse low(Long low) {
    this.low = low;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("low")
  public Long getLow() {
    return low;
  }
  public void setLow(Long low) {
    this.low = low;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessTickerResponse successTickerResponse = (SuccessTickerResponse) o;
    return Objects.equals(this.lastPrice, successTickerResponse.lastPrice) &&
        Objects.equals(this.timestamp, successTickerResponse.timestamp) &&
        Objects.equals(this.bid, successTickerResponse.bid) &&
        Objects.equals(this.ask, successTickerResponse.ask) &&
        Objects.equals(this.fiatVolume, successTickerResponse.fiatVolume) &&
        Objects.equals(this.coinVolume, successTickerResponse.coinVolume) &&
        Objects.equals(this.open, successTickerResponse.open) &&
        Objects.equals(this.high, successTickerResponse.high) &&
        Objects.equals(this.low, successTickerResponse.low);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastPrice, timestamp, bid, ask, fiatVolume, coinVolume, open, high, low);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessTickerResponse {\n");
    
    sb.append("    lastPrice: ").append(toIndentedString(lastPrice)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    ask: ").append(toIndentedString(ask)).append("\n");
    sb.append("    fiatVolume: ").append(toIndentedString(fiatVolume)).append("\n");
    sb.append("    coinVolume: ").append(toIndentedString(coinVolume)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
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

