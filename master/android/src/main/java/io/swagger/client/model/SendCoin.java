package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SendCoin  {
  
  @SerializedName("satoshis")
  private Long satoshis = null;
  @SerializedName("toAddr")
  private String toAddr = null;
  @SerializedName("msg")
  private String msg = null;
  @SerializedName("pin")
  private String pin = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getSatoshis() {
    return satoshis;
  }
  public void setSatoshis(Long satoshis) {
    this.satoshis = satoshis;
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
    SendCoin sendCoin = (SendCoin) o;
    return (satoshis == null ? sendCoin.satoshis == null : satoshis.equals(sendCoin.satoshis)) &&
        (toAddr == null ? sendCoin.toAddr == null : toAddr.equals(sendCoin.toAddr)) &&
        (msg == null ? sendCoin.msg == null : msg.equals(sendCoin.msg)) &&
        (pin == null ? sendCoin.pin == null : pin.equals(sendCoin.pin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (satoshis == null ? 0: satoshis.hashCode());
    result = 31 * result + (toAddr == null ? 0: toAddr.hashCode());
    result = 31 * result + (msg == null ? 0: msg.hashCode());
    result = 31 * result + (pin == null ? 0: pin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCoin {\n");
    
    sb.append("  satoshis: ").append(satoshis).append("\n");
    sb.append("  toAddr: ").append(toAddr).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
