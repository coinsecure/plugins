package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WalletCoinWithdrawData;
import java.util.ArrayList;
import java.util.Date;
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

