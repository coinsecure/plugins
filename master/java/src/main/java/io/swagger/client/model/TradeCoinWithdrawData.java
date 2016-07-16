package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeData;


/**
 * TradeCoinWithdrawData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class TradeCoinWithdrawData   {
  
  private TimeData timeDetails = null;
  private String address = null;
  private Long value = null;
  private Long fees = null;
  private String withdrawID = null;
  private String txHash = null;

  
  /**
   **/
  public TradeCoinWithdrawData timeDetails(TimeData timeDetails) {
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
  public TradeCoinWithdrawData address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public TradeCoinWithdrawData value(Long value) {
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
  public TradeCoinWithdrawData fees(Long fees) {
    this.fees = fees;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fees")
  public Long getFees() {
    return fees;
  }
  public void setFees(Long fees) {
    this.fees = fees;
  }


  /**
   **/
  public TradeCoinWithdrawData withdrawID(String withdrawID) {
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
  public TradeCoinWithdrawData txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("txHash")
  public String getTxHash() {
    return txHash;
  }
  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeCoinWithdrawData tradeCoinWithdrawData = (TradeCoinWithdrawData) o;
    return Objects.equals(this.timeDetails, tradeCoinWithdrawData.timeDetails) &&
        Objects.equals(this.address, tradeCoinWithdrawData.address) &&
        Objects.equals(this.value, tradeCoinWithdrawData.value) &&
        Objects.equals(this.fees, tradeCoinWithdrawData.fees) &&
        Objects.equals(this.withdrawID, tradeCoinWithdrawData.withdrawID) &&
        Objects.equals(this.txHash, tradeCoinWithdrawData.txHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, address, value, fees, withdrawID, txHash);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeCoinWithdrawData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    withdrawID: ").append(toIndentedString(withdrawID)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
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

