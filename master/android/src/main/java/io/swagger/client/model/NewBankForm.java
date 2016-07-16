package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NewBankForm  {
  
  @SerializedName("acct_nick")
  private String acctNick = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("ban")
  private String ban = null;
  @SerializedName("ifsc")
  private String ifsc = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("banType")
  private String banType = null;
  @SerializedName("phone")
  private String phone = null;
  @SerializedName("otp")
  private String otp = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAcctNick() {
    return acctNick;
  }
  public void setAcctNick(String acctNick) {
    this.acctNick = acctNick;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBan() {
    return ban;
  }
  public void setBan(String ban) {
    this.ban = ban;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getIfsc() {
    return ifsc;
  }
  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBanType() {
    return banType;
  }
  public void setBanType(String banType) {
    this.banType = banType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    NewBankForm newBankForm = (NewBankForm) o;
    return (acctNick == null ? newBankForm.acctNick == null : acctNick.equals(newBankForm.acctNick)) &&
        (name == null ? newBankForm.name == null : name.equals(newBankForm.name)) &&
        (ban == null ? newBankForm.ban == null : ban.equals(newBankForm.ban)) &&
        (ifsc == null ? newBankForm.ifsc == null : ifsc.equals(newBankForm.ifsc)) &&
        (message == null ? newBankForm.message == null : message.equals(newBankForm.message)) &&
        (banType == null ? newBankForm.banType == null : banType.equals(newBankForm.banType)) &&
        (phone == null ? newBankForm.phone == null : phone.equals(newBankForm.phone)) &&
        (otp == null ? newBankForm.otp == null : otp.equals(newBankForm.otp));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (acctNick == null ? 0: acctNick.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (ban == null ? 0: ban.hashCode());
    result = 31 * result + (ifsc == null ? 0: ifsc.hashCode());
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (banType == null ? 0: banType.hashCode());
    result = 31 * result + (phone == null ? 0: phone.hashCode());
    result = 31 * result + (otp == null ? 0: otp.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBankForm {\n");
    
    sb.append("  acctNick: ").append(acctNick).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  ban: ").append(ban).append("\n");
    sb.append("  ifsc: ").append(ifsc).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  banType: ").append(banType).append("\n");
    sb.append("  phone: ").append(phone).append("\n");
    sb.append("  otp: ").append(otp).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
