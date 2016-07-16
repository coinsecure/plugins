package io.swagger.client.model;

import io.swagger.client.model.TradeCoinWithdrawData;
import java.util.*;
import java.util.Date;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TradeCoinWithdrawDataResponse  {
  
  @SerializedName("success")
  private Boolean success = null;
  @SerializedName("message")
  private List<TradeCoinWithdrawData> message = null;
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
  public List<TradeCoinWithdrawData> getMessage() {
    return message;
  }
  public void setMessage(List<TradeCoinWithdrawData> message) {
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
    TradeCoinWithdrawDataResponse tradeCoinWithdrawDataResponse = (TradeCoinWithdrawDataResponse) o;
    return (success == null ? tradeCoinWithdrawDataResponse.success == null : success.equals(tradeCoinWithdrawDataResponse.success)) &&
        (message == null ? tradeCoinWithdrawDataResponse.message == null : message.equals(tradeCoinWithdrawDataResponse.message)) &&
        (method == null ? tradeCoinWithdrawDataResponse.method == null : method.equals(tradeCoinWithdrawDataResponse.method)) &&
        (title == null ? tradeCoinWithdrawDataResponse.title == null : title.equals(tradeCoinWithdrawDataResponse.title)) &&
        (time == null ? tradeCoinWithdrawDataResponse.time == null : time.equals(tradeCoinWithdrawDataResponse.time));
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
    sb.append("class TradeCoinWithdrawDataResponse {\n");
    
    sb.append("  success: ").append(success).append("\n");
    sb.append("  message: ").append(message).append("\n");
    sb.append("  method: ").append(method).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
