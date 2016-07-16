package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NewFiatBankDeposit
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class NewFiatBankDeposit   {
  
  private Long amount = null;
  private String message = null;
  private String bank = null;
  private String depType = null;

  
  /**
   **/
  public NewFiatBankDeposit amount(Long amount) {
    this.amount = amount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("amount")
  public Long getAmount() {
    return amount;
  }
  public void setAmount(Long amount) {
    this.amount = amount;
  }


  /**
   **/
  public NewFiatBankDeposit message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   **/
  public NewFiatBankDeposit bank(String bank) {
    this.bank = bank;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bank")
  public String getBank() {
    return bank;
  }
  public void setBank(String bank) {
    this.bank = bank;
  }


  /**
   **/
  public NewFiatBankDeposit depType(String depType) {
    this.depType = depType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("depType")
  public String getDepType() {
    return depType;
  }
  public void setDepType(String depType) {
    this.depType = depType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewFiatBankDeposit newFiatBankDeposit = (NewFiatBankDeposit) o;
    return Objects.equals(this.amount, newFiatBankDeposit.amount) &&
        Objects.equals(this.message, newFiatBankDeposit.message) &&
        Objects.equals(this.bank, newFiatBankDeposit.bank) &&
        Objects.equals(this.depType, newFiatBankDeposit.depType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, message, bank, depType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewFiatBankDeposit {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    bank: ").append(toIndentedString(bank)).append("\n");
    sb.append("    depType: ").append(toIndentedString(depType)).append("\n");
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

