package io.swagger.client.model;

import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ValidAddressSearchData  {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("balance")
  private Long balance = null;
  @SerializedName("totalReceived")
  private Long totalReceived = null;
  @SerializedName("unconfirmedBalance")
  private Long unconfirmedBalance = null;
  @SerializedName("unconfirmedTxApperances")
  private Integer unconfirmedTxApperances = null;
  @SerializedName("txApperances")
  private Integer txApperances = null;
  @SerializedName("transactions")
  private List<String> transactions = null;

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
  public Long getBalance() {
    return balance;
  }
  public void setBalance(Long balance) {
    this.balance = balance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTotalReceived() {
    return totalReceived;
  }
  public void setTotalReceived(Long totalReceived) {
    this.totalReceived = totalReceived;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getUnconfirmedBalance() {
    return unconfirmedBalance;
  }
  public void setUnconfirmedBalance(Long unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getUnconfirmedTxApperances() {
    return unconfirmedTxApperances;
  }
  public void setUnconfirmedTxApperances(Integer unconfirmedTxApperances) {
    this.unconfirmedTxApperances = unconfirmedTxApperances;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getTxApperances() {
    return txApperances;
  }
  public void setTxApperances(Integer txApperances) {
    this.txApperances = txApperances;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<String> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidAddressSearchData validAddressSearchData = (ValidAddressSearchData) o;
    return (address == null ? validAddressSearchData.address == null : address.equals(validAddressSearchData.address)) &&
        (balance == null ? validAddressSearchData.balance == null : balance.equals(validAddressSearchData.balance)) &&
        (totalReceived == null ? validAddressSearchData.totalReceived == null : totalReceived.equals(validAddressSearchData.totalReceived)) &&
        (unconfirmedBalance == null ? validAddressSearchData.unconfirmedBalance == null : unconfirmedBalance.equals(validAddressSearchData.unconfirmedBalance)) &&
        (unconfirmedTxApperances == null ? validAddressSearchData.unconfirmedTxApperances == null : unconfirmedTxApperances.equals(validAddressSearchData.unconfirmedTxApperances)) &&
        (txApperances == null ? validAddressSearchData.txApperances == null : txApperances.equals(validAddressSearchData.txApperances)) &&
        (transactions == null ? validAddressSearchData.transactions == null : transactions.equals(validAddressSearchData.transactions));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (balance == null ? 0: balance.hashCode());
    result = 31 * result + (totalReceived == null ? 0: totalReceived.hashCode());
    result = 31 * result + (unconfirmedBalance == null ? 0: unconfirmedBalance.hashCode());
    result = 31 * result + (unconfirmedTxApperances == null ? 0: unconfirmedTxApperances.hashCode());
    result = 31 * result + (txApperances == null ? 0: txApperances.hashCode());
    result = 31 * result + (transactions == null ? 0: transactions.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidAddressSearchData {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  balance: ").append(balance).append("\n");
    sb.append("  totalReceived: ").append(totalReceived).append("\n");
    sb.append("  unconfirmedBalance: ").append(unconfirmedBalance).append("\n");
    sb.append("  unconfirmedTxApperances: ").append(unconfirmedTxApperances).append("\n");
    sb.append("  txApperances: ").append(txApperances).append("\n");
    sb.append("  transactions: ").append(transactions).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
