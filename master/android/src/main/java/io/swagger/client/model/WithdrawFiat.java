package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WithdrawFiat  {
  
  @SerializedName("fiat")
  private Long fiat = null;
  @SerializedName("account")
  private String account = null;
  @SerializedName("msg")
  private String msg = null;
  @SerializedName("pin")
  private String pin = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFiat() {
    return fiat;
  }
  public void setFiat(Long fiat) {
    this.fiat = fiat;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
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
    WithdrawFiat withdrawFiat = (WithdrawFiat) o;
    return (fiat == null ? withdrawFiat.fiat == null : fiat.equals(withdrawFiat.fiat)) &&
        (account == null ? withdrawFiat.account == null : account.equals(withdrawFiat.account)) &&
        (msg == null ? withdrawFiat.msg == null : msg.equals(withdrawFiat.msg)) &&
        (pin == null ? withdrawFiat.pin == null : pin.equals(withdrawFiat.pin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (fiat == null ? 0: fiat.hashCode());
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (msg == null ? 0: msg.hashCode());
    result = 31 * result + (pin == null ? 0: pin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawFiat {\n");
    
    sb.append("  fiat: ").append(fiat).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  msg: ").append(msg).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
