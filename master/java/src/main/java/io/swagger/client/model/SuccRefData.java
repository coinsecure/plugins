package io.swagger.client.model;

import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * SuccRefData
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-07-17T03:26:03.328Z")
public class SuccRefData   {
  
  private Double refPercent = null;
  private Long time = null;
  private String refID = null;
  private Boolean emailVerified = false;
  private Boolean kycComplete = false;
  private Long btcEarned = null;
  private Long fiatEarned = null;

  
  /**
   **/
  public SuccRefData refPercent(Double refPercent) {
    this.refPercent = refPercent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refPercent")
  public Double getRefPercent() {
    return refPercent;
  }
  public void setRefPercent(Double refPercent) {
    this.refPercent = refPercent;
  }


  /**
   **/
  public SuccRefData time(Long time) {
    this.time = time;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("time")
  public Long getTime() {
    return time;
  }
  public void setTime(Long time) {
    this.time = time;
  }


  /**
   **/
  public SuccRefData refID(String refID) {
    this.refID = refID;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("refID")
  public String getRefID() {
    return refID;
  }
  public void setRefID(String refID) {
    this.refID = refID;
  }


  /**
   **/
  public SuccRefData emailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("emailVerified")
  public Boolean getEmailVerified() {
    return emailVerified;
  }
  public void setEmailVerified(Boolean emailVerified) {
    this.emailVerified = emailVerified;
  }


  /**
   **/
  public SuccRefData kycComplete(Boolean kycComplete) {
    this.kycComplete = kycComplete;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("kycComplete")
  public Boolean getKycComplete() {
    return kycComplete;
  }
  public void setKycComplete(Boolean kycComplete) {
    this.kycComplete = kycComplete;
  }


  /**
   **/
  public SuccRefData btcEarned(Long btcEarned) {
    this.btcEarned = btcEarned;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("btcEarned")
  public Long getBtcEarned() {
    return btcEarned;
  }
  public void setBtcEarned(Long btcEarned) {
    this.btcEarned = btcEarned;
  }


  /**
   **/
  public SuccRefData fiatEarned(Long fiatEarned) {
    this.fiatEarned = fiatEarned;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("fiatEarned")
  public Long getFiatEarned() {
    return fiatEarned;
  }
  public void setFiatEarned(Long fiatEarned) {
    this.fiatEarned = fiatEarned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SuccRefData succRefData = (SuccRefData) o;
    return Objects.equals(this.refPercent, succRefData.refPercent) &&
        Objects.equals(this.time, succRefData.time) &&
        Objects.equals(this.refID, succRefData.refID) &&
        Objects.equals(this.emailVerified, succRefData.emailVerified) &&
        Objects.equals(this.kycComplete, succRefData.kycComplete) &&
        Objects.equals(this.btcEarned, succRefData.btcEarned) &&
        Objects.equals(this.fiatEarned, succRefData.fiatEarned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refPercent, time, refID, emailVerified, kycComplete, btcEarned, fiatEarned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccRefData {\n");
    
    sb.append("    refPercent: ").append(toIndentedString(refPercent)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    refID: ").append(toIndentedString(refID)).append("\n");
    sb.append("    emailVerified: ").append(toIndentedString(emailVerified)).append("\n");
    sb.append("    kycComplete: ").append(toIndentedString(kycComplete)).append("\n");
    sb.append("    btcEarned: ").append(toIndentedString(btcEarned)).append("\n");
    sb.append("    fiatEarned: ").append(toIndentedString(fiatEarned)).append("\n");
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

