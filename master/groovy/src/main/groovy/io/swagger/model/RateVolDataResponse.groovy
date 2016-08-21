package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.RateVolData;
import java.util.List;
@Canonical
class RateVolDataResponse {

  /* true */
  Boolean success = false

    List<RateVolData> message = new ArrayList<RateVolData>()

    String method = null

    String title = null

    Date time = null
  

}

