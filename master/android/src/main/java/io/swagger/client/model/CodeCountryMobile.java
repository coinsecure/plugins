package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class CodeCountryMobile  {
  
  @SerializedName("code")
  private String code = null;
  @SerializedName("countryCode")
  private Integer countryCode = null;
  @SerializedName("phoneNumber")
  private Long phoneNumber = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
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
    CodeCountryMobile codeCountryMobile = (CodeCountryMobile) o;
    return (code == null ? codeCountryMobile.code == null : code.equals(codeCountryMobile.code)) &&
        (countryCode == null ? codeCountryMobile.countryCode == null : countryCode.equals(codeCountryMobile.countryCode)) &&
        (phoneNumber == null ? codeCountryMobile.phoneNumber == null : phoneNumber.equals(codeCountryMobile.phoneNumber));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (code == null ? 0: code.hashCode());
    result = 31 * result + (countryCode == null ? 0: countryCode.hashCode());
    result = 31 * result + (phoneNumber == null ? 0: phoneNumber.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CodeCountryMobile {\n");
    
    sb.append("  code: ").append(code).append("\n");
    sb.append("  countryCode: ").append(countryCode).append("\n");
    sb.append("  phoneNumber: ").append(phoneNumber).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
