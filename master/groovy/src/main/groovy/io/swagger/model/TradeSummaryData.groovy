package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class TradeSummaryData {

    Long completedAsksSum = null

    Long completedBidsSum = null

    Long completedAsksCount = null

    Long completedBidsCount = null

    Long pendingAsksCount = null

    Long pendingBidsCount = null
  

}

