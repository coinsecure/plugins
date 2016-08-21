package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.FiatWithData;
import java.util.List;
@Canonical
class FiatWithDataResponse {

  /* true */
  Boolean success = false

    List<FiatWithData> message = new ArrayList<FiatWithData>()

    String method = null

    String title = null

    Date time = null
  

}

