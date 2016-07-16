package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NetkiNameAddress  {
  
  @SerializedName("netkiName")
  private String netkiName = null;
  @SerializedName("address")
  private String address = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNetkiName() {
    return netkiName;
  }
  public void setNetkiName(String netkiName) {
    this.netkiName = netkiName;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetkiNameAddress netkiNameAddress = (NetkiNameAddress) o;
    return (netkiName == null ? netkiNameAddress.netkiName == null : netkiName.equals(netkiNameAddress.netkiName)) &&
        (address == null ? netkiNameAddress.address == null : address.equals(netkiNameAddress.address));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (netkiName == null ? 0: netkiName.hashCode());
    result = 31 * result + (address == null ? 0: address.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetkiNameAddress {\n");
    
    sb.append("  netkiName: ").append(netkiName).append("\n");
    sb.append("  address: ").append(address).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
