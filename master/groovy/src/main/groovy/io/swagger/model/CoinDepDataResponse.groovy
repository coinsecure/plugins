package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.CoinDepData;
import io.swagger.model.Date;
import java.util.List;
@Canonical
class CoinDepDataResponse {

  /* true */
  Boolean success = false

    List<CoinDepData> message = new ArrayList<CoinDepData>()

    String method = null

    String title = null

    Date time = null
  

}

