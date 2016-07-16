package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Invoice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class Invoice   {
  
  private String address = null;
  private String buyerEmail = null;
  private String cancelURL = null;
  private String expireTime = null;
  private String succURL = null;
  private String invoiceID = null;
  private String bitpayInvoiceID = null;
  private String notifyEmail = null;
  private String status = null;
  private String time = null;
  private String fiatCents = null;
  private String satoshis = null;
  private String info = null;

  
  /**
   **/
  public Invoice address(String address) {
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
  public Invoice buyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("buyerEmail")
  public String getBuyerEmail() {
    return buyerEmail;
  }
  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }


  /**
   **/
  public Invoice cancelURL(String cancelURL) {
    this.cancelURL = cancelURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("cancelURL")
  public String getCancelURL() {
    return cancelURL;
  }
  public void setCancelURL(String cancelURL) {
    this.cancelURL = cancelURL;
  }


  /**
   **/
  public Invoice expireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("expireTime")
  public String getExpireTime() {
    return expireTime;
  }
  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }


  /**
   **/
  public Invoice succURL(String succURL) {
    this.succURL = succURL;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("succURL")
  public String getSuccURL() {
    return succURL;
  }
  public void setSuccURL(String succURL) {
    this.succURL = succURL;
  }


  /**
   **/
  public Invoice invoiceID(String invoiceID) {
    this.invoiceID = invoiceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("invoiceID")
  public String getInvoiceID() {
    return invoiceID;
  }
  public void setInvoiceID(String invoiceID) {
    this.invoiceID = invoiceID;
  }


  /**
   **/
  public Invoice bitpayInvoiceID(String bitpayInvoiceID) {
    this.bitpayInvoiceID = bitpayInvoiceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("bitpayInvoiceID")
  public String getBitpayInvoiceID() {
    return bitpayInvoiceID;
  }
  public void setBitpayInvoiceID(String bitpayInvoiceID) {
    this.bitpayInvoiceID = bitpayInvoiceID;
  }


  /**
   **/
  public Invoice notifyEmail(String notifyEmail) {
    this.notifyEmail = notifyEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("notifyEmail")
  public String getNotifyEmail() {
    return notifyEmail;
  }
  public void setNotifyEmail(String notifyEmail) {
    this.notifyEmail = notifyEmail;
  }


  /**
   **/
  public Invoice status(String status) {
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
  public Invoice time(String time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }


  /**
   **/
  public Invoice fiatCents(String fiatCents) {
    this.fiatCents = fiatCents;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiatCents")
  public String getFiatCents() {
    return fiatCents;
  }
  public void setFiatCents(String fiatCents) {
    this.fiatCents = fiatCents;
  }


  /**
   **/
  public Invoice satoshis(String satoshis) {
    this.satoshis = satoshis;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("satoshis")
  public String getSatoshis() {
    return satoshis;
  }
  public void setSatoshis(String satoshis) {
    this.satoshis = satoshis;
  }


  /**
   **/
  public Invoice info(String info) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.address, invoice.address) &&
        Objects.equals(this.buyerEmail, invoice.buyerEmail) &&
        Objects.equals(this.cancelURL, invoice.cancelURL) &&
        Objects.equals(this.expireTime, invoice.expireTime) &&
        Objects.equals(this.succURL, invoice.succURL) &&
        Objects.equals(this.invoiceID, invoice.invoiceID) &&
        Objects.equals(this.bitpayInvoiceID, invoice.bitpayInvoiceID) &&
        Objects.equals(this.notifyEmail, invoice.notifyEmail) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.time, invoice.time) &&
        Objects.equals(this.fiatCents, invoice.fiatCents) &&
        Objects.equals(this.satoshis, invoice.satoshis) &&
        Objects.equals(this.info, invoice.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, buyerEmail, cancelURL, expireTime, succURL, invoiceID, bitpayInvoiceID, notifyEmail, status, time, fiatCents, satoshis, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
    sb.append("    cancelURL: ").append(toIndentedString(cancelURL)).append("\n");
    sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
    sb.append("    succURL: ").append(toIndentedString(succURL)).append("\n");
    sb.append("    invoiceID: ").append(toIndentedString(invoiceID)).append("\n");
    sb.append("    bitpayInvoiceID: ").append(toIndentedString(bitpayInvoiceID)).append("\n");
    sb.append("    notifyEmail: ").append(toIndentedString(notifyEmail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    fiatCents: ").append(toIndentedString(fiatCents)).append("\n");
    sb.append("    satoshis: ").append(toIndentedString(satoshis)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

