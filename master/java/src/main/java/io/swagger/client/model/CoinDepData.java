/*
 * Coinsecure Api Documentation
 * To generate an API key, please visit <a href='https://coinsecure.in/api' target='_new' class='homeapi'>https://coinsecure.in/api</a>.<br>Guidelines for use can be accessed at <a href='https://api.coinsecure.in/v1/guidelines'>https://api.coinsecure.in/v1/guidelines</a>.<br>Programming Language Libraries for use can be accessed at <a href='https://api.coinsecure.in/v1/code-libraries'>https://api.coinsecure.in/v1/code-libraries</a>.
 *
 * OpenAPI spec version: beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeDataCoin;

/**
 * CoinDepData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-27T22:11:57.435Z")
public class CoinDepData {
  @SerializedName("timeDetails")
  private TimeDataCoin timeDetails = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("value")
  private Long value = null;

  @SerializedName("txHash")
  private String txHash = null;

  @SerializedName("depositID")
  private String depositID = null;

  @SerializedName("reason")
  private String reason = null;

  public CoinDepData timeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
    return this;
  }

   /**
   * Get timeDetails
   * @return timeDetails
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TimeDataCoin getTimeDetails() {
    return timeDetails;
  }

  public void setTimeDetails(TimeDataCoin timeDetails) {
    this.timeDetails = timeDetails;
  }

  public CoinDepData address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public CoinDepData value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public CoinDepData txHash(String txHash) {
    this.txHash = txHash;
    return this;
  }

   /**
   * Get txHash
   * @return txHash
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getTxHash() {
    return txHash;
  }

  public void setTxHash(String txHash) {
    this.txHash = txHash;
  }

  public CoinDepData depositID(String depositID) {
    this.depositID = depositID;
    return this;
  }

   /**
   * Get depositID
   * @return depositID
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDepositID() {
    return depositID;
  }

  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }

  public CoinDepData reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
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
    CoinDepData coinDepData = (CoinDepData) o;
    return Objects.equals(this.timeDetails, coinDepData.timeDetails) &&
        Objects.equals(this.address, coinDepData.address) &&
        Objects.equals(this.value, coinDepData.value) &&
        Objects.equals(this.txHash, coinDepData.txHash) &&
        Objects.equals(this.depositID, coinDepData.depositID) &&
        Objects.equals(this.reason, coinDepData.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, address, value, txHash, depositID, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoinDepData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    txHash: ").append(toIndentedString(txHash)).append("\n");
    sb.append("    depositID: ").append(toIndentedString(depositID)).append("\n");
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

