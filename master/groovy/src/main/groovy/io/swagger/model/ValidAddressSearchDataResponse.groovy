package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ValidAddressSearchData;
import java.util.Date;
@Canonical
class ValidAddressSearchDataResponse {

  /* true */
  Boolean success = false

    ValidAddressSearchData message = null

    String method = null

    String title = null

    Date time = null
  

}

