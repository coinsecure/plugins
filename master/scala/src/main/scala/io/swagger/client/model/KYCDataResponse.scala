package io.swagger.client.model

import org.joda.time.DateTime



case class KYCDataResponse (
  /* true */
  success: Boolean,
message: List[KYCData],
method: String,
title: String,
time: DateTime)
