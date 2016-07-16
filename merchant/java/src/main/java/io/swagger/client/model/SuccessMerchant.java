package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Merchant;
import java.util.Date;


/**
 * SuccessMerchant
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class SuccessMerchant   {
  
  private Boolean success = false;
  private Merchant message = null;
  private Date time = null;
  private String method = null;
  private String title = null;

  
  /**
   **/
  public SuccessMerchant success(Boolean success) {
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
  public SuccessMerchant message(Merchant message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public Merchant getMessage() {
    return message;
  }
  public void setMessage(Merchant message) {
    this.message = message;
  }


  /**
   **/
  public SuccessMerchant time(Date time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }
  public void setTime(Date time) {
    this.time = time;
  }


  /**
   **/
  public SuccessMerchant method(String method) {
    this.method = method;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }
  public void setMethod(String method) {
    this.method = method;
  }


  /**
   **/
  public SuccessMerchant title(String title) {
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
    SuccessMerchant successMerchant = (SuccessMerchant) o;
    return Objects.equals(this.success, successMerchant.success) &&
        Objects.equals(this.message, successMerchant.message) &&
        Objects.equals(this.time, successMerchant.time) &&
        Objects.equals(this.method, successMerchant.method) &&
        Objects.equals(this.title, successMerchant.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, time, method, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessMerchant {\n");
    
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

