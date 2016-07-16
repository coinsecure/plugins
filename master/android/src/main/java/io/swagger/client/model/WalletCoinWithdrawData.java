package io.swagger.client.model;

import io.swagger.client.model.TimeData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WalletCoinWithdrawData  {
  
  @SerializedName("timeDetails")
  private TimeData timeDetails = null;
  @SerializedName("txID")
  private String txID = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("satoshis")
  private Long satoshis = null;
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("withdrawID")
  private String withdrawID = null;
  @SerializedName("sentTo")
  private String sentTo = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeData getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeData timeDetails) {
    this.timeDetails = timeDetails;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTxID() {
    return txID;
  }
  public void setTxID(String txID) {
    this.txID = txID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

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
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWithdrawID() {
    return withdrawID;
  }
  public void setWithdrawID(String withdrawID) {
    this.withdrawID = withdrawID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSentTo() {
    return sentTo;
  }
  public void setSentTo(String sentTo) {
    this.sentTo = sentTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletCoinWithdrawData walletCoinWithdrawData = (WalletCoinWithdrawData) o;
    return (timeDetails == null ? walletCoinWithdrawData.timeDetails == null : timeDetails.equals(walletCoinWithdrawData.timeDetails)) &&
        (txID == null ? walletCoinWithdrawData.txID == null : txID.equals(walletCoinWithdrawData.txID)) &&
        (message == null ? walletCoinWithdrawData.message == null : message.equals(walletCoinWithdrawData.message)) &&
        (satoshis == null ? walletCoinWithdrawData.satoshis == null : satoshis.equals(walletCoinWithdrawData.satoshis)) &&
        (walletID == null ? walletCoinWithdrawData.walletID == null : walletID.equals(walletCoinWithdrawData.walletID)) &&
        (withdrawID == null ? walletCoinWithdrawData.withdrawID == null : withdrawID.equals(walletCoinWithdrawData.withdrawID)) &&
        (sentTo == null ? walletCoinWithdrawData.sentTo == null : sentTo.equals(walletCoinWithdrawData.sentTo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timeDetails == null ? 0: timeDetails.hashCode());
    result = 31 * result + (txID == null ? 0: txID.hashCode());
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (satoshis == null ? 0: satoshis.hashCode());
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (withdrawID == null ? 0: withdrawID.hashCode());
    result = 31 * result + (sentTo == null ? 0: sentTo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletCoinWithdrawData {\n");
    
    sb.append("  timeDetails: ").append(timeDetails).append("\n");
    sb.append("  txID: ").append(txID).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  satoshis: ").append(satoshis).append("\n");
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  withdrawID: ").append(withdrawID).append("\n");
    sb.append("  sentTo: ").append(sentTo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}