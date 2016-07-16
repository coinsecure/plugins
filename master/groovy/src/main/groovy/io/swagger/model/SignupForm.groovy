package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SignupForm {

    String name = null

    String email = null

    String password = null

    String repeatPassword = null

    String refID = null
  

}

