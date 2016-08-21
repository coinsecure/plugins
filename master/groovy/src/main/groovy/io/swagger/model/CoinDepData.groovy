package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeDataCoin;
@Canonical
class CoinDepData {

    TimeDataCoin timeDetails = null

    String address = null

    Long value = null

    String txHash = null

    String depositID = null

    String reason = null
  

}

