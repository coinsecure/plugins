package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.SuccessLoginResponse;
import java.util.Date;


/**
 * StandardLoginResultData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class StandardLoginResultData   {
  
  private Boolean success = false;
  private SuccessLoginResponse message = null;
  private String method = null;
  private String title = null;
  private Date time = null;

  
  /**
   * true
   **/
  public StandardLoginResultData success(Boolean success) {
    this.success = success;
    return this;
  }
  
  @ApiModelProperty(example = "true", required = true, value = "true")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  /**
   **/
  public StandardLoginResultData message(SuccessLoginResponse message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("message")
  public SuccessLoginResponse getMessage() {
    return message;
  }
  public void setMessage(SuccessLoginResponse message) {
    this.message = message;
  }


  /**
   **/
  public StandardLoginResultData method(String method) {
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
  public StandardLoginResultData title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public StandardLoginResultData time(Date time) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandardLoginResultData standardLoginResultData = (StandardLoginResultData) o;
    return Objects.equals(this.success, standardLoginResultData.success) &&
        Objects.equals(this.message, standardLoginResultData.message) &&
        Objects.equals(this.method, standardLoginResultData.method) &&
        Objects.equals(this.title, standardLoginResultData.title) &&
        Objects.equals(this.time, standardLoginResultData.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, message, method, title, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandardLoginResultData {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

