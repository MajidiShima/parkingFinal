package com.kurdestan_parking.priceRate;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.parking.ParkingDTO;
import com.kurdestan_parking.vehicle.VehicleMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceMapper {


    Price toPrice(PriceDTO priceDTO);

    PriceDTO toPriceDTO(Price price);

    List<PriceDTO> toPriceDTOs(List<Price> prices);
}
