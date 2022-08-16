package com.kurdestan_parking.PriceVehicle;


import com.kurdestan_parking.priceRate.PriceDTO;
import com.kurdestan_parking.vehicle.VehicleDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PriceVehicleDTO {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;


    @ApiModelProperty(required = false,hidden = false)
    private PriceDTO Price;


    @ApiModelProperty(required = false,hidden = false)
    private VehicleDTO vehicle;
}
