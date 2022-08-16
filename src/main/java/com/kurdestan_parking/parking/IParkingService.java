package com.kurdestan_parking.parking;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.Vehicle;

import java.util.Date;
import java.util.List;

public interface IParkingService {

    Parking save(Parking parking);

    List<Parking> getAll();

    List<Parking> findAllByVehicle(Vehicle vehicle);

    Long findDistinctByExitTimeAndRate(Date from, Date to);


}
