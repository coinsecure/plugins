package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NewInvoice
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class NewInvoice   {
  
  private String orderID = null;
  private Long fiat = null;
  private String succURL = null;
  private String cancelURL = null;
  private String buyerEmail = null;
  private String notifyEmail = null;
  private String info = null;

  
  /**
   **/
  public NewInvoice orderID(String orderID) {
    this.orderID = orderID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("orderID")
  public String getOrderID() {
    return orderID;
  }
  public void setOrderID(String orderID) {
    this.orderID = orderID;
  }


  /**
   **/
  public NewInvoice fiat(Long fiat) {
    this.fiat = fiat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiat")
  public Long getFiat() {
    return fiat;
  }
  public void setFiat(Long fiat) {
    this.fiat = fiat;
  }


  /**
   **/
  public NewInvoice succURL(String succURL) {
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
  public NewInvoice cancelURL(String cancelURL) {
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
  public NewInvoice buyerEmail(String buyerEmail) {
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
  public NewInvoice notifyEmail(String notifyEmail) {
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
  public NewInvoice info(String info) {
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
    NewInvoice newInvoice = (NewInvoice) o;
    return Objects.equals(this.orderID, newInvoice.orderID) &&
        Objects.equals(this.fiat, newInvoice.fiat) &&
        Objects.equals(this.succURL, newInvoice.succURL) &&
        Objects.equals(this.cancelURL, newInvoice.cancelURL) &&
        Objects.equals(this.buyerEmail, newInvoice.buyerEmail) &&
        Objects.equals(this.notifyEmail, newInvoice.notifyEmail) &&
        Objects.equals(this.info, newInvoice.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderID, fiat, succURL, cancelURL, buyerEmail, notifyEmail, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewInvoice {\n");
    
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    fiat: ").append(toIndentedString(fiat)).append("\n");
    sb.append("    succURL: ").append(toIndentedString(succURL)).append("\n");
    sb.append("    cancelURL: ").append(toIndentedString(cancelURL)).append("\n");
    sb.append("    buyerEmail: ").append(toIndentedString(buyerEmail)).append("\n");
    sb.append("    notifyEmail: ").append(toIndentedString(notifyEmail)).append("\n");
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

