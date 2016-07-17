package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * NetkiName
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class NetkiName   {
  
  private String netkiName = null;

  
  /**
   **/
  public NetkiName netkiName(String netkiName) {
    this.netkiName = netkiName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("netkiName")
  public String getNetkiName() {
    return netkiName;
  }
  public void setNetkiName(String netkiName) {
    this.netkiName = netkiName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetkiName netkiName = (NetkiName) o;
    return Objects.equals(this.netkiName, netkiName.netkiName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(netkiName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetkiName {\n");
    
    sb.append("    netkiName: ").append(toIndentedString(netkiName)).append("\n");
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

