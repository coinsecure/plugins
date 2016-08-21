package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.KYCData;
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

