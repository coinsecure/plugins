package io.swagger.client.model;

import io.swagger.client.model.Invoice;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccessInvoice  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private Invoice message = null;
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
  public Invoice getMessage() {
    return message;
  }
  public void setMessage(Invoice message) {
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
    SuccessInvoice successInvoice = (SuccessInvoice) o;
    return (success == null ? successInvoice.success == null : success.equals(successInvoice.success)) &&
        (message == null ? successInvoice.message == null : message.equals(successInvoice.message)) &&
        (time == null ? successInvoice.time == null : time.equals(successInvoice.time)) &&
        (method == null ? successInvoice.method == null : method.equals(successInvoice.method)) &&
        (title == null ? successInvoice.title == null : title.equals(successInvoice.title));
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
    sb.append("class SuccessInvoice {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
