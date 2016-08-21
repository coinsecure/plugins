package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.WalletAddressData;
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

