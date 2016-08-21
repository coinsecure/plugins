package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.WalletCoinWithdrawData;
import java.util.List;
@Canonical
class WalletCoinWithdrawDataResponse {

  /* true */
  Boolean success = false

    List<WalletCoinWithdrawData> message = new ArrayList<WalletCoinWithdrawData>()

    String method = null

    String title = null

    Date time = null
  

}

