package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Merchant
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class Merchant   {
  
  private String firstName = null;
  private String lastName = null;
  private Long coinBalance = null;
  private Long fiatBalance = null;
  private String merchantType = null;
  private String organization = null;
  private String status = null;
  private String website = null;
  private String address = null;
  private String adminEmail = null;
  private String businessType = null;
  private String info = null;
  private Long minCoinSettlement = null;
  private Long minFiatSettlement = null;
  private String tel = null;

  
  /**
   **/
  public Merchant firstName(String firstName) {
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
  public Merchant lastName(String lastName) {
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
  public Merchant coinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("coinBalance")
  public Long getCoinBalance() {
    return coinBalance;
  }
  public void setCoinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
  }


  /**
   **/
  public Merchant fiatBalance(Long fiatBalance) {
    this.fiatBalance = fiatBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiatBalance")
  public Long getFiatBalance() {
    return fiatBalance;
  }
  public void setFiatBalance(Long fiatBalance) {
    this.fiatBalance = fiatBalance;
  }


  /**
   **/
  public Merchant merchantType(String merchantType) {
    this.merchantType = merchantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("merchantType")
  public String getMerchantType() {
    return merchantType;
  }
  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  /**
   **/
  public Merchant organization(String organization) {
    this.organization = organization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("organization")
  public String getOrganization() {
    return organization;
  }
  public void setOrganization(String organization) {
    this.organization = organization;
  }


  /**
   **/
  public Merchant status(String status) {
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
  public Merchant website(String website) {
    this.website = website;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }


  /**
   **/
  public Merchant address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  /**
   **/
  public Merchant adminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("adminEmail")
  public String getAdminEmail() {
    return adminEmail;
  }
  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }


  /**
   **/
  public Merchant businessType(String businessType) {
    this.businessType = businessType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("businessType")
  public String getBusinessType() {
    return businessType;
  }
  public void setBusinessType(String businessType) {
    this.businessType = businessType;
  }


  /**
   **/
  public Merchant info(String info) {
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


  /**
   **/
  public Merchant minCoinSettlement(Long minCoinSettlement) {
    this.minCoinSettlement = minCoinSettlement;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("minCoinSettlement")
  public Long getMinCoinSettlement() {
    return minCoinSettlement;
  }
  public void setMinCoinSettlement(Long minCoinSettlement) {
    this.minCoinSettlement = minCoinSettlement;
  }


  /**
   **/
  public Merchant minFiatSettlement(Long minFiatSettlement) {
    this.minFiatSettlement = minFiatSettlement;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("minFiatSettlement")
  public Long getMinFiatSettlement() {
    return minFiatSettlement;
  }
  public void setMinFiatSettlement(Long minFiatSettlement) {
    this.minFiatSettlement = minFiatSettlement;
  }


  /**
   **/
  public Merchant tel(String tel) {
    this.tel = tel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tel")
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.firstName, merchant.firstName) &&
        Objects.equals(this.lastName, merchant.lastName) &&
        Objects.equals(this.coinBalance, merchant.coinBalance) &&
        Objects.equals(this.fiatBalance, merchant.fiatBalance) &&
        Objects.equals(this.merchantType, merchant.merchantType) &&
        Objects.equals(this.organization, merchant.organization) &&
        Objects.equals(this.status, merchant.status) &&
        Objects.equals(this.website, merchant.website) &&
        Objects.equals(this.address, merchant.address) &&
        Objects.equals(this.adminEmail, merchant.adminEmail) &&
        Objects.equals(this.businessType, merchant.businessType) &&
        Objects.equals(this.info, merchant.info) &&
        Objects.equals(this.minCoinSettlement, merchant.minCoinSettlement) &&
        Objects.equals(this.minFiatSettlement, merchant.minFiatSettlement) &&
        Objects.equals(this.tel, merchant.tel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, coinBalance, fiatBalance, merchantType, organization, status, website, address, adminEmail, businessType, info, minCoinSettlement, minFiatSettlement, tel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    coinBalance: ").append(toIndentedString(coinBalance)).append("\n");
    sb.append("    fiatBalance: ").append(toIndentedString(fiatBalance)).append("\n");
    sb.append("    merchantType: ").append(toIndentedString(merchantType)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    adminEmail: ").append(toIndentedString(adminEmail)).append("\n");
    sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    minCoinSettlement: ").append(toIndentedString(minCoinSettlement)).append("\n");
    sb.append("    minFiatSettlement: ").append(toIndentedString(minFiatSettlement)).append("\n");
    sb.append("    tel: ").append(toIndentedString(tel)).append("\n");
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

