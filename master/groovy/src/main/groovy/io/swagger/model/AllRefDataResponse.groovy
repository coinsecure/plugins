package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AllRefData;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import java.util.List;
@Canonical
class AllRefDataResponse {

  /* true */
  Boolean success = false

    List<AllRefData> message = new ArrayList<AllRefData>()

    String method = null

    String title = null

    Date time = null
  

}

