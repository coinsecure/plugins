package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WithdrawFiat
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class WithdrawFiat   {
  
  private Long fiat = null;
  private String account = null;
  private String msg = null;
  private String pin = null;

  
  /**
   **/
  public WithdrawFiat fiat(Long fiat) {
    this.fiat = fiat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiat")
  public Long getFiat() {
    return fiat;
  }
  public void setFiat(Long fiat) {
    this.fiat = fiat;
  }


  /**
   **/
  public WithdrawFiat account(String account) {
    this.account = account;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("account")
  public String getAccount() {
    return account;
  }
  public void setAccount(String account) {
    this.account = account;
  }


  /**
   **/
  public WithdrawFiat msg(String msg) {
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
  public WithdrawFiat pin(String pin) {
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
    WithdrawFiat withdrawFiat = (WithdrawFiat) o;
    return Objects.equals(this.fiat, withdrawFiat.fiat) &&
        Objects.equals(this.account, withdrawFiat.account) &&
        Objects.equals(this.msg, withdrawFiat.msg) &&
        Objects.equals(this.pin, withdrawFiat.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fiat, account, msg, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawFiat {\n");
    
    sb.append("    fiat: ").append(toIndentedString(fiat)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
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

