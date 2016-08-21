package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.FiatBankData;
import java.util.List;
@Canonical
class FiatBankDataResponse {

  /* true */
  Boolean success = false

    List<FiatBankData> message = new ArrayList<FiatBankData>()

    String method = null

    String title = null

    Date time = null
  

}

