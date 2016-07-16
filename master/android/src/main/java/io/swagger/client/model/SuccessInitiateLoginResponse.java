package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccessInitiateLoginResponse  {
  
  @SerializedName("info")
  private String info = null;
  @SerializedName("validTill")
  private Long validTill = null;
  @SerializedName("mfa")
  private String mfa = null;
  @SerializedName("token")
  private String token = null;

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
  public Long getValidTill() {
    return validTill;
  }
  public void setValidTill(Long validTill) {
    this.validTill = validTill;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMfa() {
    return mfa;
  }
  public void setMfa(String mfa) {
    this.mfa = mfa;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInitiateLoginResponse successInitiateLoginResponse = (SuccessInitiateLoginResponse) o;
    return (info == null ? successInitiateLoginResponse.info == null : info.equals(successInitiateLoginResponse.info)) &&
        (validTill == null ? successInitiateLoginResponse.validTill == null : validTill.equals(successInitiateLoginResponse.validTill)) &&
        (mfa == null ? successInitiateLoginResponse.mfa == null : mfa.equals(successInitiateLoginResponse.mfa)) &&
        (token == null ? successInitiateLoginResponse.token == null : token.equals(successInitiateLoginResponse.token));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (validTill == null ? 0: validTill.hashCode());
    result = 31 * result + (mfa == null ? 0: mfa.hashCode());
    result = 31 * result + (token == null ? 0: token.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInitiateLoginResponse {\n");
    
    sb.append("  info: ").append(info).append("\n");
    sb.append("  validTill: ").append(validTill).append("\n");
    sb.append("  mfa: ").append(mfa).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
