package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class BidID  {
  
  @SerializedName("bidID")
  private String bidID = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getBidID() {
    return bidID;
  }
  public void setBidID(String bidID) {
    this.bidID = bidID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BidID bidID = (BidID) o;
    return (bidID == null ? bidID.bidID == null : bidID.equals(bidID.bidID));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (bidID == null ? 0: bidID.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BidID {\n");
    
    sb.append("  bidID: ").append(bidID).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
