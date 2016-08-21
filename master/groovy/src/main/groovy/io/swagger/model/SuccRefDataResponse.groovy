package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.SuccRefData;
import java.util.List;
@Canonical
class SuccRefDataResponse {

  /* true */
  Boolean success = false

    List<SuccRefData> message = new ArrayList<SuccRefData>()

    String method = null

    String title = null

    Date time = null
  

}

