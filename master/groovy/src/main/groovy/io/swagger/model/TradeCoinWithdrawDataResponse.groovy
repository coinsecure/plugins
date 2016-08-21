package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.TradeCoinWithdrawData;
import java.util.List;
@Canonical
class TradeCoinWithdrawDataResponse {

  /* true */
  Boolean success = false

    List<TradeCoinWithdrawData> message = new ArrayList<TradeCoinWithdrawData>()

    String method = null

    String title = null

    Date time = null
  

}

