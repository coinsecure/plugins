package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WalletAddressData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Canonical
class WalletAddressDataResponse {

  /* true */
  Boolean success = false

    List<WalletAddressData> message = new ArrayList<WalletAddressData>()

    String method = null

    String title = null

    Date time = null
  

}

