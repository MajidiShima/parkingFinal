package com.kurdestan_parking.priceRate;


import com.kurdestan_parking.vehicle.VehicleDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class PriceDTO {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;

    @ApiModelProperty(required = false,hidden = false)
    private Long rate;
}
