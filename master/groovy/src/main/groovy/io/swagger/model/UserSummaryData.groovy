package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class UserSummaryData {

    String kycStatus = null

    String bankLinkStatus = null

    String tradeReady = null

    Boolean isDisabledAccount = false

    String faSecure = null

    String hasPhone = null
  

}

