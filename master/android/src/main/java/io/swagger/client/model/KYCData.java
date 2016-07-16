package io.swagger.client.model;

import io.swagger.client.model.TimeKYCData;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class KYCData  {
  
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
    return (timeDetails == null ? kYCData.timeDetails == null : timeDetails.equals(kYCData.timeDetails)) &&
        (kycID == null ? kYCData.kycID == null : kycID.equals(kYCData.kycID)) &&
        (firstName == null ? kYCData.firstName == null : firstName.equals(kYCData.firstName)) &&
        (lastName == null ? kYCData.lastName == null : lastName.equals(kYCData.lastName)) &&
        (status == null ? kYCData.status == null : status.equals(kYCData.status)) &&
        (userType == null ? kYCData.userType == null : userType.equals(kYCData.userType)) &&
        (info == null ? kYCData.info == null : info.equals(kYCData.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (timeDetails == null ? 0: timeDetails.hashCode());
    result = 31 * result + (kycID == null ? 0: kycID.hashCode());
    result = 31 * result + (firstName == null ? 0: firstName.hashCode());
    result = 31 * result + (lastName == null ? 0: lastName.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (userType == null ? 0: userType.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
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
