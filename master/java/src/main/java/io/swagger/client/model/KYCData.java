package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.TimeKYCData;


/**
 * KYCData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class KYCData   {
  
  private TimeKYCData timeDetails = null;
  private String kycID = null;
  private String firstName = null;
  private String lastName = null;
  private String status = null;
  private String userType = null;
  private String info = null;

  
  /**
   **/
  public KYCData timeDetails(TimeKYCData timeDetails) {
    this.timeDetails = timeDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("timeDetails")
  public TimeKYCData getTimeDetails() {
    return timeDetails;
  }
  public void setTimeDetails(TimeKYCData timeDetails) {
    this.timeDetails = timeDetails;
  }


  /**
   **/
  public KYCData kycID(String kycID) {
    this.kycID = kycID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("kycID")
  public String getKycID() {
    return kycID;
  }
  public void setKycID(String kycID) {
    this.kycID = kycID;
  }


  /**
   **/
  public KYCData firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   **/
  public KYCData lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   **/
  public KYCData status(String status) {
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
  public KYCData userType(String userType) {
    this.userType = userType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("userType")
  public String getUserType() {
    return userType;
  }
  public void setUserType(String userType) {
    this.userType = userType;
  }


  /**
   **/
  public KYCData info(String info) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KYCData kYCData = (KYCData) o;
    return Objects.equals(this.timeDetails, kYCData.timeDetails) &&
        Objects.equals(this.kycID, kYCData.kycID) &&
        Objects.equals(this.firstName, kYCData.firstName) &&
        Objects.equals(this.lastName, kYCData.lastName) &&
        Objects.equals(this.status, kYCData.status) &&
        Objects.equals(this.userType, kYCData.userType) &&
        Objects.equals(this.info, kYCData.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeDetails, kycID, firstName, lastName, status, userType, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KYCData {\n");
    
    sb.append("    timeDetails: ").append(toIndentedString(timeDetails)).append("\n");
    sb.append("    kycID: ").append(toIndentedString(kycID)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

