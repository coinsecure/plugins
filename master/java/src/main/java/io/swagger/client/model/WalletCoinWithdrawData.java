package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeData;


/**
 * WalletCoinWithdrawData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class WalletCoinWithdrawData   {
  
  private TimeData timeDetails = null;
  private String txID = null;
  private String message = null;
  private Long satoshis = null;
  private String walletID = null;
  private String withdrawID = null;
  private String sentTo = null;

  
  /**
   **/
  public WalletCoinWithdrawData timeDetails(TimeData timeDetails) {
    this.timeDetails = timeDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timeDetails")
  public TimeData getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeData timeDetails) {
    this.timeDetails = timeDetails;
  }


  /**
   **/
  public WalletCoinWithdrawData txID(String txID) {
    this.txID = txID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("txID")
  public String getTxID() {
    return txID;
  }
  public void setTxID(String txID) {
    this.txID = txID;
  }


  /**
   **/
  public WalletCoinWithdrawData message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public WalletCoinWithdrawData satoshis(Long satoshis) {
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
  public WalletCoinWithdrawData walletID(String walletID) {
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
  public WalletCoinWithdrawData withdrawID(String withdrawID) {
    this.withdrawID = withdrawID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("withdrawID")
  public String getWithdrawID() {
    return withdrawID;
  }
  public void setWithdrawID(String withdrawID) {
    this.withdrawID = withdrawID;
  }


  /**
   **/
  public WalletCoinWithdrawData sentTo(String sentTo) {
    this.sentTo = sentTo;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("sentTo")
  public String getSentTo() {
    return sentTo;
  }
  public void setSentTo(String sentTo) {
    this.sentTo = sentTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCoinWithdrawData walletCoinWithdrawData = (WalletCoinWithdrawData) o;
    return Objects.equals(this.timeDetails, walletCoinWithdrawData.timeDetails) &&
        Objects.equals(this.txID, walletCoinWithdrawData.txID) &&
        Objects.equals(this.message, walletCoinWithdrawData.message) &&
        Objects.equals(this.satoshis, walletCoinWithdrawData.satoshis) &&
        Objects.equals(this.walletID, walletCoinWithdrawData.walletID) &&
        Objects.equals(this.withdrawID, walletCoinWithdrawData.withdrawID) &&
        Objects.equals(this.sentTo, walletCoinWithdrawData.sentTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, txID, message, satoshis, walletID, withdrawID, sentTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCoinWithdrawData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    txID: ").append(toIndentedString(txID)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    satoshis: ").append(toIndentedString(satoshis)).append("\n");
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    withdrawID: ").append(toIndentedString(withdrawID)).append("\n");
    sb.append("    sentTo: ").append(toIndentedString(sentTo)).append("\n");
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

