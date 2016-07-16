package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class OrderData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("rate")
  private Long rate = null;
  @SerializedName("vol")
  private Long vol = null;
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("status")
  private String status = null;

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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderData orderData = (OrderData) o;
    return (time == null ? orderData.time == null : time.equals(orderData.time)) &&
        (rate == null ? orderData.rate == null : rate.equals(orderData.rate)) &&
        (vol == null ? orderData.vol == null : vol.equals(orderData.vol)) &&
        (orderID == null ? orderData.orderID == null : orderID.equals(orderData.orderID)) &&
        (status == null ? orderData.status == null : status.equals(orderData.status));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (rate == null ? 0: rate.hashCode());
    result = 31 * result + (vol == null ? 0: vol.hashCode());
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  rate: ").append(rate).append("\n");
    sb.append("  vol: ").append(vol).append("\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
