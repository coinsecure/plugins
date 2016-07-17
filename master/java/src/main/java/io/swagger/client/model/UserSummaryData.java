package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * UserSummaryData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class UserSummaryData   {
  
  private String kycStatus = null;
  private String bankLinkStatus = null;
  private String tradeReady = null;
  private Boolean isDisabledAccount = false;
  private String faSecure = null;
  private String hasPhone = null;

  
  /**
   **/
  public UserSummaryData kycStatus(String kycStatus) {
    this.kycStatus = kycStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("kycStatus")
  public String getKycStatus() {
    return kycStatus;
  }
  public void setKycStatus(String kycStatus) {
    this.kycStatus = kycStatus;
  }


  /**
   **/
  public UserSummaryData bankLinkStatus(String bankLinkStatus) {
    this.bankLinkStatus = bankLinkStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bankLinkStatus")
  public String getBankLinkStatus() {
    return bankLinkStatus;
  }
  public void setBankLinkStatus(String bankLinkStatus) {
    this.bankLinkStatus = bankLinkStatus;
  }


  /**
   **/
  public UserSummaryData tradeReady(String tradeReady) {
    this.tradeReady = tradeReady;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tradeReady")
  public String getTradeReady() {
    return tradeReady;
  }
  public void setTradeReady(String tradeReady) {
    this.tradeReady = tradeReady;
  }


  /**
   **/
  public UserSummaryData isDisabledAccount(Boolean isDisabledAccount) {
    this.isDisabledAccount = isDisabledAccount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("isDisabledAccount")
  public Boolean getIsDisabledAccount() {
    return isDisabledAccount;
  }
  public void setIsDisabledAccount(Boolean isDisabledAccount) {
    this.isDisabledAccount = isDisabledAccount;
  }


  /**
   **/
  public UserSummaryData faSecure(String faSecure) {
    this.faSecure = faSecure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("faSecure")
  public String getFaSecure() {
    return faSecure;
  }
  public void setFaSecure(String faSecure) {
    this.faSecure = faSecure;
  }


  /**
   **/
  public UserSummaryData hasPhone(String hasPhone) {
    this.hasPhone = hasPhone;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hasPhone")
  public String getHasPhone() {
    return hasPhone;
  }
  public void setHasPhone(String hasPhone) {
    this.hasPhone = hasPhone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSummaryData userSummaryData = (UserSummaryData) o;
    return Objects.equals(this.kycStatus, userSummaryData.kycStatus) &&
        Objects.equals(this.bankLinkStatus, userSummaryData.bankLinkStatus) &&
        Objects.equals(this.tradeReady, userSummaryData.tradeReady) &&
        Objects.equals(this.isDisabledAccount, userSummaryData.isDisabledAccount) &&
        Objects.equals(this.faSecure, userSummaryData.faSecure) &&
        Objects.equals(this.hasPhone, userSummaryData.hasPhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kycStatus, bankLinkStatus, tradeReady, isDisabledAccount, faSecure, hasPhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummaryData {\n");
    
    sb.append("    kycStatus: ").append(toIndentedString(kycStatus)).append("\n");
    sb.append("    bankLinkStatus: ").append(toIndentedString(bankLinkStatus)).append("\n");
    sb.append("    tradeReady: ").append(toIndentedString(tradeReady)).append("\n");
    sb.append("    isDisabledAccount: ").append(toIndentedString(isDisabledAccount)).append("\n");
    sb.append("    faSecure: ").append(toIndentedString(faSecure)).append("\n");
    sb.append("    hasPhone: ").append(toIndentedString(hasPhone)).append("\n");
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

