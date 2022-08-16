package com.kurdestan_parking.parking;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.VehicleMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",uses = {VehicleMapper.class})
public interface ParkingMapper  {


    Parking toParking(ParkingDTO parkingDTO);
    Parking toParkingDTO(Parking parking);

    List<ParkingDTO> toParkingDTOs(List<Parking> parkingList);

//date darm baladesh nistam.

}
