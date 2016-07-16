package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MethodCountryMobile  {
  
  @SerializedName("method")
  private String method = null;
  @SerializedName("countryCode")
  private Integer countryCode = null;
  @SerializedName("phoneNumber")
  private Long phoneNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getCountryCode() {
    return countryCode;
  }
  public void setCountryCode(Integer countryCode) {
    this.countryCode = countryCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Long getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MethodCountryMobile methodCountryMobile = (MethodCountryMobile) o;
    return (method == null ? methodCountryMobile.method == null : method.equals(methodCountryMobile.method)) &&
        (countryCode == null ? methodCountryMobile.countryCode == null : countryCode.equals(methodCountryMobile.countryCode)) &&
        (phoneNumber == null ? methodCountryMobile.phoneNumber == null : phoneNumber.equals(methodCountryMobile.phoneNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (method == null ? 0: method.hashCode());
    result = 31 * result + (countryCode == null ? 0: countryCode.hashCode());
    result = 31 * result + (phoneNumber == null ? 0: phoneNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MethodCountryMobile {\n");
    
    sb.append("  method: ").append(method).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
