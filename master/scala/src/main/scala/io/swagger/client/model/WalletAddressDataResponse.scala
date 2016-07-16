package io.swagger.client.model

import org.joda.time.DateTime



case class WalletAddressDataResponse (
  /* true */
  success: Boolean,
message: List[WalletAddressData],
method: String,
title: String,
time: DateTime)
