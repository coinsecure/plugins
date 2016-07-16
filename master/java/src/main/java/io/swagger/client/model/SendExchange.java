package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SendExchange
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SendExchange   {
  
  private Long amt = null;
  private String walletID = null;
  private String msg = null;

  
  /**
   **/
  public SendExchange amt(Long amt) {
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
  public SendExchange walletID(String walletID) {
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
  public SendExchange msg(String msg) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendExchange sendExchange = (SendExchange) o;
    return Objects.equals(this.amt, sendExchange.amt) &&
        Objects.equals(this.walletID, sendExchange.walletID) &&
        Objects.equals(this.msg, sendExchange.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amt, walletID, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendExchange {\n");
    
    sb.append("    amt: ").append(toIndentedString(amt)).append("\n");
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

