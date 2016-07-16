package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ResetPassword  {
  
  @SerializedName("token")
  private String token = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("repeatPassword")
  private String repeatPassword = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRepeatPassword() {
    return repeatPassword;
  }
  public void setRepeatPassword(String repeatPassword) {
    this.repeatPassword = repeatPassword;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPassword resetPassword = (ResetPassword) o;
    return (token == null ? resetPassword.token == null : token.equals(resetPassword.token)) &&
        (password == null ? resetPassword.password == null : password.equals(resetPassword.password)) &&
        (repeatPassword == null ? resetPassword.repeatPassword == null : repeatPassword.equals(resetPassword.repeatPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (token == null ? 0: token.hashCode());
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (repeatPassword == null ? 0: repeatPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPassword {\n");
    
    sb.append("  token: ").append(token).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  repeatPassword: ").append(repeatPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
