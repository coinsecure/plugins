package io.swagger.client.model

import org.joda.time.DateTime



case class RateVolDataResponse (
  /* true */
  success: Boolean,
message: List[RateVolData],
method: String,
title: String,
time: DateTime)
