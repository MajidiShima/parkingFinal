package com.kurdestan_parking.parking;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.Vehicle;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;
import java.util.List;

public interface ParkingRepository extends PagingAndSortingRepository<Parking,Long> {

    List<Parking> findAllByVehicle(Vehicle vehicle);
    Long findDistinctByExitTimeAndRate(Date from,Date to);//blad nistam piade sazi konm



}
