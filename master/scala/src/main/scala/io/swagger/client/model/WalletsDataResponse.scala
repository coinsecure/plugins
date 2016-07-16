package io.swagger.client.model

import org.joda.time.DateTime



case class WalletsDataResponse (
  /* true */
  success: Boolean,
message: List[WalletsData],
method: String,
title: String,
time: DateTime)
