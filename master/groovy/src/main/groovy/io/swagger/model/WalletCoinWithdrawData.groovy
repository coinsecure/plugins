package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeData;
@Canonical
class WalletCoinWithdrawData {

    TimeData timeDetails = null

    String txID = null

    String message = null

    Long satoshis = null

    String walletID = null

    String withdrawID = null

    String sentTo = null
  

}

