package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WalletSummaryData;
import java.util.Date;
@Canonical
class WalletSummaryDataResponse {

  /* true */
  Boolean success = false

    WalletSummaryData message = null

    String method = null

    String title = null

    Date time = null
  

}
