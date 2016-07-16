package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LoginFormNew  {
  
  @SerializedName("email")
  private String email = null;
  @SerializedName("token")
  private String token = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("gcmCode")
  private String gcmCode = null;
  @SerializedName("pin")
  private String pin = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
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

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getGcmCode() {
    return gcmCode;
  }
  public void setGcmCode(String gcmCode) {
    this.gcmCode = gcmCode;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFormNew loginFormNew = (LoginFormNew) o;
    return (email == null ? loginFormNew.email == null : email.equals(loginFormNew.email)) &&
        (token == null ? loginFormNew.token == null : token.equals(loginFormNew.token)) &&
        (password == null ? loginFormNew.password == null : password.equals(loginFormNew.password)) &&
        (gcmCode == null ? loginFormNew.gcmCode == null : gcmCode.equals(loginFormNew.gcmCode)) &&
        (pin == null ? loginFormNew.pin == null : pin.equals(loginFormNew.pin));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (token == null ? 0: token.hashCode());
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (gcmCode == null ? 0: gcmCode.hashCode());
    result = 31 * result + (pin == null ? 0: pin.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFormNew {\n");
    
    sb.append("  email: ").append(email).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  gcmCode: ").append(gcmCode).append("\n");
    sb.append("  pin: ").append(pin).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
