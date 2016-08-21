package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SuccessLoginResponse {

    Boolean success = false

    String email = null

    String message = null

    String keyType = null

    String keyNeeded = null
  

}

