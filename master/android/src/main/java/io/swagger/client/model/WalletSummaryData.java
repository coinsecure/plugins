package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WalletSummaryData  {
  
  @SerializedName("walletConfirmedBalance")
  private Long walletConfirmedBalance = null;
  @SerializedName("walletUncofirmedBalance")
  private Long walletUncofirmedBalance = null;
  @SerializedName("hasWalletNetki")
  private Boolean hasWalletNetki = null;
  @SerializedName("walletNetki")
  private String walletNetki = null;
  @SerializedName("walletNetkiAddress")
  private String walletNetkiAddress = null;
  @SerializedName("walletNetkiWalletId")
  private String walletNetkiWalletId = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getWalletConfirmedBalance() {
    return walletConfirmedBalance;
  }
  public void setWalletConfirmedBalance(Long walletConfirmedBalance) {
    this.walletConfirmedBalance = walletConfirmedBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getWalletUncofirmedBalance() {
    return walletUncofirmedBalance;
  }
  public void setWalletUncofirmedBalance(Long walletUncofirmedBalance) {
    this.walletUncofirmedBalance = walletUncofirmedBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getHasWalletNetki() {
    return hasWalletNetki;
  }
  public void setHasWalletNetki(Boolean hasWalletNetki) {
    this.hasWalletNetki = hasWalletNetki;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletNetki() {
    return walletNetki;
  }
  public void setWalletNetki(String walletNetki) {
    this.walletNetki = walletNetki;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletNetkiAddress() {
    return walletNetkiAddress;
  }
  public void setWalletNetkiAddress(String walletNetkiAddress) {
    this.walletNetkiAddress = walletNetkiAddress;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletNetkiWalletId() {
    return walletNetkiWalletId;
  }
  public void setWalletNetkiWalletId(String walletNetkiWalletId) {
    this.walletNetkiWalletId = walletNetkiWalletId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletSummaryData walletSummaryData = (WalletSummaryData) o;
    return (walletConfirmedBalance == null ? walletSummaryData.walletConfirmedBalance == null : walletConfirmedBalance.equals(walletSummaryData.walletConfirmedBalance)) &&
        (walletUncofirmedBalance == null ? walletSummaryData.walletUncofirmedBalance == null : walletUncofirmedBalance.equals(walletSummaryData.walletUncofirmedBalance)) &&
        (hasWalletNetki == null ? walletSummaryData.hasWalletNetki == null : hasWalletNetki.equals(walletSummaryData.hasWalletNetki)) &&
        (walletNetki == null ? walletSummaryData.walletNetki == null : walletNetki.equals(walletSummaryData.walletNetki)) &&
        (walletNetkiAddress == null ? walletSummaryData.walletNetkiAddress == null : walletNetkiAddress.equals(walletSummaryData.walletNetkiAddress)) &&
        (walletNetkiWalletId == null ? walletSummaryData.walletNetkiWalletId == null : walletNetkiWalletId.equals(walletSummaryData.walletNetkiWalletId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletConfirmedBalance == null ? 0: walletConfirmedBalance.hashCode());
    result = 31 * result + (walletUncofirmedBalance == null ? 0: walletUncofirmedBalance.hashCode());
    result = 31 * result + (hasWalletNetki == null ? 0: hasWalletNetki.hashCode());
    result = 31 * result + (walletNetki == null ? 0: walletNetki.hashCode());
    result = 31 * result + (walletNetkiAddress == null ? 0: walletNetkiAddress.hashCode());
    result = 31 * result + (walletNetkiWalletId == null ? 0: walletNetkiWalletId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletSummaryData {\n");
    
    sb.append("  walletConfirmedBalance: ").append(walletConfirmedBalance).append("\n");
    sb.append("  walletUncofirmedBalance: ").append(walletUncofirmedBalance).append("\n");
    sb.append("  hasWalletNetki: ").append(hasWalletNetki).append("\n");
    sb.append("  walletNetki: ").append(walletNetki).append("\n");
    sb.append("  walletNetkiAddress: ").append(walletNetkiAddress).append("\n");
    sb.append("  walletNetkiWalletId: ").append(walletNetkiWalletId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
