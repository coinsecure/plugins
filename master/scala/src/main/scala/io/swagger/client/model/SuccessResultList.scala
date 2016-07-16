package io.swagger.client.model

import org.joda.time.DateTime



case class SuccessResultList (
  /* true */
  success: Boolean,
message: List[String],
method: String,
title: String,
time: DateTime)
