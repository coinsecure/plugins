package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SendCoinWallet  {
  
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("amt")
  private Long amt = null;
  @SerializedName("toAddr")
  private String toAddr = null;
  @SerializedName("msg")
  private String msg = null;
  @SerializedName("pin")
  private String pin = null;

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
  public String getToAddr() {
    return toAddr;
  }
  public void setToAddr(String toAddr) {
    this.toAddr = toAddr;
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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCoinWallet sendCoinWallet = (SendCoinWallet) o;
    return (walletID == null ? sendCoinWallet.walletID == null : walletID.equals(sendCoinWallet.walletID)) &&
        (amt == null ? sendCoinWallet.amt == null : amt.equals(sendCoinWallet.amt)) &&
        (toAddr == null ? sendCoinWallet.toAddr == null : toAddr.equals(sendCoinWallet.toAddr)) &&
        (msg == null ? sendCoinWallet.msg == null : msg.equals(sendCoinWallet.msg)) &&
        (pin == null ? sendCoinWallet.pin == null : pin.equals(sendCoinWallet.pin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (amt == null ? 0: amt.hashCode());
    result = 31 * result + (toAddr == null ? 0: toAddr.hashCode());
    result = 31 * result + (msg == null ? 0: msg.hashCode());
    result = 31 * result + (pin == null ? 0: pin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCoinWallet {\n");
    
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  amt: ").append(amt).append("\n");
    sb.append("  toAddr: ").append(toAddr).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
