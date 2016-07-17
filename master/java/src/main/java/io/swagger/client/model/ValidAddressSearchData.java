package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ValidAddressSearchData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class ValidAddressSearchData   {
  
  private String address = null;
  private Long balance = null;
  private Long totalReceived = null;
  private Long unconfirmedBalance = null;
  private Integer unconfirmedTxApperances = null;
  private Integer txApperances = null;
  private List<String> transactions = new ArrayList<String>();

  
  /**
   **/
  public ValidAddressSearchData address(String address) {
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
  public ValidAddressSearchData balance(Long balance) {
    this.balance = balance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("balance")
  public Long getBalance() {
    return balance;
  }
  public void setBalance(Long balance) {
    this.balance = balance;
  }


  /**
   **/
  public ValidAddressSearchData totalReceived(Long totalReceived) {
    this.totalReceived = totalReceived;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("totalReceived")
  public Long getTotalReceived() {
    return totalReceived;
  }
  public void setTotalReceived(Long totalReceived) {
    this.totalReceived = totalReceived;
  }


  /**
   **/
  public ValidAddressSearchData unconfirmedBalance(Long unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unconfirmedBalance")
  public Long getUnconfirmedBalance() {
    return unconfirmedBalance;
  }
  public void setUnconfirmedBalance(Long unconfirmedBalance) {
    this.unconfirmedBalance = unconfirmedBalance;
  }


  /**
   **/
  public ValidAddressSearchData unconfirmedTxApperances(Integer unconfirmedTxApperances) {
    this.unconfirmedTxApperances = unconfirmedTxApperances;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("unconfirmedTxApperances")
  public Integer getUnconfirmedTxApperances() {
    return unconfirmedTxApperances;
  }
  public void setUnconfirmedTxApperances(Integer unconfirmedTxApperances) {
    this.unconfirmedTxApperances = unconfirmedTxApperances;
  }


  /**
   **/
  public ValidAddressSearchData txApperances(Integer txApperances) {
    this.txApperances = txApperances;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("txApperances")
  public Integer getTxApperances() {
    return txApperances;
  }
  public void setTxApperances(Integer txApperances) {
    this.txApperances = txApperances;
  }


  /**
   **/
  public ValidAddressSearchData transactions(List<String> transactions) {
    this.transactions = transactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("transactions")
  public List<String> getTransactions() {
    return transactions;
  }
  public void setTransactions(List<String> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidAddressSearchData validAddressSearchData = (ValidAddressSearchData) o;
    return Objects.equals(this.address, validAddressSearchData.address) &&
        Objects.equals(this.balance, validAddressSearchData.balance) &&
        Objects.equals(this.totalReceived, validAddressSearchData.totalReceived) &&
        Objects.equals(this.unconfirmedBalance, validAddressSearchData.unconfirmedBalance) &&
        Objects.equals(this.unconfirmedTxApperances, validAddressSearchData.unconfirmedTxApperances) &&
        Objects.equals(this.txApperances, validAddressSearchData.txApperances) &&
        Objects.equals(this.transactions, validAddressSearchData.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, balance, totalReceived, unconfirmedBalance, unconfirmedTxApperances, txApperances, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidAddressSearchData {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    totalReceived: ").append(toIndentedString(totalReceived)).append("\n");
    sb.append("    unconfirmedBalance: ").append(toIndentedString(unconfirmedBalance)).append("\n");
    sb.append("    unconfirmedTxApperances: ").append(toIndentedString(unconfirmedTxApperances)).append("\n");
    sb.append("    txApperances: ").append(toIndentedString(txApperances)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

