package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.VolData;
import java.util.Date;
@Canonical
class VolDataResponse {

  /* true */
  Boolean success = false

    VolData message = null

    String method = null

    String title = null

    Date time = null
  

}

