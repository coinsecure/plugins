package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeDataCoin;
@Canonical
class FiatWithData {

    TimeDataCoin timeDetails = null

    String withdrawID = null

    Long value = null

    String account = null

    String reason = null
  

}

