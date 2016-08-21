package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class WalletSummaryData {

    Long walletConfirmedBalance = null

    Long walletUncofirmedBalance = null

    Boolean hasWalletNetki = false

    String walletNetki = null

    String walletNetkiAddress = null

    String walletNetkiWalletId = null
  

}

