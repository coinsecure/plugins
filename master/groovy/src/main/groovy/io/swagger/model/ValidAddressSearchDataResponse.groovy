package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Date;
import io.swagger.model.ValidAddressSearchData;
@Canonical
class ValidAddressSearchDataResponse {

  /* true */
  Boolean success = false

    ValidAddressSearchData message = null

    String method = null

    String title = null

    Date time = null
  

}

