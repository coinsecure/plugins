package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.SuccessTickerResponse;
@Canonical
class StandardTickerResultData {

  /* true */
  Boolean success = false

    SuccessTickerResponse message = null

    String method = null

    String title = null

    Date time = null
  

}

