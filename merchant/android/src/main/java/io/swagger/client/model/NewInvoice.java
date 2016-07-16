package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NewInvoice  {
  
  @SerializedName("orderID")
  private String orderID = null;
  @SerializedName("fiat")
  private Long fiat = null;
  @SerializedName("succURL")
  private String succURL = null;
  @SerializedName("cancelURL")
  private String cancelURL = null;
  @SerializedName("buyerEmail")
  private String buyerEmail = null;
  @SerializedName("notifyEmail")
  private String notifyEmail = null;
  @SerializedName("info")
  private String info = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFiat() {
    return fiat;
  }
  public void setFiat(Long fiat) {
    this.fiat = fiat;
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
  public String getCancelURL() {
    return cancelURL;
  }
  public void setCancelURL(String cancelURL) {
    this.cancelURL = cancelURL;
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
  public String getNotifyEmail() {
    return notifyEmail;
  }
  public void setNotifyEmail(String notifyEmail) {
    this.notifyEmail = notifyEmail;
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
    NewInvoice newInvoice = (NewInvoice) o;
    return (orderID == null ? newInvoice.orderID == null : orderID.equals(newInvoice.orderID)) &&
        (fiat == null ? newInvoice.fiat == null : fiat.equals(newInvoice.fiat)) &&
        (succURL == null ? newInvoice.succURL == null : succURL.equals(newInvoice.succURL)) &&
        (cancelURL == null ? newInvoice.cancelURL == null : cancelURL.equals(newInvoice.cancelURL)) &&
        (buyerEmail == null ? newInvoice.buyerEmail == null : buyerEmail.equals(newInvoice.buyerEmail)) &&
        (notifyEmail == null ? newInvoice.notifyEmail == null : notifyEmail.equals(newInvoice.notifyEmail)) &&
        (info == null ? newInvoice.info == null : info.equals(newInvoice.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (orderID == null ? 0: orderID.hashCode());
    result = 31 * result + (fiat == null ? 0: fiat.hashCode());
    result = 31 * result + (succURL == null ? 0: succURL.hashCode());
    result = 31 * result + (cancelURL == null ? 0: cancelURL.hashCode());
    result = 31 * result + (buyerEmail == null ? 0: buyerEmail.hashCode());
    result = 31 * result + (notifyEmail == null ? 0: notifyEmail.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInvoice {\n");
    
    sb.append("  orderID: ").append(orderID).append("\n");
    sb.append("  fiat: ").append(fiat).append("\n");
    sb.append("  succURL: ").append(succURL).append("\n");
    sb.append("  cancelURL: ").append(cancelURL).append("\n");
    sb.append("  buyerEmail: ").append(buyerEmail).append("\n");
    sb.append("  notifyEmail: ").append(notifyEmail).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
