package io.swagger.model;

import groovy.transform.Canonical
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.KYCData;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Canonical
class KYCDataResponse {

  /* true */
  Boolean success = false

    List<KYCData> message = new ArrayList<KYCData>()

    String method = null

    String title = null

    Date time = null
  

}

