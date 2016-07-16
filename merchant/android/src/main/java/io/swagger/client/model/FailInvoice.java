package io.swagger.client.model;

import io.swagger.client.model.JsValue;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class FailInvoice  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private JsValue message = null;
  @SerializedName("time")
  private Date time = null;
  @SerializedName("method")
  private String method = null;
  @SerializedName("title")
  private String title = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public JsValue getMessage() {
    return message;
  }
  public void setMessage(JsValue message) {
    this.message = message;
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
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailInvoice failInvoice = (FailInvoice) o;
    return (success == null ? failInvoice.success == null : success.equals(failInvoice.success)) &&
        (message == null ? failInvoice.message == null : message.equals(failInvoice.message)) &&
        (time == null ? failInvoice.time == null : time.equals(failInvoice.time)) &&
        (method == null ? failInvoice.method == null : method.equals(failInvoice.method)) &&
        (title == null ? failInvoice.title == null : title.equals(failInvoice.title));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (success == null ? 0: success.hashCode());
    result = 31 * result + (message == null ? 0: message.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (method == null ? 0: method.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailInvoice {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
