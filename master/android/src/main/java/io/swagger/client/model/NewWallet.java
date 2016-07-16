package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NewWallet  {
  
  @SerializedName("walletName")
  private String walletName = null;
  @SerializedName("info")
  private String info = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWalletName() {
    return walletName;
  }
  public void setWalletName(String walletName) {
    this.walletName = walletName;
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
    NewWallet newWallet = (NewWallet) o;
    return (walletName == null ? newWallet.walletName == null : walletName.equals(newWallet.walletName)) &&
        (info == null ? newWallet.info == null : info.equals(newWallet.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletName == null ? 0: walletName.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewWallet {\n");
    
    sb.append("  walletName: ").append(walletName).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
