package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * FiatBankData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class FiatBankData   {
  
  private Long time = null;
  private String status = null;
  private Long updateTime = null;
  private String updateMessage = null;
  private String bankID = null;
  private String info = null;
  private String accountNumber = null;
  private String accountNick = null;
  private String accountType = null;

  
  /**
   **/
  public FiatBankData time(Long time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  /**
   **/
  public FiatBankData status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }


  /**
   **/
  public FiatBankData updateTime(Long updateTime) {
    this.updateTime = updateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("updateTime")
  public Long getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  /**
   **/
  public FiatBankData updateMessage(String updateMessage) {
    this.updateMessage = updateMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("updateMessage")
  public String getUpdateMessage() {
    return updateMessage;
  }
  public void setUpdateMessage(String updateMessage) {
    this.updateMessage = updateMessage;
  }


  /**
   **/
  public FiatBankData bankID(String bankID) {
    this.bankID = bankID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bankID")
  public String getBankID() {
    return bankID;
  }
  public void setBankID(String bankID) {
    this.bankID = bankID;
  }


  /**
   **/
  public FiatBankData info(String info) {
    this.info = info;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("info")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }


  /**
   **/
  public FiatBankData accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountNumber")
  public String getAccountNumber() {
    return accountNumber;
  }
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  /**
   **/
  public FiatBankData accountNick(String accountNick) {
    this.accountNick = accountNick;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountNick")
  public String getAccountNick() {
    return accountNick;
  }
  public void setAccountNick(String accountNick) {
    this.accountNick = accountNick;
  }


  /**
   **/
  public FiatBankData accountType(String accountType) {
    this.accountType = accountType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("accountType")
  public String getAccountType() {
    return accountType;
  }
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiatBankData fiatBankData = (FiatBankData) o;
    return Objects.equals(this.time, fiatBankData.time) &&
        Objects.equals(this.status, fiatBankData.status) &&
        Objects.equals(this.updateTime, fiatBankData.updateTime) &&
        Objects.equals(this.updateMessage, fiatBankData.updateMessage) &&
        Objects.equals(this.bankID, fiatBankData.bankID) &&
        Objects.equals(this.info, fiatBankData.info) &&
        Objects.equals(this.accountNumber, fiatBankData.accountNumber) &&
        Objects.equals(this.accountNick, fiatBankData.accountNick) &&
        Objects.equals(this.accountType, fiatBankData.accountType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, status, updateTime, updateMessage, bankID, info, accountNumber, accountNick, accountType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiatBankData {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updateMessage: ").append(toIndentedString(updateMessage)).append("\n");
    sb.append("    bankID: ").append(toIndentedString(bankID)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    accountNick: ").append(toIndentedString(accountNick)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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

