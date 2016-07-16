package io.swagger.client.model;

import io.swagger.client.model.RateDiffData;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class RateDiffDataResponse  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private RateDiffData message = null;
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
  public RateDiffData getMessage() {
    return message;
  }
  public void setMessage(RateDiffData message) {
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
    RateDiffDataResponse rateDiffDataResponse = (RateDiffDataResponse) o;
    return (success == null ? rateDiffDataResponse.success == null : success.equals(rateDiffDataResponse.success)) &&
        (message == null ? rateDiffDataResponse.message == null : message.equals(rateDiffDataResponse.message)) &&
        (method == null ? rateDiffDataResponse.method == null : method.equals(rateDiffDataResponse.method)) &&
        (title == null ? rateDiffDataResponse.title == null : title.equals(rateDiffDataResponse.title)) &&
        (time == null ? rateDiffDataResponse.time == null : time.equals(rateDiffDataResponse.time));
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
    sb.append("class RateDiffDataResponse {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
