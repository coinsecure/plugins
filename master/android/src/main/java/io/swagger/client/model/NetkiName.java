package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class NetkiName  {
  
  @SerializedName("netkiName")
  private String netkiName = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNetkiName() {
    return netkiName;
  }
  public void setNetkiName(String netkiName) {
    this.netkiName = netkiName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetkiName netkiName = (NetkiName) o;
    return (netkiName == null ? netkiName.netkiName == null : netkiName.equals(netkiName.netkiName));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (netkiName == null ? 0: netkiName.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetkiName {\n");
    
    sb.append("  netkiName: ").append(netkiName).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
