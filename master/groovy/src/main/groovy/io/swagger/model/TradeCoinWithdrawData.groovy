package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeData;
@Canonical
class TradeCoinWithdrawData {

    TimeData timeDetails = null

    String address = null

    Long value = null

    Long fees = null

    String withdrawID = null

    String txHash = null
  

}

