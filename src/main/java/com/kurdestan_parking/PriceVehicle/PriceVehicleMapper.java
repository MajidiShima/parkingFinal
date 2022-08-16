package com.kurdestan_parking.PriceVehicle;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.parking.ParkingDTO;
import com.kurdestan_parking.vehicle.VehicleMapper;
import org.mapstruct.Mapper;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Mapper(componentModel = "spring",uses = {VehicleMapper.class, PostMapping.class})
public interface PriceVehicleMapper {


    PriceVehicle toPriceVehicle(PriceVehicleDTO priceVehicleDTO);
    PriceVehicleDTO toPriceVehicleDTO(PriceVehicle priceVehicle);

    List<PriceVehicleDTO> toPriceVehicleDTOs(List<PriceVehicle> priceVehicleList);



}
