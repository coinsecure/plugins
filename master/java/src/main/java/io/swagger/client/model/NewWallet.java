package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NewWallet
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class NewWallet   {
  
  private String walletName = null;
  private String info = null;

  
  /**
   **/
  public NewWallet walletName(String walletName) {
    this.walletName = walletName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("walletName")
  public String getWalletName() {
    return walletName;
  }
  public void setWalletName(String walletName) {
    this.walletName = walletName;
  }


  /**
   **/
  public NewWallet info(String info) {
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
    NewWallet newWallet = (NewWallet) o;
    return Objects.equals(this.walletName, newWallet.walletName) &&
        Objects.equals(this.info, newWallet.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletName, info);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewWallet {\n");
    
    sb.append("    walletName: ").append(toIndentedString(walletName)).append("\n");
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

