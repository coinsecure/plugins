package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NewBankForm
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class NewBankForm   {
  
  private String acctNick = null;
  private String name = null;
  private String ban = null;
  private String ifsc = null;
  private String message = null;
  private String banType = null;
  private String phone = null;
  private String otp = null;

  
  /**
   **/
  public NewBankForm acctNick(String acctNick) {
    this.acctNick = acctNick;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("acct_nick")
  public String getAcctNick() {
    return acctNick;
  }
  public void setAcctNick(String acctNick) {
    this.acctNick = acctNick;
  }


  /**
   **/
  public NewBankForm name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public NewBankForm ban(String ban) {
    this.ban = ban;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ban")
  public String getBan() {
    return ban;
  }
  public void setBan(String ban) {
    this.ban = ban;
  }


  /**
   **/
  public NewBankForm ifsc(String ifsc) {
    this.ifsc = ifsc;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("ifsc")
  public String getIfsc() {
    return ifsc;
  }
  public void setIfsc(String ifsc) {
    this.ifsc = ifsc;
  }


  /**
   **/
  public NewBankForm message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public NewBankForm banType(String banType) {
    this.banType = banType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("banType")
  public String getBanType() {
    return banType;
  }
  public void setBanType(String banType) {
    this.banType = banType;
  }


  /**
   **/
  public NewBankForm phone(String phone) {
    this.phone = phone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }
  public void setPhone(String phone) {
    this.phone = phone;
  }


  /**
   **/
  public NewBankForm otp(String otp) {
    this.otp = otp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("otp")
  public String getOtp() {
    return otp;
  }
  public void setOtp(String otp) {
    this.otp = otp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewBankForm newBankForm = (NewBankForm) o;
    return Objects.equals(this.acctNick, newBankForm.acctNick) &&
        Objects.equals(this.name, newBankForm.name) &&
        Objects.equals(this.ban, newBankForm.ban) &&
        Objects.equals(this.ifsc, newBankForm.ifsc) &&
        Objects.equals(this.message, newBankForm.message) &&
        Objects.equals(this.banType, newBankForm.banType) &&
        Objects.equals(this.phone, newBankForm.phone) &&
        Objects.equals(this.otp, newBankForm.otp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acctNick, name, ban, ifsc, message, banType, phone, otp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewBankForm {\n");
    
    sb.append("    acctNick: ").append(toIndentedString(acctNick)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ban: ").append(toIndentedString(ban)).append("\n");
    sb.append("    ifsc: ").append(toIndentedString(ifsc)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    banType: ").append(toIndentedString(banType)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
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

