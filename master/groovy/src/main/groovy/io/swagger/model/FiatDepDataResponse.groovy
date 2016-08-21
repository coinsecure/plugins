package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.FiatDepData;
import java.util.List;
@Canonical
class FiatDepDataResponse {

  /* true */
  Boolean success = false

    List<FiatDepData> message = new ArrayList<FiatDepData>()

    String method = null

    String title = null

    Date time = null
  

}

