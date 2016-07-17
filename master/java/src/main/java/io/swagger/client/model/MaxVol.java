package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * MaxVol
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class MaxVol   {
  
  private Long maxVol = null;

  
  /**
   **/
  public MaxVol maxVol(Long maxVol) {
    this.maxVol = maxVol;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("maxVol")
  public Long getMaxVol() {
    return maxVol;
  }
  public void setMaxVol(Long maxVol) {
    this.maxVol = maxVol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaxVol maxVol = (MaxVol) o;
    return Objects.equals(this.maxVol, maxVol.maxVol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxVol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaxVol {\n");
    
    sb.append("    maxVol: ").append(toIndentedString(maxVol)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

