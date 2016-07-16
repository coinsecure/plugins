package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WalletAddressData  {
  
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("address")
  private String address = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("info")
  private String info = null;
  @SerializedName("minConf")
  private Integer minConf = null;
  @SerializedName("netki")
  private String netki = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletID() {
    return walletID;
  }
  public void setWalletID(String walletID) {
    this.walletID = walletID;
  }

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
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMinConf() {
    return minConf;
  }
  public void setMinConf(Integer minConf) {
    this.minConf = minConf;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getNetki() {
    return netki;
  }
  public void setNetki(String netki) {
    this.netki = netki;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WalletAddressData walletAddressData = (WalletAddressData) o;
    return (walletID == null ? walletAddressData.walletID == null : walletID.equals(walletAddressData.walletID)) &&
        (address == null ? walletAddressData.address == null : address.equals(walletAddressData.address)) &&
        (time == null ? walletAddressData.time == null : time.equals(walletAddressData.time)) &&
        (info == null ? walletAddressData.info == null : info.equals(walletAddressData.info)) &&
        (minConf == null ? walletAddressData.minConf == null : minConf.equals(walletAddressData.minConf)) &&
        (netki == null ? walletAddressData.netki == null : netki.equals(walletAddressData.netki));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (minConf == null ? 0: minConf.hashCode());
    result = 31 * result + (netki == null ? 0: netki.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletAddressData {\n");
    
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  minConf: ").append(minConf).append("\n");
    sb.append("  netki: ").append(netki).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
