package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class SendCoin {

    Long satoshis = null

    String toAddr = null

    String msg = null

    String pin = null
  

}

