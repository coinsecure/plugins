package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * TradeSummaryData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-16T19:11:03.227Z")
public class TradeSummaryData   {
  
  private Long completedAsksSum = null;
  private Long completedBidsSum = null;
  private Long completedAsksCount = null;
  private Long completedBidsCount = null;
  private Long pendingAsksCount = null;
  private Long pendingBidsCount = null;

  
  /**
   **/
  public TradeSummaryData completedAsksSum(Long completedAsksSum) {
    this.completedAsksSum = completedAsksSum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("completedAsksSum")
  public Long getCompletedAsksSum() {
    return completedAsksSum;
  }
  public void setCompletedAsksSum(Long completedAsksSum) {
    this.completedAsksSum = completedAsksSum;
  }


  /**
   **/
  public TradeSummaryData completedBidsSum(Long completedBidsSum) {
    this.completedBidsSum = completedBidsSum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("completedBidsSum")
  public Long getCompletedBidsSum() {
    return completedBidsSum;
  }
  public void setCompletedBidsSum(Long completedBidsSum) {
    this.completedBidsSum = completedBidsSum;
  }


  /**
   **/
  public TradeSummaryData completedAsksCount(Long completedAsksCount) {
    this.completedAsksCount = completedAsksCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("completedAsksCount")
  public Long getCompletedAsksCount() {
    return completedAsksCount;
  }
  public void setCompletedAsksCount(Long completedAsksCount) {
    this.completedAsksCount = completedAsksCount;
  }


  /**
   **/
  public TradeSummaryData completedBidsCount(Long completedBidsCount) {
    this.completedBidsCount = completedBidsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("completedBidsCount")
  public Long getCompletedBidsCount() {
    return completedBidsCount;
  }
  public void setCompletedBidsCount(Long completedBidsCount) {
    this.completedBidsCount = completedBidsCount;
  }


  /**
   **/
  public TradeSummaryData pendingAsksCount(Long pendingAsksCount) {
    this.pendingAsksCount = pendingAsksCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pendingAsksCount")
  public Long getPendingAsksCount() {
    return pendingAsksCount;
  }
  public void setPendingAsksCount(Long pendingAsksCount) {
    this.pendingAsksCount = pendingAsksCount;
  }


  /**
   **/
  public TradeSummaryData pendingBidsCount(Long pendingBidsCount) {
    this.pendingBidsCount = pendingBidsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("pendingBidsCount")
  public Long getPendingBidsCount() {
    return pendingBidsCount;
  }
  public void setPendingBidsCount(Long pendingBidsCount) {
    this.pendingBidsCount = pendingBidsCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeSummaryData tradeSummaryData = (TradeSummaryData) o;
    return Objects.equals(this.completedAsksSum, tradeSummaryData.completedAsksSum) &&
        Objects.equals(this.completedBidsSum, tradeSummaryData.completedBidsSum) &&
        Objects.equals(this.completedAsksCount, tradeSummaryData.completedAsksCount) &&
        Objects.equals(this.completedBidsCount, tradeSummaryData.completedBidsCount) &&
        Objects.equals(this.pendingAsksCount, tradeSummaryData.pendingAsksCount) &&
        Objects.equals(this.pendingBidsCount, tradeSummaryData.pendingBidsCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completedAsksSum, completedBidsSum, completedAsksCount, completedBidsCount, pendingAsksCount, pendingBidsCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeSummaryData {\n");
    
    sb.append("    completedAsksSum: ").append(toIndentedString(completedAsksSum)).append("\n");
    sb.append("    completedBidsSum: ").append(toIndentedString(completedBidsSum)).append("\n");
    sb.append("    completedAsksCount: ").append(toIndentedString(completedAsksCount)).append("\n");
    sb.append("    completedBidsCount: ").append(toIndentedString(completedBidsCount)).append("\n");
    sb.append("    pendingAsksCount: ").append(toIndentedString(pendingAsksCount)).append("\n");
    sb.append("    pendingBidsCount: ").append(toIndentedString(pendingBidsCount)).append("\n");
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

