package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SuccRefData {

    Double refPercent = null

    Long time = null

    String refID = null

    Boolean emailVerified = false

    Boolean kycComplete = false

    Long btcEarned = null

    Long fiatEarned = null
  

}

