package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.SuccCoinRefData;
import java.util.List;
@Canonical
class SuccCoinRefDataResponse {

  /* true */
  Boolean success = false

    List<SuccCoinRefData> message = new ArrayList<SuccCoinRefData>()

    String method = null

    String title = null

    Date time = null
  

}

