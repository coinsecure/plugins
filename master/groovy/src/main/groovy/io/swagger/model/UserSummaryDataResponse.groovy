package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.UserSummaryData;
@Canonical
class UserSummaryDataResponse {

  /* true */
  Boolean success = false

    UserSummaryData message = null

    String method = null

    String title = null

    Date time = null
  

}

