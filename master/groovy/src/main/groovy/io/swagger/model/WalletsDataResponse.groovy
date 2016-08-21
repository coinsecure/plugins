package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.Date;
import io.swagger.model.WalletsData;
import java.util.List;
@Canonical
class WalletsDataResponse {

  /* true */
  Boolean success = false

    List<WalletsData> message = new ArrayList<WalletsData>()

    String method = null

    String title = null

    Date time = null
  

}

