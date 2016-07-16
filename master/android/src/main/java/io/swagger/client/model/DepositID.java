package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DepositID  {
  
  @SerializedName("depositID")
  private String depositID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getDepositID() {
    return depositID;
  }
  public void setDepositID(String depositID) {
    this.depositID = depositID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositID depositID = (DepositID) o;
    return (depositID == null ? depositID.depositID == null : depositID.equals(depositID.depositID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (depositID == null ? 0: depositID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositID {\n");
    
    sb.append("  depositID: ").append(depositID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
