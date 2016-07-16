package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class UserSummaryData  {
  
  @SerializedName("kycStatus")
  private String kycStatus = null;
  @SerializedName("bankLinkStatus")
  private String bankLinkStatus = null;
  @SerializedName("tradeReady")
  private String tradeReady = null;
  @SerializedName("isDisabledAccount")
  private Boolean isDisabledAccount = null;
  @SerializedName("faSecure")
  private String faSecure = null;
  @SerializedName("hasPhone")
  private String hasPhone = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKycStatus() {
    return kycStatus;
  }
  public void setKycStatus(String kycStatus) {
    this.kycStatus = kycStatus;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBankLinkStatus() {
    return bankLinkStatus;
  }
  public void setBankLinkStatus(String bankLinkStatus) {
    this.bankLinkStatus = bankLinkStatus;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeReady() {
    return tradeReady;
  }
  public void setTradeReady(String tradeReady) {
    this.tradeReady = tradeReady;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getIsDisabledAccount() {
    return isDisabledAccount;
  }
  public void setIsDisabledAccount(Boolean isDisabledAccount) {
    this.isDisabledAccount = isDisabledAccount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFaSecure() {
    return faSecure;
  }
  public void setFaSecure(String faSecure) {
    this.faSecure = faSecure;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getHasPhone() {
    return hasPhone;
  }
  public void setHasPhone(String hasPhone) {
    this.hasPhone = hasPhone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSummaryData userSummaryData = (UserSummaryData) o;
    return (kycStatus == null ? userSummaryData.kycStatus == null : kycStatus.equals(userSummaryData.kycStatus)) &&
        (bankLinkStatus == null ? userSummaryData.bankLinkStatus == null : bankLinkStatus.equals(userSummaryData.bankLinkStatus)) &&
        (tradeReady == null ? userSummaryData.tradeReady == null : tradeReady.equals(userSummaryData.tradeReady)) &&
        (isDisabledAccount == null ? userSummaryData.isDisabledAccount == null : isDisabledAccount.equals(userSummaryData.isDisabledAccount)) &&
        (faSecure == null ? userSummaryData.faSecure == null : faSecure.equals(userSummaryData.faSecure)) &&
        (hasPhone == null ? userSummaryData.hasPhone == null : hasPhone.equals(userSummaryData.hasPhone));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (kycStatus == null ? 0: kycStatus.hashCode());
    result = 31 * result + (bankLinkStatus == null ? 0: bankLinkStatus.hashCode());
    result = 31 * result + (tradeReady == null ? 0: tradeReady.hashCode());
    result = 31 * result + (isDisabledAccount == null ? 0: isDisabledAccount.hashCode());
    result = 31 * result + (faSecure == null ? 0: faSecure.hashCode());
    result = 31 * result + (hasPhone == null ? 0: hasPhone.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummaryData {\n");
    
    sb.append("  kycStatus: ").append(kycStatus).append("\n");
    sb.append("  bankLinkStatus: ").append(bankLinkStatus).append("\n");
    sb.append("  tradeReady: ").append(tradeReady).append("\n");
    sb.append("  isDisabledAccount: ").append(isDisabledAccount).append("\n");
    sb.append("  faSecure: ").append(faSecure).append("\n");
    sb.append("  hasPhone: ").append(hasPhone).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
