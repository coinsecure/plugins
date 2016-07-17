package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ResetPassword
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class ResetPassword   {
  
  private String token = null;
  private String password = null;
  private String repeatPassword = null;

  
  /**
   **/
  public ResetPassword token(String token) {
    this.token = token;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("token")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }


  /**
   **/
  public ResetPassword password(String password) {
    this.password = password;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }


  /**
   **/
  public ResetPassword repeatPassword(String repeatPassword) {
    this.repeatPassword = repeatPassword;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("repeatPassword")
  public String getRepeatPassword() {
    return repeatPassword;
  }
  public void setRepeatPassword(String repeatPassword) {
    this.repeatPassword = repeatPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPassword resetPassword = (ResetPassword) o;
    return Objects.equals(this.token, resetPassword.token) &&
        Objects.equals(this.password, resetPassword.password) &&
        Objects.equals(this.repeatPassword, resetPassword.repeatPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, password, repeatPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPassword {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    repeatPassword: ").append(toIndentedString(repeatPassword)).append("\n");
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

