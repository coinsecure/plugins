package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * LoginFormNew
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class LoginFormNew   {
  
  private String email = null;
  private String token = null;
  private String password = null;
  private String gcmCode = null;
  private String pin = null;

  
  /**
   **/
  public LoginFormNew email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  /**
   **/
  public LoginFormNew token(String token) {
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


  /**
   **/
  public LoginFormNew password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   **/
  public LoginFormNew gcmCode(String gcmCode) {
    this.gcmCode = gcmCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("gcmCode")
  public String getGcmCode() {
    return gcmCode;
  }
  public void setGcmCode(String gcmCode) {
    this.gcmCode = gcmCode;
  }


  /**
   **/
  public LoginFormNew pin(String pin) {
    this.pin = pin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pin")
  public String getPin() {
    return pin;
  }
  public void setPin(String pin) {
    this.pin = pin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFormNew loginFormNew = (LoginFormNew) o;
    return Objects.equals(this.email, loginFormNew.email) &&
        Objects.equals(this.token, loginFormNew.token) &&
        Objects.equals(this.password, loginFormNew.password) &&
        Objects.equals(this.gcmCode, loginFormNew.gcmCode) &&
        Objects.equals(this.pin, loginFormNew.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, token, password, gcmCode, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFormNew {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    gcmCode: ").append(toIndentedString(gcmCode)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

