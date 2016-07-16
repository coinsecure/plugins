package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class WithdrawID  {
  
  @SerializedName("withdrawID")
  private String withdrawID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getWithdrawID() {
    return withdrawID;
  }
  public void setWithdrawID(String withdrawID) {
    this.withdrawID = withdrawID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WithdrawID withdrawID = (WithdrawID) o;
    return (withdrawID == null ? withdrawID.withdrawID == null : withdrawID.equals(withdrawID.withdrawID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (withdrawID == null ? 0: withdrawID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawID {\n");
    
    sb.append("  withdrawID: ").append(withdrawID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
