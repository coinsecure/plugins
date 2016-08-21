package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BankSummaryData;
import io.swagger.model.Date;
@Canonical
class BankSummaryDataResponse {

  /* true */
  Boolean success = false

    BankSummaryData message = null

    String method = null

    String title = null

    Date time = null
  

}

