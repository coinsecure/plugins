package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * ConfirmData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class ConfirmData   {
  
  private Long confirmations = null;

  
  /**
   **/
  public ConfirmData confirmations(Long confirmations) {
    this.confirmations = confirmations;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("confirmations")
  public Long getConfirmations() {
    return confirmations;
  }
  public void setConfirmations(Long confirmations) {
    this.confirmations = confirmations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfirmData confirmData = (ConfirmData) o;
    return Objects.equals(this.confirmations, confirmData.confirmations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(confirmations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfirmData {\n");
    
    sb.append("    confirmations: ").append(toIndentedString(confirmations)).append("\n");
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

