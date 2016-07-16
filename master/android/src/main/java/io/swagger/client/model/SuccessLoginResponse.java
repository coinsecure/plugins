package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccessLoginResponse  {
  
  @SerializedName("info")
  private String info = null;
  @SerializedName("keyType")
  private String keyType = null;
  @SerializedName("keyNeeded")
  private String keyNeeded = null;

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
  public String getKeyType() {
    return keyType;
  }
  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getKeyNeeded() {
    return keyNeeded;
  }
  public void setKeyNeeded(String keyNeeded) {
    this.keyNeeded = keyNeeded;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessLoginResponse successLoginResponse = (SuccessLoginResponse) o;
    return (info == null ? successLoginResponse.info == null : info.equals(successLoginResponse.info)) &&
        (keyType == null ? successLoginResponse.keyType == null : keyType.equals(successLoginResponse.keyType)) &&
        (keyNeeded == null ? successLoginResponse.keyNeeded == null : keyNeeded.equals(successLoginResponse.keyNeeded));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (keyType == null ? 0: keyType.hashCode());
    result = 31 * result + (keyNeeded == null ? 0: keyNeeded.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessLoginResponse {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("  keyType: ").append(keyType).append("\n");
    sb.append("  keyNeeded: ").append(keyNeeded).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
