package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConfirmData;
import io.swagger.model.Date;
@Canonical
class ConfirmDataResponse {

  /* true */
  Boolean success = false

    ConfirmData message = null

    String method = null

    String title = null

    Date time = null
  

}

