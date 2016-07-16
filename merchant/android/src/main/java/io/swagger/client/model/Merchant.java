package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Merchant  {
  
  @SerializedName("firstName")
  private String firstName = null;
  @SerializedName("lastName")
  private String lastName = null;
  @SerializedName("coinBalance")
  private Long coinBalance = null;
  @SerializedName("fiatBalance")
  private Long fiatBalance = null;
  @SerializedName("merchantType")
  private String merchantType = null;
  @SerializedName("organization")
  private String organization = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("website")
  private String website = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("adminEmail")
  private String adminEmail = null;
  @SerializedName("businessType")
  private String businessType = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("minCoinSettlement")
  private Long minCoinSettlement = null;
  @SerializedName("minFiatSettlement")
  private Long minFiatSettlement = null;
  @SerializedName("tel")
  private String tel = null;

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
  public Long getCoinBalance() {
    return coinBalance;
  }
  public void setCoinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFiatBalance() {
    return fiatBalance;
  }
  public void setFiatBalance(Long fiatBalance) {
    this.fiatBalance = fiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMerchantType() {
    return merchantType;
  }
  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
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
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAdminEmail() {
    return adminEmail;
  }
  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBusinessType() {
    return businessType;
  }
  public void setBusinessType(String businessType) {
    this.businessType = businessType;
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMinCoinSettlement() {
    return minCoinSettlement;
  }
  public void setMinCoinSettlement(Long minCoinSettlement) {
    this.minCoinSettlement = minCoinSettlement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMinFiatSettlement() {
    return minFiatSettlement;
  }
  public void setMinFiatSettlement(Long minFiatSettlement) {
    this.minFiatSettlement = minFiatSettlement;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return (firstName == null ? merchant.firstName == null : firstName.equals(merchant.firstName)) &&
        (lastName == null ? merchant.lastName == null : lastName.equals(merchant.lastName)) &&
        (coinBalance == null ? merchant.coinBalance == null : coinBalance.equals(merchant.coinBalance)) &&
        (fiatBalance == null ? merchant.fiatBalance == null : fiatBalance.equals(merchant.fiatBalance)) &&
        (merchantType == null ? merchant.merchantType == null : merchantType.equals(merchant.merchantType)) &&
        (organization == null ? merchant.organization == null : organization.equals(merchant.organization)) &&
        (status == null ? merchant.status == null : status.equals(merchant.status)) &&
        (website == null ? merchant.website == null : website.equals(merchant.website)) &&
        (address == null ? merchant.address == null : address.equals(merchant.address)) &&
        (adminEmail == null ? merchant.adminEmail == null : adminEmail.equals(merchant.adminEmail)) &&
        (businessType == null ? merchant.businessType == null : businessType.equals(merchant.businessType)) &&
        (info == null ? merchant.info == null : info.equals(merchant.info)) &&
        (minCoinSettlement == null ? merchant.minCoinSettlement == null : minCoinSettlement.equals(merchant.minCoinSettlement)) &&
        (minFiatSettlement == null ? merchant.minFiatSettlement == null : minFiatSettlement.equals(merchant.minFiatSettlement)) &&
        (tel == null ? merchant.tel == null : tel.equals(merchant.tel));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (firstName == null ? 0: firstName.hashCode());
    result = 31 * result + (lastName == null ? 0: lastName.hashCode());
    result = 31 * result + (coinBalance == null ? 0: coinBalance.hashCode());
    result = 31 * result + (fiatBalance == null ? 0: fiatBalance.hashCode());
    result = 31 * result + (merchantType == null ? 0: merchantType.hashCode());
    result = 31 * result + (organization == null ? 0: organization.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (website == null ? 0: website.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (adminEmail == null ? 0: adminEmail.hashCode());
    result = 31 * result + (businessType == null ? 0: businessType.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (minCoinSettlement == null ? 0: minCoinSettlement.hashCode());
    result = 31 * result + (minFiatSettlement == null ? 0: minFiatSettlement.hashCode());
    result = 31 * result + (tel == null ? 0: tel.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  coinBalance: ").append(coinBalance).append("\n");
    sb.append("  fiatBalance: ").append(fiatBalance).append("\n");
    sb.append("  merchantType: ").append(merchantType).append("\n");
    sb.append("  organization: ").append(organization).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  website: ").append(website).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  adminEmail: ").append(adminEmail).append("\n");
    sb.append("  businessType: ").append(businessType).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  minCoinSettlement: ").append(minCoinSettlement).append("\n");
    sb.append("  minFiatSettlement: ").append(minFiatSettlement).append("\n");
    sb.append("  tel: ").append(tel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
