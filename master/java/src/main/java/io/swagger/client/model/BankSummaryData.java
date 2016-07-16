package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * BankSummaryData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class BankSummaryData   {
  
  private Long pendingCoinBalance = null;
  private Long pendingFiatBalance = null;
  private Long availableCoinBalance = null;
  private Long availableFiatBalance = null;
  private Long totalCoinBalance = null;
  private Long totalFiatBalance = null;
  private Double coinFeePercentage = null;
  private Double fiatFeePercentage = null;
  private String bankLinkStatus = null;
  private Boolean hasTradeNetki = false;
  private String tradeNetkiName = null;
  private String tradeNetkiAddress = null;

  
  /**
   **/
  public BankSummaryData pendingCoinBalance(Long pendingCoinBalance) {
    this.pendingCoinBalance = pendingCoinBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pendingCoinBalance")
  public Long getPendingCoinBalance() {
    return pendingCoinBalance;
  }
  public void setPendingCoinBalance(Long pendingCoinBalance) {
    this.pendingCoinBalance = pendingCoinBalance;
  }


  /**
   **/
  public BankSummaryData pendingFiatBalance(Long pendingFiatBalance) {
    this.pendingFiatBalance = pendingFiatBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pendingFiatBalance")
  public Long getPendingFiatBalance() {
    return pendingFiatBalance;
  }
  public void setPendingFiatBalance(Long pendingFiatBalance) {
    this.pendingFiatBalance = pendingFiatBalance;
  }


  /**
   **/
  public BankSummaryData availableCoinBalance(Long availableCoinBalance) {
    this.availableCoinBalance = availableCoinBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("availableCoinBalance")
  public Long getAvailableCoinBalance() {
    return availableCoinBalance;
  }
  public void setAvailableCoinBalance(Long availableCoinBalance) {
    this.availableCoinBalance = availableCoinBalance;
  }


  /**
   **/
  public BankSummaryData availableFiatBalance(Long availableFiatBalance) {
    this.availableFiatBalance = availableFiatBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("availableFiatBalance")
  public Long getAvailableFiatBalance() {
    return availableFiatBalance;
  }
  public void setAvailableFiatBalance(Long availableFiatBalance) {
    this.availableFiatBalance = availableFiatBalance;
  }


  /**
   **/
  public BankSummaryData totalCoinBalance(Long totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("totalCoinBalance")
  public Long getTotalCoinBalance() {
    return totalCoinBalance;
  }
  public void setTotalCoinBalance(Long totalCoinBalance) {
    this.totalCoinBalance = totalCoinBalance;
  }


  /**
   **/
  public BankSummaryData totalFiatBalance(Long totalFiatBalance) {
    this.totalFiatBalance = totalFiatBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("totalFiatBalance")
  public Long getTotalFiatBalance() {
    return totalFiatBalance;
  }
  public void setTotalFiatBalance(Long totalFiatBalance) {
    this.totalFiatBalance = totalFiatBalance;
  }


  /**
   **/
  public BankSummaryData coinFeePercentage(Double coinFeePercentage) {
    this.coinFeePercentage = coinFeePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("coinFeePercentage")
  public Double getCoinFeePercentage() {
    return coinFeePercentage;
  }
  public void setCoinFeePercentage(Double coinFeePercentage) {
    this.coinFeePercentage = coinFeePercentage;
  }


  /**
   **/
  public BankSummaryData fiatFeePercentage(Double fiatFeePercentage) {
    this.fiatFeePercentage = fiatFeePercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiatFeePercentage")
  public Double getFiatFeePercentage() {
    return fiatFeePercentage;
  }
  public void setFiatFeePercentage(Double fiatFeePercentage) {
    this.fiatFeePercentage = fiatFeePercentage;
  }


  /**
   **/
  public BankSummaryData bankLinkStatus(String bankLinkStatus) {
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
  public BankSummaryData hasTradeNetki(Boolean hasTradeNetki) {
    this.hasTradeNetki = hasTradeNetki;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("hasTradeNetki")
  public Boolean getHasTradeNetki() {
    return hasTradeNetki;
  }
  public void setHasTradeNetki(Boolean hasTradeNetki) {
    this.hasTradeNetki = hasTradeNetki;
  }


  /**
   **/
  public BankSummaryData tradeNetkiName(String tradeNetkiName) {
    this.tradeNetkiName = tradeNetkiName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tradeNetkiName")
  public String getTradeNetkiName() {
    return tradeNetkiName;
  }
  public void setTradeNetkiName(String tradeNetkiName) {
    this.tradeNetkiName = tradeNetkiName;
  }


  /**
   **/
  public BankSummaryData tradeNetkiAddress(String tradeNetkiAddress) {
    this.tradeNetkiAddress = tradeNetkiAddress;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tradeNetkiAddress")
  public String getTradeNetkiAddress() {
    return tradeNetkiAddress;
  }
  public void setTradeNetkiAddress(String tradeNetkiAddress) {
    this.tradeNetkiAddress = tradeNetkiAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankSummaryData bankSummaryData = (BankSummaryData) o;
    return Objects.equals(this.pendingCoinBalance, bankSummaryData.pendingCoinBalance) &&
        Objects.equals(this.pendingFiatBalance, bankSummaryData.pendingFiatBalance) &&
        Objects.equals(this.availableCoinBalance, bankSummaryData.availableCoinBalance) &&
        Objects.equals(this.availableFiatBalance, bankSummaryData.availableFiatBalance) &&
        Objects.equals(this.totalCoinBalance, bankSummaryData.totalCoinBalance) &&
        Objects.equals(this.totalFiatBalance, bankSummaryData.totalFiatBalance) &&
        Objects.equals(this.coinFeePercentage, bankSummaryData.coinFeePercentage) &&
        Objects.equals(this.fiatFeePercentage, bankSummaryData.fiatFeePercentage) &&
        Objects.equals(this.bankLinkStatus, bankSummaryData.bankLinkStatus) &&
        Objects.equals(this.hasTradeNetki, bankSummaryData.hasTradeNetki) &&
        Objects.equals(this.tradeNetkiName, bankSummaryData.tradeNetkiName) &&
        Objects.equals(this.tradeNetkiAddress, bankSummaryData.tradeNetkiAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pendingCoinBalance, pendingFiatBalance, availableCoinBalance, availableFiatBalance, totalCoinBalance, totalFiatBalance, coinFeePercentage, fiatFeePercentage, bankLinkStatus, hasTradeNetki, tradeNetkiName, tradeNetkiAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankSummaryData {\n");
    
    sb.append("    pendingCoinBalance: ").append(toIndentedString(pendingCoinBalance)).append("\n");
    sb.append("    pendingFiatBalance: ").append(toIndentedString(pendingFiatBalance)).append("\n");
    sb.append("    availableCoinBalance: ").append(toIndentedString(availableCoinBalance)).append("\n");
    sb.append("    availableFiatBalance: ").append(toIndentedString(availableFiatBalance)).append("\n");
    sb.append("    totalCoinBalance: ").append(toIndentedString(totalCoinBalance)).append("\n");
    sb.append("    totalFiatBalance: ").append(toIndentedString(totalFiatBalance)).append("\n");
    sb.append("    coinFeePercentage: ").append(toIndentedString(coinFeePercentage)).append("\n");
    sb.append("    fiatFeePercentage: ").append(toIndentedString(fiatFeePercentage)).append("\n");
    sb.append("    bankLinkStatus: ").append(toIndentedString(bankLinkStatus)).append("\n");
    sb.append("    hasTradeNetki: ").append(toIndentedString(hasTradeNetki)).append("\n");
    sb.append("    tradeNetkiName: ").append(toIndentedString(tradeNetkiName)).append("\n");
    sb.append("    tradeNetkiAddress: ").append(toIndentedString(tradeNetkiAddress)).append("\n");
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

