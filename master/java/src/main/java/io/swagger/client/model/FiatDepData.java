package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeDataCoin;


/**
 * FiatDepData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class FiatDepData   {
  
  private TimeDataCoin timeDetails = null;
  private String depositID = null;
  private Long value = null;
  private String account = null;
  private String reason = null;

  
  /**
   **/
  public FiatDepData timeDetails(TimeDataCoin timeDetails) {
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
  public FiatDepData depositID(String depositID) {
    this.depositID = depositID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("depositID")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }


  /**
   **/
  public FiatDepData value(Long value) {
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
  public FiatDepData account(String account) {
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
  public FiatDepData reason(String reason) {
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
    FiatDepData fiatDepData = (FiatDepData) o;
    return Objects.equals(this.timeDetails, fiatDepData.timeDetails) &&
        Objects.equals(this.depositID, fiatDepData.depositID) &&
        Objects.equals(this.value, fiatDepData.value) &&
        Objects.equals(this.account, fiatDepData.account) &&
        Objects.equals(this.reason, fiatDepData.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, depositID, value, account, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FiatDepData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    depositID: ").append(toIndentedString(depositID)).append("\n");
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

