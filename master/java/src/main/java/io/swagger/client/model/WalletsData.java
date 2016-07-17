package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WalletsData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class WalletsData   {
  
  private String walletID = null;
  private String name = null;
  private Long coinBalance = null;
  private Long time = null;
  private String info = null;
  private String netki = null;

  
  /**
   **/
  public WalletsData walletID(String walletID) {
    this.walletID = walletID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletID")
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }


  /**
   **/
  public WalletsData name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public WalletsData coinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("coinBalance")
  public Long getCoinBalance() {
    return coinBalance;
  }
  public void setCoinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
  }


  /**
   **/
  public WalletsData time(Long time) {
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
  public WalletsData info(String info) {
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


  /**
   **/
  public WalletsData netki(String netki) {
    this.netki = netki;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("netki")
  public String getNetki() {
    return netki;
  }
  public void setNetki(String netki) {
    this.netki = netki;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletsData walletsData = (WalletsData) o;
    return Objects.equals(this.walletID, walletsData.walletID) &&
        Objects.equals(this.name, walletsData.name) &&
        Objects.equals(this.coinBalance, walletsData.coinBalance) &&
        Objects.equals(this.time, walletsData.time) &&
        Objects.equals(this.info, walletsData.info) &&
        Objects.equals(this.netki, walletsData.netki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletID, name, coinBalance, time, info, netki);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletsData {\n");
    
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    coinBalance: ").append(toIndentedString(coinBalance)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    netki: ").append(toIndentedString(netki)).append("\n");
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

