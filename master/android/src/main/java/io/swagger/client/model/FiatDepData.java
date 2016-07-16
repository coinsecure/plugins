package io.swagger.client.model;

import io.swagger.client.model.TimeDataCoin;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class FiatDepData  {
  
  @SerializedName("timeDetails")
  private TimeDataCoin timeDetails = null;
  @SerializedName("depositID")
  private String depositID = null;
  @SerializedName("value")
  private Long value = null;
  @SerializedName("account")
  private String account = null;
  @SerializedName("reason")
  private String reason = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeDataCoin getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
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
  @ApiModelProperty(required = true, value = "")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiatDepData fiatDepData = (FiatDepData) o;
    return (timeDetails == null ? fiatDepData.timeDetails == null : timeDetails.equals(fiatDepData.timeDetails)) &&
        (depositID == null ? fiatDepData.depositID == null : depositID.equals(fiatDepData.depositID)) &&
        (value == null ? fiatDepData.value == null : value.equals(fiatDepData.value)) &&
        (account == null ? fiatDepData.account == null : account.equals(fiatDepData.account)) &&
        (reason == null ? fiatDepData.reason == null : reason.equals(fiatDepData.reason));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timeDetails == null ? 0: timeDetails.hashCode());
    result = 31 * result + (depositID == null ? 0: depositID.hashCode());
    result = 31 * result + (value == null ? 0: value.hashCode());
    result = 31 * result + (account == null ? 0: account.hashCode());
    result = 31 * result + (reason == null ? 0: reason.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiatDepData {\n");
    
    sb.append("  timeDetails: ").append(timeDetails).append("\n");
    sb.append("  depositID: ").append(depositID).append("\n");
    sb.append("  value: ").append(value).append("\n");
    sb.append("  account: ").append(account).append("\n");
    sb.append("  reason: ").append(reason).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
