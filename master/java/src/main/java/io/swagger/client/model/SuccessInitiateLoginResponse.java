package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SuccessInitiateLoginResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class SuccessInitiateLoginResponse   {
  
  private String info = null;
  private Long validTill = null;
  private String mfa = null;
  private String token = null;

  
  /**
   **/
  public SuccessInitiateLoginResponse info(String info) {
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
  public SuccessInitiateLoginResponse validTill(Long validTill) {
    this.validTill = validTill;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("validTill")
  public Long getValidTill() {
    return validTill;
  }
  public void setValidTill(Long validTill) {
    this.validTill = validTill;
  }


  /**
   **/
  public SuccessInitiateLoginResponse mfa(String mfa) {
    this.mfa = mfa;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("mfa")
  public String getMfa() {
    return mfa;
  }
  public void setMfa(String mfa) {
    this.mfa = mfa;
  }


  /**
   **/
  public SuccessInitiateLoginResponse token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInitiateLoginResponse successInitiateLoginResponse = (SuccessInitiateLoginResponse) o;
    return Objects.equals(this.info, successInitiateLoginResponse.info) &&
        Objects.equals(this.validTill, successInitiateLoginResponse.validTill) &&
        Objects.equals(this.mfa, successInitiateLoginResponse.mfa) &&
        Objects.equals(this.token, successInitiateLoginResponse.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(info, validTill, mfa, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInitiateLoginResponse {\n");
    
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    validTill: ").append(toIndentedString(validTill)).append("\n");
    sb.append("    mfa: ").append(toIndentedString(mfa)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

