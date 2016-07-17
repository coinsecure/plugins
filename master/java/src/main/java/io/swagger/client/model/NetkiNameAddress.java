package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NetkiNameAddress
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class NetkiNameAddress   {
  
  private String netkiName = null;
  private String address = null;

  
  /**
   **/
  public NetkiNameAddress netkiName(String netkiName) {
    this.netkiName = netkiName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("netkiName")
  public String getNetkiName() {
    return netkiName;
  }
  public void setNetkiName(String netkiName) {
    this.netkiName = netkiName;
  }


  /**
   **/
  public NetkiNameAddress address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetkiNameAddress netkiNameAddress = (NetkiNameAddress) o;
    return Objects.equals(this.netkiName, netkiNameAddress.netkiName) &&
        Objects.equals(this.address, netkiNameAddress.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netkiName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetkiNameAddress {\n");
    
    sb.append("    netkiName: ").append(toIndentedString(netkiName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

