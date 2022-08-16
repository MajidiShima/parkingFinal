package com.kurdestan_parking.vehicle;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "Spring")

public interface VehicleMapper {
    Vehicle toVehicleDto(VehicleDTO vehicleDTO);


    VehicleDTO toVehicle(VehicleDTO vehicleDTO);

    List<Vehicle> toVehicleList(List<VehicleDTO> vehicleDTOS);


}