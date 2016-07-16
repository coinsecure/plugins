package io.swagger.client.model

import org.joda.time.DateTime



case class FiatBankDataResponse (
  /* true */
  success: Boolean,
message: List[FiatBankData],
method: String,
title: String,
time: DateTime)
