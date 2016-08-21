package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.RateData;
@Canonical
class RateDataResponse {

  /* true */
  Boolean success = false

    RateData message = null

    String method = null

    String title = null

    Date time = null
  

}

