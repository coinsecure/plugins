package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ChangePassword  {
  
  @SerializedName("password")
  private String password = null;
  @SerializedName("repeatPassword")
  private String repeatPassword = null;

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
  @ApiModelProperty(required = true, value = "")
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
    ChangePassword changePassword = (ChangePassword) o;
    return (password == null ? changePassword.password == null : password.equals(changePassword.password)) &&
        (repeatPassword == null ? changePassword.repeatPassword == null : repeatPassword.equals(changePassword.repeatPassword));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (repeatPassword == null ? 0: repeatPassword.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePassword {\n");
    
    sb.append("  password: ").append(password).append("\n");
    sb.append("  repeatPassword: ").append(repeatPassword).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
