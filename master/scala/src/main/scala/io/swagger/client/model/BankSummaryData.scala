package io.swagger.client.model




case class BankSummaryData (
  pendingCoinBalance: Long,
pendingFiatBalance: Long,
availableCoinBalance: Long,
availableFiatBalance: Long,
totalCoinBalance: Long,
totalFiatBalance: Long,
coinFeePercentage: Double,
fiatFeePercentage: Double,
bankLinkStatus: String,
hasTradeNetki: Boolean,
tradeNetkiName: String,
tradeNetkiAddress: String)
