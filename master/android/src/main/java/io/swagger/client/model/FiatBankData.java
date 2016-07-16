package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class FiatBankData  {
  
  @SerializedName("time")
  private Long time = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("updateTime")
  private Long updateTime = null;
  @SerializedName("updateMessage")
  private String updateMessage = null;
  @SerializedName("bankID")
  private String bankID = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("accountNumber")
  private String accountNumber = null;
  @SerializedName("accountNick")
  private String accountNick = null;
  @SerializedName("accountType")
  private String accountType = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUpdateMessage() {
    return updateMessage;
  }
  public void setUpdateMessage(String updateMessage) {
    this.updateMessage = updateMessage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBankID() {
    return bankID;
  }
  public void setBankID(String bankID) {
    this.bankID = bankID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountNick() {
    return accountNick;
  }
  public void setAccountNick(String accountNick) {
    this.accountNick = accountNick;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiatBankData fiatBankData = (FiatBankData) o;
    return (time == null ? fiatBankData.time == null : time.equals(fiatBankData.time)) &&
        (status == null ? fiatBankData.status == null : status.equals(fiatBankData.status)) &&
        (updateTime == null ? fiatBankData.updateTime == null : updateTime.equals(fiatBankData.updateTime)) &&
        (updateMessage == null ? fiatBankData.updateMessage == null : updateMessage.equals(fiatBankData.updateMessage)) &&
        (bankID == null ? fiatBankData.bankID == null : bankID.equals(fiatBankData.bankID)) &&
        (info == null ? fiatBankData.info == null : info.equals(fiatBankData.info)) &&
        (accountNumber == null ? fiatBankData.accountNumber == null : accountNumber.equals(fiatBankData.accountNumber)) &&
        (accountNick == null ? fiatBankData.accountNick == null : accountNick.equals(fiatBankData.accountNick)) &&
        (accountType == null ? fiatBankData.accountType == null : accountType.equals(fiatBankData.accountType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (updateTime == null ? 0: updateTime.hashCode());
    result = 31 * result + (updateMessage == null ? 0: updateMessage.hashCode());
    result = 31 * result + (bankID == null ? 0: bankID.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (accountNumber == null ? 0: accountNumber.hashCode());
    result = 31 * result + (accountNick == null ? 0: accountNick.hashCode());
    result = 31 * result + (accountType == null ? 0: accountType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiatBankData {\n");
    
    sb.append("  time: ").append(time).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  updateTime: ").append(updateTime).append("\n");
    sb.append("  updateMessage: ").append(updateMessage).append("\n");
    sb.append("  bankID: ").append(bankID).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  accountNumber: ").append(accountNumber).append("\n");
    sb.append("  accountNick: ").append(accountNick).append("\n");
    sb.append("  accountType: ").append(accountType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
