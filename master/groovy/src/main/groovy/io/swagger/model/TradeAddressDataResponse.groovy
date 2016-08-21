package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.TradeAddressData;
import java.util.List;
@Canonical
class TradeAddressDataResponse {

  /* true */
  Boolean success = false

    List<TradeAddressData> message = new ArrayList<TradeAddressData>()

    String method = null

    String title = null

    Date time = null
  

}

