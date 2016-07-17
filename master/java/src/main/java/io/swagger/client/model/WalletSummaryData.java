package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WalletSummaryData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class WalletSummaryData   {
  
  private Long walletConfirmedBalance = null;
  private Long walletUncofirmedBalance = null;
  private Boolean hasWalletNetki = false;
  private String walletNetki = null;
  private String walletNetkiAddress = null;
  private String walletNetkiWalletId = null;

  
  /**
   **/
  public WalletSummaryData walletConfirmedBalance(Long walletConfirmedBalance) {
    this.walletConfirmedBalance = walletConfirmedBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletConfirmedBalance")
  public Long getWalletConfirmedBalance() {
    return walletConfirmedBalance;
  }
  public void setWalletConfirmedBalance(Long walletConfirmedBalance) {
    this.walletConfirmedBalance = walletConfirmedBalance;
  }


  /**
   **/
  public WalletSummaryData walletUncofirmedBalance(Long walletUncofirmedBalance) {
    this.walletUncofirmedBalance = walletUncofirmedBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletUncofirmedBalance")
  public Long getWalletUncofirmedBalance() {
    return walletUncofirmedBalance;
  }
  public void setWalletUncofirmedBalance(Long walletUncofirmedBalance) {
    this.walletUncofirmedBalance = walletUncofirmedBalance;
  }


  /**
   **/
  public WalletSummaryData hasWalletNetki(Boolean hasWalletNetki) {
    this.hasWalletNetki = hasWalletNetki;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hasWalletNetki")
  public Boolean getHasWalletNetki() {
    return hasWalletNetki;
  }
  public void setHasWalletNetki(Boolean hasWalletNetki) {
    this.hasWalletNetki = hasWalletNetki;
  }


  /**
   **/
  public WalletSummaryData walletNetki(String walletNetki) {
    this.walletNetki = walletNetki;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletNetki")
  public String getWalletNetki() {
    return walletNetki;
  }
  public void setWalletNetki(String walletNetki) {
    this.walletNetki = walletNetki;
  }


  /**
   **/
  public WalletSummaryData walletNetkiAddress(String walletNetkiAddress) {
    this.walletNetkiAddress = walletNetkiAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletNetkiAddress")
  public String getWalletNetkiAddress() {
    return walletNetkiAddress;
  }
  public void setWalletNetkiAddress(String walletNetkiAddress) {
    this.walletNetkiAddress = walletNetkiAddress;
  }


  /**
   **/
  public WalletSummaryData walletNetkiWalletId(String walletNetkiWalletId) {
    this.walletNetkiWalletId = walletNetkiWalletId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletNetkiWalletId")
  public String getWalletNetkiWalletId() {
    return walletNetkiWalletId;
  }
  public void setWalletNetkiWalletId(String walletNetkiWalletId) {
    this.walletNetkiWalletId = walletNetkiWalletId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletSummaryData walletSummaryData = (WalletSummaryData) o;
    return Objects.equals(this.walletConfirmedBalance, walletSummaryData.walletConfirmedBalance) &&
        Objects.equals(this.walletUncofirmedBalance, walletSummaryData.walletUncofirmedBalance) &&
        Objects.equals(this.hasWalletNetki, walletSummaryData.hasWalletNetki) &&
        Objects.equals(this.walletNetki, walletSummaryData.walletNetki) &&
        Objects.equals(this.walletNetkiAddress, walletSummaryData.walletNetkiAddress) &&
        Objects.equals(this.walletNetkiWalletId, walletSummaryData.walletNetkiWalletId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletConfirmedBalance, walletUncofirmedBalance, hasWalletNetki, walletNetki, walletNetkiAddress, walletNetkiWalletId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletSummaryData {\n");
    
    sb.append("    walletConfirmedBalance: ").append(toIndentedString(walletConfirmedBalance)).append("\n");
    sb.append("    walletUncofirmedBalance: ").append(toIndentedString(walletUncofirmedBalance)).append("\n");
    sb.append("    hasWalletNetki: ").append(toIndentedString(hasWalletNetki)).append("\n");
    sb.append("    walletNetki: ").append(toIndentedString(walletNetki)).append("\n");
    sb.append("    walletNetkiAddress: ").append(toIndentedString(walletNetkiAddress)).append("\n");
    sb.append("    walletNetkiWalletId: ").append(toIndentedString(walletNetkiWalletId)).append("\n");
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

