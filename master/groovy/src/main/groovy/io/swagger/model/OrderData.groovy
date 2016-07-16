package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class OrderData {

    Long time = null

    Long rate = null

    Long vol = null

    String orderID = null

    String status = null
  

}

