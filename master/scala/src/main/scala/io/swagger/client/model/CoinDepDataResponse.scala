package io.swagger.client.model

import org.joda.time.DateTime



case class CoinDepDataResponse (
  /* true */
  success: Boolean,
message: List[CoinDepData],
method: String,
title: String,
time: DateTime)
