package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class InvoiceIDFull  {
  
  @SerializedName("from")
  private Long from = null;
  @SerializedName("to")
  private Long to = null;
  @SerializedName("max")
  private Integer max = null;
  @SerializedName("offset")
  private Long offset = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFrom() {
    return from;
  }
  public void setFrom(Long from) {
    this.from = from;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTo() {
    return to;
  }
  public void setTo(Long to) {
    this.to = to;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getMax() {
    return max;
  }
  public void setMax(Integer max) {
    this.max = max;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getOffset() {
    return offset;
  }
  public void setOffset(Long offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoiceIDFull invoiceIDFull = (InvoiceIDFull) o;
    return (from == null ? invoiceIDFull.from == null : from.equals(invoiceIDFull.from)) &&
        (to == null ? invoiceIDFull.to == null : to.equals(invoiceIDFull.to)) &&
        (max == null ? invoiceIDFull.max == null : max.equals(invoiceIDFull.max)) &&
        (offset == null ? invoiceIDFull.offset == null : offset.equals(invoiceIDFull.offset));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (from == null ? 0: from.hashCode());
    result = 31 * result + (to == null ? 0: to.hashCode());
    result = 31 * result + (max == null ? 0: max.hashCode());
    result = 31 * result + (offset == null ? 0: offset.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoiceIDFull {\n");
    
    sb.append("  from: ").append(from).append("\n");
    sb.append("  to: ").append(to).append("\n");
    sb.append("  max: ").append(max).append("\n");
    sb.append("  offset: ").append(offset).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
