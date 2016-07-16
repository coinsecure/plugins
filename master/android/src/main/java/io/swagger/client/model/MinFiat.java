package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class MinFiat  {
  
  @SerializedName("minFiat")
  private Long minFiat = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getMinFiat() {
    return minFiat;
  }
  public void setMinFiat(Long minFiat) {
    this.minFiat = minFiat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinFiat minFiat = (MinFiat) o;
    return (minFiat == null ? minFiat.minFiat == null : minFiat.equals(minFiat.minFiat));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (minFiat == null ? 0: minFiat.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinFiat {\n");
    
    sb.append("  minFiat: ").append(minFiat).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
