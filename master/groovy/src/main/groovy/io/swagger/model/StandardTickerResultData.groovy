package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.SuccessTickerResponse;
import java.util.Date;
@Canonical
class StandardTickerResultData {

  /* true */
  Boolean success = false

    SuccessTickerResponse message = null

    String method = null

    String title = null

    Date time = null
  

}

