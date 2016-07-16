package io.swagger.client.model;

import io.swagger.client.model.SuccessInitiateLoginResponse;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class StandardInitiateLoginResultData  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private SuccessInitiateLoginResponse message = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("time")
  private Date time = null;

  /**
   * true
   **/
  @ApiModelProperty(required = true, value = "true")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public SuccessInitiateLoginResponse getMessage() {
    return message;
  }
  public void setMessage(SuccessInitiateLoginResponse message) {
    this.message = message;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardInitiateLoginResultData standardInitiateLoginResultData = (StandardInitiateLoginResultData) o;
    return (success == null ? standardInitiateLoginResultData.success == null : success.equals(standardInitiateLoginResultData.success)) &&
        (message == null ? standardInitiateLoginResultData.message == null : message.equals(standardInitiateLoginResultData.message)) &&
        (method == null ? standardInitiateLoginResultData.method == null : method.equals(standardInitiateLoginResultData.method)) &&
        (title == null ? standardInitiateLoginResultData.title == null : title.equals(standardInitiateLoginResultData.title)) &&
        (time == null ? standardInitiateLoginResultData.time == null : time.equals(standardInitiateLoginResultData.time));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (success == null ? 0: success.hashCode());
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (method == null ? 0: method.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardInitiateLoginResultData {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
