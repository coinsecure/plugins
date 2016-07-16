package io.swagger.client.model;

import io.swagger.client.model.Invoice;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccessInvoices  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private List<Invoice> message = null;
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
  public List<Invoice> getMessage() {
    return message;
  }
  public void setMessage(List<Invoice> message) {
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
    SuccessInvoices successInvoices = (SuccessInvoices) o;
    return (success == null ? successInvoices.success == null : success.equals(successInvoices.success)) &&
        (message == null ? successInvoices.message == null : message.equals(successInvoices.message)) &&
        (time == null ? successInvoices.time == null : time.equals(successInvoices.time)) &&
        (method == null ? successInvoices.method == null : method.equals(successInvoices.method)) &&
        (title == null ? successInvoices.title == null : title.equals(successInvoices.title));
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
    sb.append("class SuccessInvoices {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
