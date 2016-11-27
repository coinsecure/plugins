package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.RateVolTimeTypeData;
import java.util.List;
@Canonical
class RateVolTimeTypeDataResponse {

  /* true */
  Boolean success = false

    List<RateVolTimeTypeData> message = new ArrayList<RateVolTimeTypeData>()

    String method = null

    String title = null

    Date time = null
  

}

