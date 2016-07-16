package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class WalletAddressData {

    String walletID = null

    String address = null

    Long time = null

    String info = null

    Integer minConf = null

    String netki = null
  

}

