package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class AskID  {
  
  @SerializedName("askID")
  private String askID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getAskID() {
    return askID;
  }
  public void setAskID(String askID) {
    this.askID = askID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AskID askID = (AskID) o;
    return (askID == null ? askID.askID == null : askID.equals(askID.askID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (askID == null ? 0: askID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AskID {\n");
    
    sb.append("  askID: ").append(askID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
