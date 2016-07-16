package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class FiatBankData {

    Long time = null

    String status = null

    Long updateTime = null

    String updateMessage = null

    String bankID = null

    String info = null

    String accountNumber = null

    String accountNick = null

    String accountType = null
  

}

