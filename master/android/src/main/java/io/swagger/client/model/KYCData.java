/**
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

import io.swagger.client.model.TimeKYCData;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class KYCData {
  
  @SerializedName("timeDetails")
  private TimeKYCData timeDetails = null;
  @SerializedName("kycID")
  private String kycID = null;
  @SerializedName("firstName")
  private String firstName = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("userType")
  private String userType = null;
  @SerializedName("info")
  private String info = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public TimeKYCData getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeKYCData timeDetails) {
    this.timeDetails = timeDetails;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKycID() {
    return kycID;
  }
  public void setKycID(String kycID) {
    this.kycID = kycID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
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
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCData kYCData = (KYCData) o;
    return (this.timeDetails == null ? kYCData.timeDetails == null : this.timeDetails.equals(kYCData.timeDetails)) &&
        (this.kycID == null ? kYCData.kycID == null : this.kycID.equals(kYCData.kycID)) &&
        (this.firstName == null ? kYCData.firstName == null : this.firstName.equals(kYCData.firstName)) &&
        (this.lastName == null ? kYCData.lastName == null : this.lastName.equals(kYCData.lastName)) &&
        (this.status == null ? kYCData.status == null : this.status.equals(kYCData.status)) &&
        (this.userType == null ? kYCData.userType == null : this.userType.equals(kYCData.userType)) &&
        (this.info == null ? kYCData.info == null : this.info.equals(kYCData.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.timeDetails == null ? 0: this.timeDetails.hashCode());
    result = 31 * result + (this.kycID == null ? 0: this.kycID.hashCode());
    result = 31 * result + (this.firstName == null ? 0: this.firstName.hashCode());
    result = 31 * result + (this.lastName == null ? 0: this.lastName.hashCode());
    result = 31 * result + (this.status == null ? 0: this.status.hashCode());
    result = 31 * result + (this.userType == null ? 0: this.userType.hashCode());
    result = 31 * result + (this.info == null ? 0: this.info.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCData {\n");
    
    sb.append("  timeDetails: ").append(timeDetails).append("\n");
    sb.append("  kycID: ").append(kycID).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  userType: ").append(userType).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
