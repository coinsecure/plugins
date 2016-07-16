package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccCoinRefData  {
  
  @SerializedName("refPercent")
  private Double refPercent = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("refID")
  private String refID = null;
  @SerializedName("tradeID")
  private String tradeID = null;
  @SerializedName("newUserIDMasked")
  private String newUserIDMasked = null;
  @SerializedName("depositID")
  private String depositID = null;
  @SerializedName("amtPaid")
  private Long amtPaid = null;

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
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeID() {
    return tradeID;
  }
  public void setTradeID(String tradeID) {
    this.tradeID = tradeID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNewUserIDMasked() {
    return newUserIDMasked;
  }
  public void setNewUserIDMasked(String newUserIDMasked) {
    this.newUserIDMasked = newUserIDMasked;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAmtPaid() {
    return amtPaid;
  }
  public void setAmtPaid(Long amtPaid) {
    this.amtPaid = amtPaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccCoinRefData succCoinRefData = (SuccCoinRefData) o;
    return (refPercent == null ? succCoinRefData.refPercent == null : refPercent.equals(succCoinRefData.refPercent)) &&
        (time == null ? succCoinRefData.time == null : time.equals(succCoinRefData.time)) &&
        (orderID == null ? succCoinRefData.orderID == null : orderID.equals(succCoinRefData.orderID)) &&
        (refID == null ? succCoinRefData.refID == null : refID.equals(succCoinRefData.refID)) &&
        (tradeID == null ? succCoinRefData.tradeID == null : tradeID.equals(succCoinRefData.tradeID)) &&
        (newUserIDMasked == null ? succCoinRefData.newUserIDMasked == null : newUserIDMasked.equals(succCoinRefData.newUserIDMasked)) &&
        (depositID == null ? succCoinRefData.depositID == null : depositID.equals(succCoinRefData.depositID)) &&
        (amtPaid == null ? succCoinRefData.amtPaid == null : amtPaid.equals(succCoinRefData.amtPaid));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (refPercent == null ? 0: refPercent.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (refID == null ? 0: refID.hashCode());
    result = 31 * result + (tradeID == null ? 0: tradeID.hashCode());
    result = 31 * result + (newUserIDMasked == null ? 0: newUserIDMasked.hashCode());
    result = 31 * result + (depositID == null ? 0: depositID.hashCode());
    result = 31 * result + (amtPaid == null ? 0: amtPaid.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccCoinRefData {\n");
    
    sb.append("  refPercent: ").append(refPercent).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  refID: ").append(refID).append("\n");
    sb.append("  tradeID: ").append(tradeID).append("\n");
    sb.append("  newUserIDMasked: ").append(newUserIDMasked).append("\n");
    sb.append("  depositID: ").append(depositID).append("\n");
    sb.append("  amtPaid: ").append(amtPaid).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
