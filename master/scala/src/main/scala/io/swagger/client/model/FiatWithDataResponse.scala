package io.swagger.client.model

import org.joda.time.DateTime



case class FiatWithDataResponse (
  /* true */
  success: Boolean,
message: List[FiatWithData],
method: String,
title: String,
time: DateTime)
