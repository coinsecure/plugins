package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SendCoinWallet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class SendCoinWallet   {
  
  private String walletID = null;
  private Long amt = null;
  private String toAddr = null;
  private String msg = null;
  private String pin = null;

  
  /**
   **/
  public SendCoinWallet walletID(String walletID) {
    this.walletID = walletID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletID")
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }


  /**
   **/
  public SendCoinWallet amt(Long amt) {
    this.amt = amt;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("amt")
  public Long getAmt() {
    return amt;
  }
  public void setAmt(Long amt) {
    this.amt = amt;
  }


  /**
   **/
  public SendCoinWallet toAddr(String toAddr) {
    this.toAddr = toAddr;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("toAddr")
  public String getToAddr() {
    return toAddr;
  }
  public void setToAddr(String toAddr) {
    this.toAddr = toAddr;
  }


  /**
   **/
  public SendCoinWallet msg(String msg) {
    this.msg = msg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }
  public void setMsg(String msg) {
    this.msg = msg;
  }


  /**
   **/
  public SendCoinWallet pin(String pin) {
    this.pin = pin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCoinWallet sendCoinWallet = (SendCoinWallet) o;
    return Objects.equals(this.walletID, sendCoinWallet.walletID) &&
        Objects.equals(this.amt, sendCoinWallet.amt) &&
        Objects.equals(this.toAddr, sendCoinWallet.toAddr) &&
        Objects.equals(this.msg, sendCoinWallet.msg) &&
        Objects.equals(this.pin, sendCoinWallet.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletID, amt, toAddr, msg, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCoinWallet {\n");
    
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    toAddr: ").append(toIndentedString(toAddr)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

