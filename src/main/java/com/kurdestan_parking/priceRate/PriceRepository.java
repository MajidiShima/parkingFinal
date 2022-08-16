package com.kurdestan_parking.priceRate;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.Vehicle;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface PriceRepository extends PagingAndSortingRepository<Price,Long> {




}
