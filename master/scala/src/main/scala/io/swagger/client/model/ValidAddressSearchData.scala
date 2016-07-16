package io.swagger.client.model




case class ValidAddressSearchData (
  address: String,
balance: Long,
totalReceived: Long,
unconfirmedBalance: Long,
unconfirmedTxApperances: Integer,
txApperances: Integer,
transactions: List[String])
