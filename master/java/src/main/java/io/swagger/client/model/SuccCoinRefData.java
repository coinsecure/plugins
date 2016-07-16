package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SuccCoinRefData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SuccCoinRefData   {
  
  private Double refPercent = null;
  private Long time = null;
  private String orderID = null;
  private String refID = null;
  private String tradeID = null;
  private String newUserIDMasked = null;
  private String depositID = null;
  private Long amtPaid = null;

  
  /**
   **/
  public SuccCoinRefData refPercent(Double refPercent) {
    this.refPercent = refPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refPercent")
  public Double getRefPercent() {
    return refPercent;
  }
  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }


  /**
   **/
  public SuccCoinRefData time(Long time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  /**
   **/
  public SuccCoinRefData orderID(String orderID) {
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
  public SuccCoinRefData refID(String refID) {
    this.refID = refID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refID")
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }


  /**
   **/
  public SuccCoinRefData tradeID(String tradeID) {
    this.tradeID = tradeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("tradeID")
  public String getTradeID() {
    return tradeID;
  }
  public void setTradeID(String tradeID) {
    this.tradeID = tradeID;
  }


  /**
   **/
  public SuccCoinRefData newUserIDMasked(String newUserIDMasked) {
    this.newUserIDMasked = newUserIDMasked;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("newUserIDMasked")
  public String getNewUserIDMasked() {
    return newUserIDMasked;
  }
  public void setNewUserIDMasked(String newUserIDMasked) {
    this.newUserIDMasked = newUserIDMasked;
  }


  /**
   **/
  public SuccCoinRefData depositID(String depositID) {
    this.depositID = depositID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("depositID")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }


  /**
   **/
  public SuccCoinRefData amtPaid(Long amtPaid) {
    this.amtPaid = amtPaid;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("amtPaid")
  public Long getAmtPaid() {
    return amtPaid;
  }
  public void setAmtPaid(Long amtPaid) {
    this.amtPaid = amtPaid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccCoinRefData succCoinRefData = (SuccCoinRefData) o;
    return Objects.equals(this.refPercent, succCoinRefData.refPercent) &&
        Objects.equals(this.time, succCoinRefData.time) &&
        Objects.equals(this.orderID, succCoinRefData.orderID) &&
        Objects.equals(this.refID, succCoinRefData.refID) &&
        Objects.equals(this.tradeID, succCoinRefData.tradeID) &&
        Objects.equals(this.newUserIDMasked, succCoinRefData.newUserIDMasked) &&
        Objects.equals(this.depositID, succCoinRefData.depositID) &&
        Objects.equals(this.amtPaid, succCoinRefData.amtPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPercent, time, orderID, refID, tradeID, newUserIDMasked, depositID, amtPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccCoinRefData {\n");
    
    sb.append("    refPercent: ").append(toIndentedString(refPercent)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    orderID: ").append(toIndentedString(orderID)).append("\n");
    sb.append("    refID: ").append(toIndentedString(refID)).append("\n");
    sb.append("    tradeID: ").append(toIndentedString(tradeID)).append("\n");
    sb.append("    newUserIDMasked: ").append(toIndentedString(newUserIDMasked)).append("\n");
    sb.append("    depositID: ").append(toIndentedString(depositID)).append("\n");
    sb.append("    amtPaid: ").append(toIndentedString(amtPaid)).append("\n");
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

