package io.swagger.client.model

import org.joda.time.DateTime



case class FiatDepDataResponse (
  /* true */
  success: Boolean,
message: List[FiatDepData],
method: String,
title: String,
time: DateTime)
