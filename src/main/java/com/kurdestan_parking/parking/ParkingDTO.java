package com.kurdestan_parking.parking;


import com.kurdestan_parking.vehicle.Vehicle;
import com.kurdestan_parking.vehicle.VehicleDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

@Data
public class ParkingDTO {
    @ApiModelProperty(required = false,hidden = true)
    private Long id;


    @ApiModelProperty(required = false,hidden = false)
    private Date time;

    @ApiModelProperty(required = false,hidden = false)
    private Long rate;


    @ApiModelProperty(required = false,hidden = false)
    private VehicleDTO vehicle;
}
