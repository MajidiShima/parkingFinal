package com.kurdestan_parking.priceRate;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public interface IPriceService {


    Price save(Price price);

    List<Price> getAll();

    Price getById(Long id);



}
