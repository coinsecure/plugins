package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * InvoiceIDFull
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-06-26T17:34:18.778Z")
public class InvoiceIDFull   {
  
  private Long from = null;
  private Long to = null;
  private Integer max = null;
  private Long offset = null;

  
  /**
   **/
  public InvoiceIDFull from(Long from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("from")
  public Long getFrom() {
    return from;
  }
  public void setFrom(Long from) {
    this.from = from;
  }


  /**
   **/
  public InvoiceIDFull to(Long to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("to")
  public Long getTo() {
    return to;
  }
  public void setTo(Long to) {
    this.to = to;
  }


  /**
   **/
  public InvoiceIDFull max(Integer max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("max")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }


  /**
   **/
  public InvoiceIDFull offset(Long offset) {
    this.offset = offset;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("offset")
  public Long getOffset() {
    return offset;
  }
  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceIDFull invoiceIDFull = (InvoiceIDFull) o;
    return Objects.equals(this.from, invoiceIDFull.from) &&
        Objects.equals(this.to, invoiceIDFull.to) &&
        Objects.equals(this.max, invoiceIDFull.max) &&
        Objects.equals(this.offset, invoiceIDFull.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, max, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceIDFull {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

