package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MaxVol  {
  
  @SerializedName("maxVol")
  private Long maxVol = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMaxVol() {
    return maxVol;
  }
  public void setMaxVol(Long maxVol) {
    this.maxVol = maxVol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxVol maxVol = (MaxVol) o;
    return (maxVol == null ? maxVol.maxVol == null : maxVol.equals(maxVol.maxVol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (maxVol == null ? 0: maxVol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxVol {\n");
    
    sb.append("  maxVol: ").append(maxVol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
