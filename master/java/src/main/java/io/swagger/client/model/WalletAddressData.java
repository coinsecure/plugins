package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * WalletAddressData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class WalletAddressData   {
  
  private String walletID = null;
  private String address = null;
  private Long time = null;
  private String info = null;
  private Integer minConf = null;
  private String netki = null;

  
  /**
   **/
  public WalletAddressData walletID(String walletID) {
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
  public WalletAddressData address(String address) {
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
  public WalletAddressData time(Long time) {
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
  public WalletAddressData info(String info) {
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
  public WalletAddressData minConf(Integer minConf) {
    this.minConf = minConf;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("minConf")
  public Integer getMinConf() {
    return minConf;
  }
  public void setMinConf(Integer minConf) {
    this.minConf = minConf;
  }


  /**
   **/
  public WalletAddressData netki(String netki) {
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
    WalletAddressData walletAddressData = (WalletAddressData) o;
    return Objects.equals(this.walletID, walletAddressData.walletID) &&
        Objects.equals(this.address, walletAddressData.address) &&
        Objects.equals(this.time, walletAddressData.time) &&
        Objects.equals(this.info, walletAddressData.info) &&
        Objects.equals(this.minConf, walletAddressData.minConf) &&
        Objects.equals(this.netki, walletAddressData.netki);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletID, address, time, info, minConf, netki);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAddressData {\n");
    
    sb.append("    walletID: ").append(toIndentedString(walletID)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    minConf: ").append(toIndentedString(minConf)).append("\n");
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

