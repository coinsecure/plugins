package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeDataCoin;


/**
 * FiatWithData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class FiatWithData   {
  
  private TimeDataCoin timeDetails = null;
  private String withdrawID = null;
  private Long value = null;
  private String account = null;
  private String reason = null;

  
  /**
   **/
  public FiatWithData timeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timeDetails")
  public TimeDataCoin getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
  }


  /**
   **/
  public FiatWithData withdrawID(String withdrawID) {
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
  public FiatWithData value(Long value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }


  /**
   **/
  public FiatWithData account(String account) {
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
  public FiatWithData reason(String reason) {
    this.reason = reason;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FiatWithData fiatWithData = (FiatWithData) o;
    return Objects.equals(this.timeDetails, fiatWithData.timeDetails) &&
        Objects.equals(this.withdrawID, fiatWithData.withdrawID) &&
        Objects.equals(this.value, fiatWithData.value) &&
        Objects.equals(this.account, fiatWithData.account) &&
        Objects.equals(this.reason, fiatWithData.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, withdrawID, value, account, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiatWithData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    withdrawID: ").append(toIndentedString(withdrawID)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

