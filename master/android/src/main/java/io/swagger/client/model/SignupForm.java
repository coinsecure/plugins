package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SignupForm  {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("password")
  private String password = null;
  @SerializedName("repeatPassword")
  private String repeatPassword = null;
  @SerializedName("refID")
  private String refID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

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

  /**
   **/
  @ApiModelProperty(value = "")
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignupForm signupForm = (SignupForm) o;
    return (name == null ? signupForm.name == null : name.equals(signupForm.name)) &&
        (email == null ? signupForm.email == null : email.equals(signupForm.email)) &&
        (password == null ? signupForm.password == null : password.equals(signupForm.password)) &&
        (repeatPassword == null ? signupForm.repeatPassword == null : repeatPassword.equals(signupForm.repeatPassword)) &&
        (refID == null ? signupForm.refID == null : refID.equals(signupForm.refID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (name == null ? 0: name.hashCode());
    result = 31 * result + (email == null ? 0: email.hashCode());
    result = 31 * result + (password == null ? 0: password.hashCode());
    result = 31 * result + (repeatPassword == null ? 0: repeatPassword.hashCode());
    result = 31 * result + (refID == null ? 0: refID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignupForm {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  password: ").append(password).append("\n");
    sb.append("  repeatPassword: ").append(repeatPassword).append("\n");
    sb.append("  refID: ").append(refID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
