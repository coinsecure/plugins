package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class BankSummaryData {

    Long pendingCoinBalance = null

    Long pendingFiatBalance = null

    Long availableCoinBalance = null

    Long availableFiatBalance = null

    Long totalCoinBalance = null

    Long totalFiatBalance = null

    Double coinFeePercentage = null

    Double fiatFeePercentage = null

    String bankLinkStatus = null

    Boolean hasTradeNetki = false

    String tradeNetkiName = null

    String tradeNetkiAddress = null
  

}

