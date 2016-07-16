package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class DoubleData  {
  
  @SerializedName("percent")
  private Double percent = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getPercent() {
    return percent;
  }
  public void setPercent(Double percent) {
    this.percent = percent;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoubleData doubleData = (DoubleData) o;
    return (percent == null ? doubleData.percent == null : percent.equals(doubleData.percent));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (percent == null ? 0: percent.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoubleData {\n");
    
    sb.append("  percent: ").append(percent).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
