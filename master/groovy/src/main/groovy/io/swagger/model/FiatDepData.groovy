package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeDataCoin;
@Canonical
class FiatDepData {

    TimeDataCoin timeDetails = null

    String depositID = null

    Long value = null

    String account = null

    String reason = null
  

}

