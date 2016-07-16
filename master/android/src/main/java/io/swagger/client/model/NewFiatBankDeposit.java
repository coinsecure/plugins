package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NewFiatBankDeposit  {
  
  @SerializedName("amount")
  private Long amount = null;
  @SerializedName("message")
  private String message = null;
  @SerializedName("bank")
  private String bank = null;
  @SerializedName("depType")
  private String depType = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDepType() {
    return depType;
  }
  public void setDepType(String depType) {
    this.depType = depType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewFiatBankDeposit newFiatBankDeposit = (NewFiatBankDeposit) o;
    return (amount == null ? newFiatBankDeposit.amount == null : amount.equals(newFiatBankDeposit.amount)) &&
        (message == null ? newFiatBankDeposit.message == null : message.equals(newFiatBankDeposit.message)) &&
        (bank == null ? newFiatBankDeposit.bank == null : bank.equals(newFiatBankDeposit.bank)) &&
        (depType == null ? newFiatBankDeposit.depType == null : depType.equals(newFiatBankDeposit.depType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (amount == null ? 0: amount.hashCode());
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (bank == null ? 0: bank.hashCode());
    result = 31 * result + (depType == null ? 0: depType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFiatBankDeposit {\n");
    
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  bank: ").append(bank).append("\n");
    sb.append("  depType: ").append(depType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
