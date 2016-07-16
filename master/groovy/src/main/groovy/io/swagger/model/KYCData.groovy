package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TimeKYCData;
@Canonical
class KYCData {

    TimeKYCData timeDetails = null

    String kycID = null

    String firstName = null

    String lastName = null

    String status = null

    String userType = null

    String info = null
  

}

