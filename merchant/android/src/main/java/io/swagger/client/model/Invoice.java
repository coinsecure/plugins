package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class Invoice  {
  
  @SerializedName("address")
  private String address = null;
  @SerializedName("buyerEmail")
  private String buyerEmail = null;
  @SerializedName("cancelURL")
  private String cancelURL = null;
  @SerializedName("expireTime")
  private String expireTime = null;
  @SerializedName("succURL")
  private String succURL = null;
  @SerializedName("invoiceID")
  private String invoiceID = null;
  @SerializedName("bitpayInvoiceID")
  private String bitpayInvoiceID = null;
  @SerializedName("notifyEmail")
  private String notifyEmail = null;
  @SerializedName("status")
  private String status = null;
  @SerializedName("time")
  private String time = null;
  @SerializedName("fiatCents")
  private String fiatCents = null;
  @SerializedName("satoshis")
  private String satoshis = null;
  @SerializedName("info")
  private String info = null;

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
  public String getBuyerEmail() {
    return buyerEmail;
  }
  public void setBuyerEmail(String buyerEmail) {
    this.buyerEmail = buyerEmail;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCancelURL() {
    return cancelURL;
  }
  public void setCancelURL(String cancelURL) {
    this.cancelURL = cancelURL;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getExpireTime() {
    return expireTime;
  }
  public void setExpireTime(String expireTime) {
    this.expireTime = expireTime;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSuccURL() {
    return succURL;
  }
  public void setSuccURL(String succURL) {
    this.succURL = succURL;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInvoiceID() {
    return invoiceID;
  }
  public void setInvoiceID(String invoiceID) {
    this.invoiceID = invoiceID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBitpayInvoiceID() {
    return bitpayInvoiceID;
  }
  public void setBitpayInvoiceID(String bitpayInvoiceID) {
    this.bitpayInvoiceID = bitpayInvoiceID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNotifyEmail() {
    return notifyEmail;
  }
  public void setNotifyEmail(String notifyEmail) {
    this.notifyEmail = notifyEmail;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTime() {
    return time;
  }
  public void setTime(String time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getFiatCents() {
    return fiatCents;
  }
  public void setFiatCents(String fiatCents) {
    this.fiatCents = fiatCents;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getSatoshis() {
    return satoshis;
  }
  public void setSatoshis(String satoshis) {
    this.satoshis = satoshis;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getInfo() {
    return info;
  }
  public void setInfo(String info) {
    this.info = info;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return (address == null ? invoice.address == null : address.equals(invoice.address)) &&
        (buyerEmail == null ? invoice.buyerEmail == null : buyerEmail.equals(invoice.buyerEmail)) &&
        (cancelURL == null ? invoice.cancelURL == null : cancelURL.equals(invoice.cancelURL)) &&
        (expireTime == null ? invoice.expireTime == null : expireTime.equals(invoice.expireTime)) &&
        (succURL == null ? invoice.succURL == null : succURL.equals(invoice.succURL)) &&
        (invoiceID == null ? invoice.invoiceID == null : invoiceID.equals(invoice.invoiceID)) &&
        (bitpayInvoiceID == null ? invoice.bitpayInvoiceID == null : bitpayInvoiceID.equals(invoice.bitpayInvoiceID)) &&
        (notifyEmail == null ? invoice.notifyEmail == null : notifyEmail.equals(invoice.notifyEmail)) &&
        (status == null ? invoice.status == null : status.equals(invoice.status)) &&
        (time == null ? invoice.time == null : time.equals(invoice.time)) &&
        (fiatCents == null ? invoice.fiatCents == null : fiatCents.equals(invoice.fiatCents)) &&
        (satoshis == null ? invoice.satoshis == null : satoshis.equals(invoice.satoshis)) &&
        (info == null ? invoice.info == null : info.equals(invoice.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (buyerEmail == null ? 0: buyerEmail.hashCode());
    result = 31 * result + (cancelURL == null ? 0: cancelURL.hashCode());
    result = 31 * result + (expireTime == null ? 0: expireTime.hashCode());
    result = 31 * result + (succURL == null ? 0: succURL.hashCode());
    result = 31 * result + (invoiceID == null ? 0: invoiceID.hashCode());
    result = 31 * result + (bitpayInvoiceID == null ? 0: bitpayInvoiceID.hashCode());
    result = 31 * result + (notifyEmail == null ? 0: notifyEmail.hashCode());
    result = 31 * result + (status == null ? 0: status.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (fiatCents == null ? 0: fiatCents.hashCode());
    result = 31 * result + (satoshis == null ? 0: satoshis.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("  address: ").append(address).append("\n");
    sb.append("  buyerEmail: ").append(buyerEmail).append("\n");
    sb.append("  cancelURL: ").append(cancelURL).append("\n");
    sb.append("  expireTime: ").append(expireTime).append("\n");
    sb.append("  succURL: ").append(succURL).append("\n");
    sb.append("  invoiceID: ").append(invoiceID).append("\n");
    sb.append("  bitpayInvoiceID: ").append(bitpayInvoiceID).append("\n");
    sb.append("  notifyEmail: ").append(notifyEmail).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  fiatCents: ").append(fiatCents).append("\n");
    sb.append("  satoshis: ").append(satoshis).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
