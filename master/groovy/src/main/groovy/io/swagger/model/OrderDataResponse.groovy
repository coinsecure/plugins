package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OrderData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Canonical
class OrderDataResponse {

  /* true */
  Boolean success = false

    List<OrderData> message = new ArrayList<OrderData>()

    String method = null

    String title = null

    Date time = null
  

}

