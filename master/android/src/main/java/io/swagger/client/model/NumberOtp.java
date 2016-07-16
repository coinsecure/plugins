package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NumberOtp  {
  
  @SerializedName("number")
  private String number = null;
  @SerializedName("otp")
  private String otp = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }
  public void setNumber(String number) {
    this.number = number;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumberOtp numberOtp = (NumberOtp) o;
    return (number == null ? numberOtp.number == null : number.equals(numberOtp.number)) &&
        (otp == null ? numberOtp.otp == null : otp.equals(numberOtp.otp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (number == null ? 0: number.hashCode());
    result = 31 * result + (otp == null ? 0: otp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumberOtp {\n");
    
    sb.append("  number: ").append(number).append("\n");
    sb.append("  otp: ").append(otp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
