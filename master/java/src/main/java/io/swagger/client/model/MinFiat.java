package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * MinFiat
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class MinFiat   {
  
  private Long minFiat = null;

  
  /**
   **/
  public MinFiat minFiat(Long minFiat) {
    this.minFiat = minFiat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("minFiat")
  public Long getMinFiat() {
    return minFiat;
  }
  public void setMinFiat(Long minFiat) {
    this.minFiat = minFiat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MinFiat minFiat = (MinFiat) o;
    return Objects.equals(this.minFiat, minFiat.minFiat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minFiat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MinFiat {\n");
    
    sb.append("    minFiat: ").append(toIndentedString(minFiat)).append("\n");
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

