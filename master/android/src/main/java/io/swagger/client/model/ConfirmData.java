package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class ConfirmData  {
  
  @SerializedName("confirmations")
  private Long confirmations = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getConfirmations() {
    return confirmations;
  }
  public void setConfirmations(Long confirmations) {
    this.confirmations = confirmations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmData confirmData = (ConfirmData) o;
    return (confirmations == null ? confirmData.confirmations == null : confirmations.equals(confirmData.confirmations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (confirmations == null ? 0: confirmations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmData {\n");
    
    sb.append("  confirmations: ").append(confirmations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
