package io.swagger.client.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class SuccRefData  {
  
  @SerializedName("refPercent")
  private Double refPercent = null;
  @SerializedName("time")
  private Long time = null;
  @SerializedName("refID")
  private String refID = null;
  @SerializedName("emailVerified")
  private Boolean emailVerified = null;
  @SerializedName("kycComplete")
  private Boolean kycComplete = null;
  @SerializedName("btcEarned")
  private Long btcEarned = null;
  @SerializedName("fiatEarned")
  private Long fiatEarned = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Double getRefPercent() {
    return refPercent;
  }
  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getEmailVerified() {
    return emailVerified;
  }
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getKycComplete() {
    return kycComplete;
  }
  public void setKycComplete(Boolean kycComplete) {
    this.kycComplete = kycComplete;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getBtcEarned() {
    return btcEarned;
  }
  public void setBtcEarned(Long btcEarned) {
    this.btcEarned = btcEarned;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Long getFiatEarned() {
    return fiatEarned;
  }
  public void setFiatEarned(Long fiatEarned) {
    this.fiatEarned = fiatEarned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccRefData succRefData = (SuccRefData) o;
    return (refPercent == null ? succRefData.refPercent == null : refPercent.equals(succRefData.refPercent)) &&
        (time == null ? succRefData.time == null : time.equals(succRefData.time)) &&
        (refID == null ? succRefData.refID == null : refID.equals(succRefData.refID)) &&
        (emailVerified == null ? succRefData.emailVerified == null : emailVerified.equals(succRefData.emailVerified)) &&
        (kycComplete == null ? succRefData.kycComplete == null : kycComplete.equals(succRefData.kycComplete)) &&
        (btcEarned == null ? succRefData.btcEarned == null : btcEarned.equals(succRefData.btcEarned)) &&
        (fiatEarned == null ? succRefData.fiatEarned == null : fiatEarned.equals(succRefData.fiatEarned));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (refPercent == null ? 0: refPercent.hashCode());
    result = 31 * result + (time == null ? 0: time.hashCode());
    result = 31 * result + (refID == null ? 0: refID.hashCode());
    result = 31 * result + (emailVerified == null ? 0: emailVerified.hashCode());
    result = 31 * result + (kycComplete == null ? 0: kycComplete.hashCode());
    result = 31 * result + (btcEarned == null ? 0: btcEarned.hashCode());
    result = 31 * result + (fiatEarned == null ? 0: fiatEarned.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccRefData {\n");
    
    sb.append("  refPercent: ").append(refPercent).append("\n");
    sb.append("  time: ").append(time).append("\n");
    sb.append("  refID: ").append(refID).append("\n");
    sb.append("  emailVerified: ").append(emailVerified).append("\n");
    sb.append("  kycComplete: ").append(kycComplete).append("\n");
    sb.append("  btcEarned: ").append(btcEarned).append("\n");
    sb.append("  fiatEarned: ").append(fiatEarned).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
