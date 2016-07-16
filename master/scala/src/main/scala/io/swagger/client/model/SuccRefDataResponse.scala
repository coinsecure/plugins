package io.swagger.client.model

import org.joda.time.DateTime



case class SuccRefDataResponse (
  /* true */
  success: Boolean,
message: List[SuccRefData],
method: String,
title: String,
time: DateTime)
