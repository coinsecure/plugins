package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SendCoin
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SendCoin   {
  
  private Long satoshis = null;
  private String toAddr = null;
  private String msg = null;
  private String pin = null;

  
  /**
   **/
  public SendCoin satoshis(Long satoshis) {
    this.satoshis = satoshis;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("satoshis")
  public Long getSatoshis() {
    return satoshis;
  }
  public void setSatoshis(Long satoshis) {
    this.satoshis = satoshis;
  }


  /**
   **/
  public SendCoin toAddr(String toAddr) {
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
  public SendCoin msg(String msg) {
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
  public SendCoin pin(String pin) {
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
    SendCoin sendCoin = (SendCoin) o;
    return Objects.equals(this.satoshis, sendCoin.satoshis) &&
        Objects.equals(this.toAddr, sendCoin.toAddr) &&
        Objects.equals(this.msg, sendCoin.msg) &&
        Objects.equals(this.pin, sendCoin.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(satoshis, toAddr, msg, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendCoin {\n");
    
    sb.append("    satoshis: ").append(toIndentedString(satoshis)).append("\n");
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

