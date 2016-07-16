package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class BankSummaryData  {
  
  @SerializedName("pendingCoinBalance")
  private Long pendingCoinBalance = null;
  @SerializedName("pendingFiatBalance")
  private Long pendingFiatBalance = null;
  @SerializedName("availableCoinBalance")
  private Long availableCoinBalance = null;
  @SerializedName("availableFiatBalance")
  private Long availableFiatBalance = null;
  @SerializedName("totalCoinBalance")
  private Long totalCoinBalance = null;
  @SerializedName("totalFiatBalance")
  private Long totalFiatBalance = null;
  @SerializedName("coinFeePercentage")
  private Double coinFeePercentage = null;
  @SerializedName("fiatFeePercentage")
  private Double fiatFeePercentage = null;
  @SerializedName("bankLinkStatus")
  private String bankLinkStatus = null;
  @SerializedName("hasTradeNetki")
  private Boolean hasTradeNetki = null;
  @SerializedName("tradeNetkiName")
  private String tradeNetkiName = null;
  @SerializedName("tradeNetkiAddress")
  private String tradeNetkiAddress = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingCoinBalance() {
    return pendingCoinBalance;
  }
  public void setPendingCoinBalance(Long pendingCoinBalance) {
    this.pendingCoinBalance = pendingCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingFiatBalance() {
    return pendingFiatBalance;
  }
  public void setPendingFiatBalance(Long pendingFiatBalance) {
    this.pendingFiatBalance = pendingFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAvailableCoinBalance() {
    return availableCoinBalance;
  }
  public void setAvailableCoinBalance(Long availableCoinBalance) {
    this.availableCoinBalance = availableCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAvailableFiatBalance() {
    return availableFiatBalance;
  }
  public void setAvailableFiatBalance(Long availableFiatBalance) {
    this.availableFiatBalance = availableFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalCoinBalance() {
    return totalCoinBalance;
  }
  public void setTotalCoinBalance(Long totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalFiatBalance() {
    return totalFiatBalance;
  }
  public void setTotalFiatBalance(Long totalFiatBalance) {
    this.totalFiatBalance = totalFiatBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getCoinFeePercentage() {
    return coinFeePercentage;
  }
  public void setCoinFeePercentage(Double coinFeePercentage) {
    this.coinFeePercentage = coinFeePercentage;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getFiatFeePercentage() {
    return fiatFeePercentage;
  }
  public void setFiatFeePercentage(Double fiatFeePercentage) {
    this.fiatFeePercentage = fiatFeePercentage;
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
  public Boolean getHasTradeNetki() {
    return hasTradeNetki;
  }
  public void setHasTradeNetki(Boolean hasTradeNetki) {
    this.hasTradeNetki = hasTradeNetki;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeNetkiName() {
    return tradeNetkiName;
  }
  public void setTradeNetkiName(String tradeNetkiName) {
    this.tradeNetkiName = tradeNetkiName;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTradeNetkiAddress() {
    return tradeNetkiAddress;
  }
  public void setTradeNetkiAddress(String tradeNetkiAddress) {
    this.tradeNetkiAddress = tradeNetkiAddress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankSummaryData bankSummaryData = (BankSummaryData) o;
    return (pendingCoinBalance == null ? bankSummaryData.pendingCoinBalance == null : pendingCoinBalance.equals(bankSummaryData.pendingCoinBalance)) &&
        (pendingFiatBalance == null ? bankSummaryData.pendingFiatBalance == null : pendingFiatBalance.equals(bankSummaryData.pendingFiatBalance)) &&
        (availableCoinBalance == null ? bankSummaryData.availableCoinBalance == null : availableCoinBalance.equals(bankSummaryData.availableCoinBalance)) &&
        (availableFiatBalance == null ? bankSummaryData.availableFiatBalance == null : availableFiatBalance.equals(bankSummaryData.availableFiatBalance)) &&
        (totalCoinBalance == null ? bankSummaryData.totalCoinBalance == null : totalCoinBalance.equals(bankSummaryData.totalCoinBalance)) &&
        (totalFiatBalance == null ? bankSummaryData.totalFiatBalance == null : totalFiatBalance.equals(bankSummaryData.totalFiatBalance)) &&
        (coinFeePercentage == null ? bankSummaryData.coinFeePercentage == null : coinFeePercentage.equals(bankSummaryData.coinFeePercentage)) &&
        (fiatFeePercentage == null ? bankSummaryData.fiatFeePercentage == null : fiatFeePercentage.equals(bankSummaryData.fiatFeePercentage)) &&
        (bankLinkStatus == null ? bankSummaryData.bankLinkStatus == null : bankLinkStatus.equals(bankSummaryData.bankLinkStatus)) &&
        (hasTradeNetki == null ? bankSummaryData.hasTradeNetki == null : hasTradeNetki.equals(bankSummaryData.hasTradeNetki)) &&
        (tradeNetkiName == null ? bankSummaryData.tradeNetkiName == null : tradeNetkiName.equals(bankSummaryData.tradeNetkiName)) &&
        (tradeNetkiAddress == null ? bankSummaryData.tradeNetkiAddress == null : tradeNetkiAddress.equals(bankSummaryData.tradeNetkiAddress));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (pendingCoinBalance == null ? 0: pendingCoinBalance.hashCode());
    result = 31 * result + (pendingFiatBalance == null ? 0: pendingFiatBalance.hashCode());
    result = 31 * result + (availableCoinBalance == null ? 0: availableCoinBalance.hashCode());
    result = 31 * result + (availableFiatBalance == null ? 0: availableFiatBalance.hashCode());
    result = 31 * result + (totalCoinBalance == null ? 0: totalCoinBalance.hashCode());
    result = 31 * result + (totalFiatBalance == null ? 0: totalFiatBalance.hashCode());
    result = 31 * result + (coinFeePercentage == null ? 0: coinFeePercentage.hashCode());
    result = 31 * result + (fiatFeePercentage == null ? 0: fiatFeePercentage.hashCode());
    result = 31 * result + (bankLinkStatus == null ? 0: bankLinkStatus.hashCode());
    result = 31 * result + (hasTradeNetki == null ? 0: hasTradeNetki.hashCode());
    result = 31 * result + (tradeNetkiName == null ? 0: tradeNetkiName.hashCode());
    result = 31 * result + (tradeNetkiAddress == null ? 0: tradeNetkiAddress.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankSummaryData {\n");
    
    sb.append("  pendingCoinBalance: ").append(pendingCoinBalance).append("\n");
    sb.append("  pendingFiatBalance: ").append(pendingFiatBalance).append("\n");
    sb.append("  availableCoinBalance: ").append(availableCoinBalance).append("\n");
    sb.append("  availableFiatBalance: ").append(availableFiatBalance).append("\n");
    sb.append("  totalCoinBalance: ").append(totalCoinBalance).append("\n");
    sb.append("  totalFiatBalance: ").append(totalFiatBalance).append("\n");
    sb.append("  coinFeePercentage: ").append(coinFeePercentage).append("\n");
    sb.append("  fiatFeePercentage: ").append(fiatFeePercentage).append("\n");
    sb.append("  bankLinkStatus: ").append(bankLinkStatus).append("\n");
    sb.append("  hasTradeNetki: ").append(hasTradeNetki).append("\n");
    sb.append("  tradeNetkiName: ").append(tradeNetkiName).append("\n");
    sb.append("  tradeNetkiAddress: ").append(tradeNetkiAddress).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
