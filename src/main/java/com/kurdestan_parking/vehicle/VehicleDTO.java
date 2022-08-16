package com.kurdestan_parking.vehicle;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;



@Data
public class VehicleDTO {

    @ApiModelProperty(required = false,hidden = true)
    private Long id;



    @ApiModelProperty(required = true,hidden = false)

    private String pelak;

    @ApiModelProperty(required = true,hidden = false)

    private TejaSavari tejaSavari;
















}
