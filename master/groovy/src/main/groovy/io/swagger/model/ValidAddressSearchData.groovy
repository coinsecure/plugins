package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
@Canonical
class ValidAddressSearchData {

    String address = null

    Long balance = null

    Long totalReceived = null

    Long unconfirmedBalance = null

    Integer unconfirmedTxApperances = null

    Integer txApperances = null

    List<String> transactions = new ArrayList<String>()
  

}

