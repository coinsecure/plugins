package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NewAddress  {
  
  @SerializedName("walletID")
  private String walletID = null;
  @SerializedName("info")
  private String info = null;

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
    NewAddress newAddress = (NewAddress) o;
    return (walletID == null ? newAddress.walletID == null : walletID.equals(newAddress.walletID)) &&
        (info == null ? newAddress.info == null : info.equals(newAddress.info));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (walletID == null ? 0: walletID.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewAddress {\n");
    
    sb.append("  walletID: ").append(walletID).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
