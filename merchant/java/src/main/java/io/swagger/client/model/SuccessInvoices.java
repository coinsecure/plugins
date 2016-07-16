package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Invoice;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * SuccessInvoices
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class SuccessInvoices   {
  
  private Boolean success = false;
  private List<Invoice> message = new ArrayList<Invoice>();
  private Date time = null;
  private String method = null;
  private String title = null;

  
  /**
   **/
  public SuccessInvoices success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   **/
  public SuccessInvoices message(List<Invoice> message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public List<Invoice> getMessage() {
    return message;
  }
  public void setMessage(List<Invoice> message) {
    this.message = message;
  }


  /**
   **/
  public SuccessInvoices time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   **/
  public SuccessInvoices method(String method) {
    this.method = method;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }


  /**
   **/
  public SuccessInvoices title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccessInvoices successInvoices = (SuccessInvoices) o;
    return Objects.equals(this.success, successInvoices.success) &&
        Objects.equals(this.message, successInvoices.message) &&
        Objects.equals(this.time, successInvoices.time) &&
        Objects.equals(this.method, successInvoices.method) &&
        Objects.equals(this.title, successInvoices.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, time, method, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessInvoices {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

