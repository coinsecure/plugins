package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.SuccessOrderData;
@Canonical
class SuccessOrderDataResponse {

  /* true */
  Boolean success = false

    SuccessOrderData message = null

    String method = null

    String title = null

    Date time = null
  

}

