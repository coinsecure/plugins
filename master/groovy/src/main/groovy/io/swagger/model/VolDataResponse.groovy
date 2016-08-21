package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.VolData;
@Canonical
class VolDataResponse {

  /* true */
  Boolean success = false

    VolData message = null

    String method = null

    String title = null

    Date time = null
  

}

