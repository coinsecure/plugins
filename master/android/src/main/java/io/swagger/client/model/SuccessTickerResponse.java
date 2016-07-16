package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccessTickerResponse  {
  
  @SerializedName("lastPrice")
  private Long lastPrice = null;
  @SerializedName("timestamp")
  private Long timestamp = null;
  @SerializedName("bid")
  private Long bid = null;
  @SerializedName("ask")
  private Long ask = null;
  @SerializedName("fiatVolume")
  private Long fiatVolume = null;
  @SerializedName("coinVolume")
  private Long coinVolume = null;
  @SerializedName("open")
  private Long open = null;
  @SerializedName("high")
  private Long high = null;
  @SerializedName("low")
  private Long low = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getLastPrice() {
    return lastPrice;
  }
  public void setLastPrice(Long lastPrice) {
    this.lastPrice = lastPrice;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getBid() {
    return bid;
  }
  public void setBid(Long bid) {
    this.bid = bid;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAsk() {
    return ask;
  }
  public void setAsk(Long ask) {
    this.ask = ask;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFiatVolume() {
    return fiatVolume;
  }
  public void setFiatVolume(Long fiatVolume) {
    this.fiatVolume = fiatVolume;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCoinVolume() {
    return coinVolume;
  }
  public void setCoinVolume(Long coinVolume) {
    this.coinVolume = coinVolume;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getOpen() {
    return open;
  }
  public void setOpen(Long open) {
    this.open = open;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getHigh() {
    return high;
  }
  public void setHigh(Long high) {
    this.high = high;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getLow() {
    return low;
  }
  public void setLow(Long low) {
    this.low = low;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessTickerResponse successTickerResponse = (SuccessTickerResponse) o;
    return (lastPrice == null ? successTickerResponse.lastPrice == null : lastPrice.equals(successTickerResponse.lastPrice)) &&
        (timestamp == null ? successTickerResponse.timestamp == null : timestamp.equals(successTickerResponse.timestamp)) &&
        (bid == null ? successTickerResponse.bid == null : bid.equals(successTickerResponse.bid)) &&
        (ask == null ? successTickerResponse.ask == null : ask.equals(successTickerResponse.ask)) &&
        (fiatVolume == null ? successTickerResponse.fiatVolume == null : fiatVolume.equals(successTickerResponse.fiatVolume)) &&
        (coinVolume == null ? successTickerResponse.coinVolume == null : coinVolume.equals(successTickerResponse.coinVolume)) &&
        (open == null ? successTickerResponse.open == null : open.equals(successTickerResponse.open)) &&
        (high == null ? successTickerResponse.high == null : high.equals(successTickerResponse.high)) &&
        (low == null ? successTickerResponse.low == null : low.equals(successTickerResponse.low));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (lastPrice == null ? 0: lastPrice.hashCode());
    result = 31 * result + (timestamp == null ? 0: timestamp.hashCode());
    result = 31 * result + (bid == null ? 0: bid.hashCode());
    result = 31 * result + (ask == null ? 0: ask.hashCode());
    result = 31 * result + (fiatVolume == null ? 0: fiatVolume.hashCode());
    result = 31 * result + (coinVolume == null ? 0: coinVolume.hashCode());
    result = 31 * result + (open == null ? 0: open.hashCode());
    result = 31 * result + (high == null ? 0: high.hashCode());
    result = 31 * result + (low == null ? 0: low.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessTickerResponse {\n");
    
    sb.append("  lastPrice: ").append(lastPrice).append("\n");
    sb.append("  timestamp: ").append(timestamp).append("\n");
    sb.append("  bid: ").append(bid).append("\n");
    sb.append("  ask: ").append(ask).append("\n");
    sb.append("  fiatVolume: ").append(fiatVolume).append("\n");
    sb.append("  coinVolume: ").append(coinVolume).append("\n");
    sb.append("  open: ").append(open).append("\n");
    sb.append("  high: ").append(high).append("\n");
    sb.append("  low: ").append(low).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
