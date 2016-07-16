package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TradeSummaryData  {
  
  @SerializedName("completedAsksSum")
  private Long completedAsksSum = null;
  @SerializedName("completedBidsSum")
  private Long completedBidsSum = null;
  @SerializedName("completedAsksCount")
  private Long completedAsksCount = null;
  @SerializedName("completedBidsCount")
  private Long completedBidsCount = null;
  @SerializedName("pendingAsksCount")
  private Long pendingAsksCount = null;
  @SerializedName("pendingBidsCount")
  private Long pendingBidsCount = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCompletedAsksSum() {
    return completedAsksSum;
  }
  public void setCompletedAsksSum(Long completedAsksSum) {
    this.completedAsksSum = completedAsksSum;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCompletedBidsSum() {
    return completedBidsSum;
  }
  public void setCompletedBidsSum(Long completedBidsSum) {
    this.completedBidsSum = completedBidsSum;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCompletedAsksCount() {
    return completedAsksCount;
  }
  public void setCompletedAsksCount(Long completedAsksCount) {
    this.completedAsksCount = completedAsksCount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getCompletedBidsCount() {
    return completedBidsCount;
  }
  public void setCompletedBidsCount(Long completedBidsCount) {
    this.completedBidsCount = completedBidsCount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingAsksCount() {
    return pendingAsksCount;
  }
  public void setPendingAsksCount(Long pendingAsksCount) {
    this.pendingAsksCount = pendingAsksCount;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getPendingBidsCount() {
    return pendingBidsCount;
  }
  public void setPendingBidsCount(Long pendingBidsCount) {
    this.pendingBidsCount = pendingBidsCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TradeSummaryData tradeSummaryData = (TradeSummaryData) o;
    return (completedAsksSum == null ? tradeSummaryData.completedAsksSum == null : completedAsksSum.equals(tradeSummaryData.completedAsksSum)) &&
        (completedBidsSum == null ? tradeSummaryData.completedBidsSum == null : completedBidsSum.equals(tradeSummaryData.completedBidsSum)) &&
        (completedAsksCount == null ? tradeSummaryData.completedAsksCount == null : completedAsksCount.equals(tradeSummaryData.completedAsksCount)) &&
        (completedBidsCount == null ? tradeSummaryData.completedBidsCount == null : completedBidsCount.equals(tradeSummaryData.completedBidsCount)) &&
        (pendingAsksCount == null ? tradeSummaryData.pendingAsksCount == null : pendingAsksCount.equals(tradeSummaryData.pendingAsksCount)) &&
        (pendingBidsCount == null ? tradeSummaryData.pendingBidsCount == null : pendingBidsCount.equals(tradeSummaryData.pendingBidsCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (completedAsksSum == null ? 0: completedAsksSum.hashCode());
    result = 31 * result + (completedBidsSum == null ? 0: completedBidsSum.hashCode());
    result = 31 * result + (completedAsksCount == null ? 0: completedAsksCount.hashCode());
    result = 31 * result + (completedBidsCount == null ? 0: completedBidsCount.hashCode());
    result = 31 * result + (pendingAsksCount == null ? 0: pendingAsksCount.hashCode());
    result = 31 * result + (pendingBidsCount == null ? 0: pendingBidsCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TradeSummaryData {\n");
    
    sb.append("  completedAsksSum: ").append(completedAsksSum).append("\n");
    sb.append("  completedBidsSum: ").append(completedBidsSum).append("\n");
    sb.append("  completedAsksCount: ").append(completedAsksCount).append("\n");
    sb.append("  completedBidsCount: ").append(completedBidsCount).append("\n");
    sb.append("  pendingAsksCount: ").append(pendingAsksCount).append("\n");
    sb.append("  pendingBidsCount: ").append(pendingBidsCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
