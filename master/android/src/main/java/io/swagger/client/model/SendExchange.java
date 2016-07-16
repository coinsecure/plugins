package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SendExchange  {
  
  @SerializedName("amt")
  private Long amt = null;
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("msg")
  private String msg = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAmt() {
    return amt;
  }
  public void setAmt(Long amt) {
    this.amt = amt;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendExchange sendExchange = (SendExchange) o;
    return (amt == null ? sendExchange.amt == null : amt.equals(sendExchange.amt)) &&
        (walletID == null ? sendExchange.walletID == null : walletID.equals(sendExchange.walletID)) &&
        (msg == null ? sendExchange.msg == null : msg.equals(sendExchange.msg));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (amt == null ? 0: amt.hashCode());
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (msg == null ? 0: msg.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendExchange {\n");
    
    sb.append("  amt: ").append(amt).append("\n");
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
