package io.swagger.client.model

import org.joda.time.DateTime



case class OrderDataResponse (
  /* true */
  success: Boolean,
message: List[OrderData],
method: String,
title: String,
time: DateTime)
