package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class LoginId  {
  
  @SerializedName("loginID")
  private String loginID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getLoginID() {
    return loginID;
  }
  public void setLoginID(String loginID) {
    this.loginID = loginID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginId loginId = (LoginId) o;
    return (loginID == null ? loginId.loginID == null : loginID.equals(loginId.loginID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (loginID == null ? 0: loginID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginId {\n");
    
    sb.append("  loginID: ").append(loginID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
