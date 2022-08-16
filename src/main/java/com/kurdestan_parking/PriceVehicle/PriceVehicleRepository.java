package com.kurdestan_parking.PriceVehicle;


import com.kurdestan_parking.priceRate.Price;
import com.kurdestan_parking.vehicle.Vehicle;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PriceVehicleRepository extends PagingAndSortingRepository<PriceVehicle, Long> {

List<PriceVehicle> findAllByPrice(Price price);
List<PriceVehicle> findAllByVehicle(PriceVehicle vehicle);


}
