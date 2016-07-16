package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WalletsData  {
  
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("coinBalance")
  private Long coinBalance = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("info")
  private String info = null;
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
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCoinBalance() {
    return coinBalance;
  }
  public void setCoinBalance(Long coinBalance) {
    this.coinBalance = coinBalance;
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
    WalletsData walletsData = (WalletsData) o;
    return (walletID == null ? walletsData.walletID == null : walletID.equals(walletsData.walletID)) &&
        (name == null ? walletsData.name == null : name.equals(walletsData.name)) &&
        (coinBalance == null ? walletsData.coinBalance == null : coinBalance.equals(walletsData.coinBalance)) &&
        (time == null ? walletsData.time == null : time.equals(walletsData.time)) &&
        (info == null ? walletsData.info == null : info.equals(walletsData.info)) &&
        (netki == null ? walletsData.netki == null : netki.equals(walletsData.netki));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (coinBalance == null ? 0: coinBalance.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (netki == null ? 0: netki.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WalletsData {\n");
    
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  coinBalance: ").append(coinBalance).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  netki: ").append(netki).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
