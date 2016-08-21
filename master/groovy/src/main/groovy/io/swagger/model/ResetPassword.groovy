package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ResetPassword {

    String token = null

    String password = null

    String repeatPassword = null
  

}

