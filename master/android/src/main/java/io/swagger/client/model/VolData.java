package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class VolData  {
  
  @SerializedName("vol")
  private Long vol = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getVol() {
    return vol;
  }
  public void setVol(Long vol) {
    this.vol = vol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolData volData = (VolData) o;
    return (vol == null ? volData.vol == null : vol.equals(volData.vol));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (vol == null ? 0: vol.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolData {\n");
    
    sb.append("  vol: ").append(vol).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
