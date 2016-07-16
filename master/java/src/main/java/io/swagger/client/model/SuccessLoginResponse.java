package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SuccessLoginResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SuccessLoginResponse   {
  
  private String info = null;
  private String keyType = null;
  private String keyNeeded = null;

  
  /**
   **/
  public SuccessLoginResponse info(String info) {
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
  public SuccessLoginResponse keyType(String keyType) {
    this.keyType = keyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("keyType")
  public String getKeyType() {
    return keyType;
  }
  public void setKeyType(String keyType) {
    this.keyType = keyType;
  }


  /**
   **/
  public SuccessLoginResponse keyNeeded(String keyNeeded) {
    this.keyNeeded = keyNeeded;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("keyNeeded")
  public String getKeyNeeded() {
    return keyNeeded;
  }
  public void setKeyNeeded(String keyNeeded) {
    this.keyNeeded = keyNeeded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessLoginResponse successLoginResponse = (SuccessLoginResponse) o;
    return Objects.equals(this.info, successLoginResponse.info) &&
        Objects.equals(this.keyType, successLoginResponse.keyType) &&
        Objects.equals(this.keyNeeded, successLoginResponse.keyNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, keyType, keyNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessLoginResponse {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    keyNeeded: ").append(toIndentedString(keyNeeded)).append("\n");
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

