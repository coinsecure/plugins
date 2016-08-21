package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.OrderData;
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

